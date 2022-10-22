package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.FranquiaDTO;
import com.entra21.primeiroprojetospring.model.dto.FranquiaPayloadDTO;
import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import com.entra21.primeiroprojetospring.view.repository.FranquiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FranquiaService {

    @Autowired
    private FranquiaRepository franquiaRepository;


   // @GetMapping
    public List<FranquiaDTO> getAll(){
        return franquiaRepository.findAll().stream().map(fr -> {
            FranquiaDTO dto = new FranquiaDTO();
            dto.setId((fr.getId()));
            dto.setNome(fr.getNome());
            return dto;
        }).collect(Collectors.toList());
    }

   // @GetMapping("/{id}")
    public ResponseEntity<FranquiaDTO> getFranquia(Long id) {
        Optional<FranquiaEntity> franquia = franquiaRepository.findById(id);
        return franquia.map(fr -> {
            FranquiaDTO dto = new FranquiaDTO();
            dto.setId((fr.getId()));
            dto.setNome(fr.getNome());
            return dto;
        }).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

   // @PostMapping
    public void addFranquia(FranquiaPayloadDTO nome){
        FranquiaPayloadDTO payloadDTO = new FranquiaPayloadDTO();
        payloadDTO.setNome(nome.getNome());
    }

    public void deleteFranquia(Long id){
        franquiaRepository.deleteById(id);
    }

    public FranquiaDTO updateFranquia(Long id, String novoNome){
        FranquiaEntity e = franquiaRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        e.setNome(novoNome);
        e = franquiaRepository.save(e);
        FranquiaDTO dto = new FranquiaDTO();
        dto.setId((e.getId()));
        dto.setNome(e.getNome());
        return dto;
    }

}
