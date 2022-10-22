package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.GeneroDTO;
import com.entra21.primeiroprojetospring.model.dto.ItemDTO;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import com.entra21.primeiroprojetospring.model.entity.ItemEntity;
import com.entra21.primeiroprojetospring.view.repository.ItemRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<ItemDTO> getAll(Long idGenero){
        List<ItemEntity> list;
        if (idGenero != null) {
            list = itemRepository.findAllByGeneros_Id(idGenero);
        } else {
            list = itemRepository.findAll();
        }
        return list.stream().map(it -> {
            ItemDTO dto = new ItemDTO();
            dto.setItemId((it.getItemId()));
            dto.setTitulo(it.getTitulo());
            dto.setEmprestado(it.getEmprestado());
            dto.setTipo(it.getType());
            return dto;
        }).collect(Collectors.toList());
    }



//    public ResponseEntity<ItemDTO> getItem(Long id) {
//        Optional<ItemEntity> item = itemRepository.findById(id);
//        return item.map(it -> {
//            ItemDTO dto = new ItemDTO();
//            dto.setItemId((it.getItemId()));
//            dto.setTitulo(it.getTitulo());
//            return dto;
//        }).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//    }

//
//    public void addItem(ItemDTO titulo){
//        ItemDTO dto = new ItemDTO();
//        dto.setTitulo(titulo.getTitulo());
//    }
//
//    public void deleteitem(Long id){
//        itemRepository.deleteById(id);
//    }
//
//    public ItemDTO item(Long id, String novoItem){
//        ItemEntity e = itemRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
//        e.setTitulo(novoItem);
//        e = itemRepository.save(e);
//        ItemDTO dto = new ItemDTO();
//        dto.setItemId(e.getItemId());
//        dto.setTitulo(e.getTitulo());
//        dto.setEmprestado(e.getEmprestado());
//        return dto;
//    }
}


