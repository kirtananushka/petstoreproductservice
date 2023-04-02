package com.chtrembl.petstore.product.service;

import com.chtrembl.petstore.product.model.dto.ProductDto;
import java.util.List;

public interface ProductService {
  List<ProductDto> findAll();
}
