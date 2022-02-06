package com.Ecommerce.presentation.controller;

import com.Ecommerce.domain.entity.Producto;
import com.Ecommerce.domain.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    public List<Producto> GetAll(){
        return productoService.GetAll();
    }
    public Optional<Producto> GetById(int idProducto){
        return productoService.GetById(idProducto);
    }
    public Producto Save(Producto product){
        return productoService.Save(product);
    }
    public boolean Delete(int productId){
        return productoService.Delete(productId);
    }
}
