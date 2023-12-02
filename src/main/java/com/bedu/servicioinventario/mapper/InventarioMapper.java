package com.bedu.servicioinventario.mapper;

import com.bedu.servicioinventario.dto.InventarioDTO;
import com.bedu.servicioinventario.model.Inventario;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface InventarioMapper {
    InventarioDTO toDTO(Inventario model);

}
