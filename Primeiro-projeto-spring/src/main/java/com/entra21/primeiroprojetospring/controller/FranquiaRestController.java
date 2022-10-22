package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.FranquiaDTO;
import com.entra21.primeiroprojetospring.model.dto.FranquiaPayloadDTO;
import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import com.entra21.primeiroprojetospring.view.repository.FranquiaRepository;
import com.entra21.primeiroprojetospring.view.service.FranquiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/franquias")
public class FranquiaRestController {

    @Autowired
    private FranquiaService franquiaService;


    @GetMapping
    public List<FranquiaDTO> getFranquias() {
        return franquiaService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FranquiaDTO> getFranquia(@PathVariable(name = "id") Long id) {
        return franquiaService.getFranquia(id);
    }


    @PostMapping
    public void addFranquia(@RequestBody FranquiaPayloadDTO payloadDTO) {
        franquiaService.addFranquia(payloadDTO);
    }


    @DeleteMapping("/{id}")
    public void deleteFranquia(@PathVariable(name = "id") Long id) {
        franquiaService.deleteFranquia(id);
    }

    @PutMapping("/{id}")
    public FranquiaDTO updateFranquia(@PathVariable(name = "id") Long id,
                                                      @RequestBody String novoNome) {
        return franquiaService.updateFranquia(id, novoNome);
    }
}
