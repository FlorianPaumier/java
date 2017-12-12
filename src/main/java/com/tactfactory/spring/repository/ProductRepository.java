package com.tactfactory.spring.repository;

import com.tactfactory.spring.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
