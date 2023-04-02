package com.chtrembl.petstore.product.model.mapper;


import com.chtrembl.petstore.product.model.Category;
import com.chtrembl.petstore.product.model.dto.CategoryDto;
import org.mapstruct.Mapper;

@Mapper()
public interface CategoryMapper {

  CategoryDto toDto(Category category);

  Category toEntity(CategoryDto categoryDto);
}
