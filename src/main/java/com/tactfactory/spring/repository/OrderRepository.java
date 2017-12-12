package com.tactfactory.spring.repository;

import com.tactfactory.spring.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
