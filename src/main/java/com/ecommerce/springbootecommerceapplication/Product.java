package com.ecommerce.springbootecommerceapplication;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    private Long id;

    @Setter
    @NotBlank(message = "Name is required")
    private String name;

    @Setter
    @NotBlank(message = "Price is required")
    private short price;

    @Setter
    private Instant createdDate;

    @Setter
    private Instant modifiedDate;

    public Product() {}

    public Product(String name, short price) {
        this.name = name;
        this.price = price;
        this.createdDate = Instant.now();
        this.modifiedDate = Instant.now();
    }

    @Override
    public String toString() {
        return String.format("Product{id=%d, name='%s', price='%s', createdDate='%s', modifiedDate='%s'}",
                id, name, price, createdDate, modifiedDate);
    }


}