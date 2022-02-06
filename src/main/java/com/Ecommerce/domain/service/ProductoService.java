package com.Ecommerce.domain.service;

import com.Ecommerce.domain.entity.Producto;
import com.Ecommerce.domain.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    public List<Producto> GetAll(){
        return  productoRepository.GetAll();
    }
    public Optional<Producto> GetById(int idProducto){
        return productoRepository.GetById(idProducto);
    }
    public Producto Save(Producto product){
        return productoRepository.Save(product);
    }
    public boolean Delete(int productId){
        if(productoRepository.GetById(productId).isPresent()){
            productoRepository.Delete(productId);
            return true;
        }
        else{
            return false;
        }
    }
}
