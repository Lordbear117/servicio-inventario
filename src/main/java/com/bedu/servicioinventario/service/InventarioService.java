package com.bedu.servicioinventario.service;

import com.bedu.servicioinventario.dto.InventarioDTO;
import com.bedu.servicioinventario.mapper.InventarioMapper;
import com.bedu.servicioinventario.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository repository;

    @Autowired
    private InventarioMapper mapper;

    public List<InventarioDTO> findAll() {
        return repository
                .findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

}
