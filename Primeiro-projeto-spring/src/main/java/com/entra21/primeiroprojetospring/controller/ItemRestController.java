package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.ItemDTO;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import com.entra21.primeiroprojetospring.model.entity.ItemEntity;
import com.entra21.primeiroprojetospring.view.repository.GeneroRepository;
import com.entra21.primeiroprojetospring.view.repository.ItemRepository;
import com.entra21.primeiroprojetospring.view.service.ItemService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/itens")
public class ItemRestController {


    @Autowired
    private ItemService itemService;


    @GetMapping
    public List<ItemDTO> getAll(
            @RequestParam(name = "idGenero", required = false) Long idGenero){
        return itemService.getAll(idGenero);
    }



//    @GetMapping("/{id}")
//    public ResponseEntity<ItemDTO> getItem(Long id){
//        return itemRepository.findById();
//    }



}
