package com.entra21.primeiroprojetospring.view.service;
import com.entra21.primeiroprojetospring.model.dto.GeneroDTO;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import com.entra21.primeiroprojetospring.view.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;


    // @GetMapping
    public List<GeneroDTO> getAll(){
        return generoRepository.findAll().stream().map(ge -> {
            GeneroDTO dto = new GeneroDTO();
            dto.setId((ge.getId()));
            dto.setNome(ge.getNome());
            return dto;
        }).collect(Collectors.toList());
    }

    // @GetMapping("/{id}")
    public ResponseEntity<GeneroDTO> getGenero(Long id) {
        Optional<GeneroEntity> genero = generoRepository.findById(id);
        return genero.map(ge -> {
            GeneroDTO dto = new GeneroDTO();
            dto.setId((ge.getId()));
            dto.setNome(ge.getNome());
            return dto;
        }).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // @PostMapping
    public void addGenero(GeneroDTO nome){
        GeneroDTO dto = new GeneroDTO();
        dto.setNome(nome.getNome());
    }

    public void deleteGenero(Long id){
        generoRepository.deleteById(id);
    }

    public GeneroDTO genero(Long id, String novoGenero){
        GeneroEntity e = generoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        e.setNome(novoGenero);
        e = generoRepository.save(e);
        GeneroDTO dto = new GeneroDTO();
        dto.setId((e.getId()));
        dto.setNome(e.getNome());
        return dto;
    }
}
