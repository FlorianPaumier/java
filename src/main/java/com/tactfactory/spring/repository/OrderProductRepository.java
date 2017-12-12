package com.tactfactory.spring.repository;

import com.tactfactory.spring.entity.OrderProduct;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, Long>{
}
