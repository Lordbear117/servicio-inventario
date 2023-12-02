package com.bedu.servicioinventario.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Entity
@Table(name = "inventario")
@AllArgsConstructor
@NoArgsConstructor
public class Inventario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(nullable = false, length = 100,name = "nombre")
    private String nombre;

    @Basic(optional = false)
    @Column(nullable = false,name = "descripcion")
    private String descripcion;

    @Basic(optional = false)
    @Column(nullable = false,name = "precio")
    private BigDecimal precio;

    @Basic(optional = false)
    @Column(nullable = false,name = "cantidad")
    private int cantidad;

    @Basic(optional = false)
    @Column(nullable = false,name = "categoria_id")
    private int categoria_id;
}
