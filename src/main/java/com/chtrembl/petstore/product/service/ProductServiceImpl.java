package com.chtrembl.petstore.product.service;

import com.chtrembl.petstore.product.model.dto.ProductDto;
import com.chtrembl.petstore.product.model.mapper.ProductMapper;
import com.chtrembl.petstore.product.repository.ProductRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;
  private final ProductMapper mapper = Mappers.getMapper(ProductMapper.class);

  @Override
  @Transactional(readOnly = true)
  public List<ProductDto> findAll() {
    return productRepository.findAll().stream().map(mapper::toDto).toList();
  }
}
