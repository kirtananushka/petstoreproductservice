package com.chtrembl.petstore.product.model.mapper;


import com.chtrembl.petstore.product.model.Product;
import com.chtrembl.petstore.product.model.dto.ProductDto;
import org.mapstruct.Mapper;

@Mapper()
public interface ProductMapper {

  ProductDto toDto(Product product);

  Product toEntity(ProductDto productDto);
}
