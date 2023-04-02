package com.chtrembl.petstore.product.repository;

import com.chtrembl.petstore.product.model.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
  List<Product> findAll();
}
