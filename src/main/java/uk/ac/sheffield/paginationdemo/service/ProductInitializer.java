package uk.ac.sheffield.paginationdemo.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import uk.ac.sheffield.paginationdemo.model.Product;
import uk.ac.sheffield.paginationdemo.repository.ProductRepository;

import java.util.Arrays;

@Service
public class ProductInitializer implements CommandLineRunner {
    private final ProductRepository productRepository;

    public ProductInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) {
        initializeDefaultProducts();
    }

    private void initializeDefaultProducts() {
        Product[] products = {
                new Product("One Ring", 1000.0),
                new Product("Potatoes", 4.0),
                new Product("Orc", 50.50),
                new Product("Hobbit", 100.75)
        };
        productRepository.saveAll(Arrays.asList(products));
    }

}
