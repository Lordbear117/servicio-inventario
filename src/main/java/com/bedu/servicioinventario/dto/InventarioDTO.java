package com.bedu.servicioinventario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InventarioDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private int cantidad;
    private int categoria_id;
}
