package com.bedu.servicioinventario.controller;

import com.bedu.servicioinventario.dto.InventarioDTO;
import com.bedu.servicioinventario.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("inventario")
public class InventarioController {

    @Autowired
    private InventarioService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventarioDTO> findAll() {
        return service.findAll();
    }
}
