package com.entra21.primeiroprojetospring.model.dto;

import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import lombok.Data;

@Data
public class ItemDTO {
    private Long itemId;
    private String titulo;
    private Boolean emprestado;
    private String tipo;

}
