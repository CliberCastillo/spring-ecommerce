package com.Ecommerce.infrastructure.crud;

import com.Ecommerce.infrastructure.entity.Productos;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Productos,Integer> {
}
