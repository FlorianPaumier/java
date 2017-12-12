package com.tactfactory.spring.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_product;

    @Column(name = "name_product")
    private String name_product;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "end_of_life")
    private boolean end_of_life;

    @Column(name = "price")
    private float price;

    @Column(name = "picturePath")
    private String picturePath;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isEnd_of_life() {
        return end_of_life;
    }

    public void setEnd_of_life(boolean end_of_life) {
        this.end_of_life = end_of_life;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Product(String name_product, String description, int quantity, boolean end_of_life,
                   float price, String picturePath) {
        this.name_product = name_product;
        this.description = description;
        this.quantity = quantity;
        this.end_of_life = end_of_life;
        this.price = price;
        this.picturePath = picturePath;
    }

    @PrePersist
    private void setDateCreation(){
        setCreated_at(new Date());
    }

    @PreUpdate void setDateUpdating(){
        setUpdated_at(new Date());
    }
}
