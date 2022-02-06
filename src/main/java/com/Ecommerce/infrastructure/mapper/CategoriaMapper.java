package com.Ecommerce.infrastructure.mapper;

import com.Ecommerce.domain.entity.Categoria;
import com.Ecommerce.infrastructure.entity.Categorias;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "idCategoria"),
            @Mapping(source = "descripcion", target = "descripcion"),
            @Mapping(source = "estado", target = "estado")
    })
    Categoria ToCategoria(Categorias categorias);

    @InheritInverseConfiguration
    Categorias ToCategorias(Categoria categoria);

}
