package com.bedu.servicioinventario.repository;

import com.bedu.servicioinventario.model.Inventario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventarioRepository extends CrudRepository<Inventario, Long> {

    List<Inventario> findAll();
}
