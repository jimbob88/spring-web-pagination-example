package uk.ac.sheffield.paginationdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.ac.sheffield.paginationdemo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
