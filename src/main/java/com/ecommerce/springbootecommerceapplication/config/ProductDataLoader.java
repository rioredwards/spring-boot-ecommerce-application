package com.ecommerce.springbootecommerceapplication.config;

import com.ecommerce.springbootecommerceapplication.models.Product;
import com.ecommerce.springbootecommerceapplication.repositories.ProductRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductDataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(ProductDataLoader.class);

    @Autowired
    ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        loadSeedData();
    }

    private void loadSeedData() {
        if (productRepository.count() == 0) {
            Product product1 = new Product("milk");
            Product product2 = new Product("leaves");

            productRepository.save(product1);
            productRepository.save(product2);
        }

        logger.info("Number of TodoItems: {}", productRepository.count());
    }
}
