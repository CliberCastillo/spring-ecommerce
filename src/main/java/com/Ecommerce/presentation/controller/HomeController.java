package com.Ecommerce.presentation.controller;

import com.Ecommerce.domain.entity.Producto;
import com.Ecommerce.domain.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/app")
public class HomeController {
    @Autowired
    private ProductoService productoService;
    @GetMapping()
    public List<Producto> Home(){
        return productoService.GetAll();
    }
}
