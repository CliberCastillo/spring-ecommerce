package com.Ecommerce.infrastructure.repository;

import com.Ecommerce.domain.entity.Producto;
import com.Ecommerce.infrastructure.crud.ProductoCrudRepository;
import com.Ecommerce.infrastructure.entity.Productos;
import com.Ecommerce.infrastructure.mapper.ProductoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@EnableAutoConfiguration
public class ProductoRepository implements com.Ecommerce.domain.repository.ProductoRepository {

    @Autowired
    private ProductoCrudRepository productoCrudRepository;
    @Autowired
    private ProductoMapper productoMapper;

    @Override
    public List<Producto> GetAll() {
        List<Productos> lstProductos = (List<Productos>) productoCrudRepository.findAll();
        return productoMapper.ToProductos(lstProductos);
    }

    @Override
    public Optional<Producto> GetById(int idProducto) {
        return  productoCrudRepository.findById(idProducto).map(productos -> productoMapper.ToProducto(productos));
    }

    @Override
    public Producto Save(Producto product) {
        Productos productos = productoMapper.ToProductos(product);
        return productoMapper.ToProducto(productoCrudRepository.save(productos));
    }

    @Override
    public void Delete(int productId) {
        productoCrudRepository.deleteById(productId);
    }
}
