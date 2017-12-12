package com.tactfactory.spring.entity;

import javax.persistence.*;
import javax.persistence.GenerationType;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_order;

    @Column(name="total")
    private float total;

    @ManyToOne
    private Customer customer;


    public Long getId_order() {
        return id_order;
    }

    public void setId_order(long id_order) {
        this.id_order = id_order;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order(float total, Customer customer) {
        this.total = total;
        this.customer = customer;
    }
}
