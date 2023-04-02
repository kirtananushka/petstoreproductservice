package com.chtrembl.petstore.product.model.mapper;


import com.chtrembl.petstore.product.model.Tag;
import com.chtrembl.petstore.product.model.dto.TagDto;
import org.mapstruct.Mapper;

@Mapper()
public interface TagMapper {

  TagDto toDto(Tag tag);

  Tag toEntity(TagDto tagDto);
}
