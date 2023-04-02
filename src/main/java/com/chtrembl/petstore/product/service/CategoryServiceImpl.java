package com.chtrembl.petstore.product.service;

import com.chtrembl.petstore.product.model.dto.CategoryDto;
import com.chtrembl.petstore.product.model.mapper.CategoryMapper;
import com.chtrembl.petstore.product.repository.CategoryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

  private final CategoryRepository categoryRepository;
  private final CategoryMapper mapper = Mappers.getMapper(CategoryMapper.class);

  @Override
  @Transactional(readOnly = true)
  public List<CategoryDto> findAll() {
    return categoryRepository.findAll().stream().map(mapper::toDto).toList();
  }

  @Override
  @Transactional(readOnly = true)
  public CategoryDto findById(Long id) {
    return categoryRepository.findById(id)
      .map(mapper::toDto)
      .orElseThrow(() -> new IllegalArgumentException("Not found"));
  }
}
