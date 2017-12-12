package com.tactfactory.spring.entity;

import com.tactfactory.spring.CompositePK.OrderProductCompositePK;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "order_product")
public class OrderProduct implements Serializable {

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "id_order.order", column = @Column(name = "id_order")),
            @AttributeOverride(name = "id_product.product", column = @Column(name = "id_product")) })
    private OrderProductCompositePK id_order_product;

    public OrderProduct() {
    }

    public OrderProduct(Order order,Product product) {
        id_order_product = new OrderProductCompositePK(order, product);
    }
}
