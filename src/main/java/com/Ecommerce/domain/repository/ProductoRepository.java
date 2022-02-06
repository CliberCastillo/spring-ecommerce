package com.Ecommerce.domain.repository;

import com.Ecommerce.domain.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository {
    List<Producto> GetAll();
    Optional<Producto> GetById(int idProducto);
    Producto Save(Producto product);
    void Delete(int productId);
}
