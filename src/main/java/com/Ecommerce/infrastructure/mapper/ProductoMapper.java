package com.Ecommerce.infrastructure.mapper;

import com.Ecommerce.domain.entity.Producto;
import com.Ecommerce.infrastructure.entity.Productos;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoriaMapper.class})
public interface ProductoMapper {
    @Mappings({
            @Mapping(source = "idProducto", target = "idProducto"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "idCategoria", target = "idCategoria"),
            @Mapping(source = "precioVenta", target = "precioVenta"),
            @Mapping(source = "cantidadStock", target = "cantidadStock"),
            @Mapping(source = "estado", target = "estado"),
    })
    Producto ToProducto(Productos productos);

    List<Producto> ToProductos(List<Productos> productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true )
    Productos ToProductos(Producto producto);

}
