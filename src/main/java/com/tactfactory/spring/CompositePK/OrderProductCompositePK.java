package com.tactfactory.spring.CompositePK;

import com.tactfactory.spring.entity.Order;
import com.tactfactory.spring.entity.Product;

import javax.persistence.EmbeddedId;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class OrderProductCompositePK implements Serializable{

    @ManyToOne
    private Order order;

    @ManyToOne
    private Product product;

    public OrderProductCompositePK(Order order, Product product) {
        this.order = order;
        this.product = product;
    }

    public OrderProductCompositePK() {
    }
}
