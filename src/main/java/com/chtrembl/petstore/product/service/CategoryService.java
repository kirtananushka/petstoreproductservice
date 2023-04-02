package com.chtrembl.petstore.product.service;

import com.chtrembl.petstore.product.model.dto.CategoryDto;
import java.util.List;

public interface CategoryService {
  List<CategoryDto> findAll();
  CategoryDto findById(Long id);
}
