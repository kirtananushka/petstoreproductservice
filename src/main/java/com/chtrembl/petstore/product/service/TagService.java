package com.chtrembl.petstore.product.service;

import com.chtrembl.petstore.product.model.dto.TagDto;
import java.util.List;

public interface TagService {
  List<TagDto> findAll();
}
