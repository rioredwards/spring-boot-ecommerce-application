package com.ecommerce.springbootecommerceapplication.repositories;

import com.ecommerce.springbootecommerceapplication.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
