package com.chtrembl.petstore.product.service;

import com.chtrembl.petstore.product.model.dto.TagDto;
import com.chtrembl.petstore.product.model.mapper.TagMapper;
import com.chtrembl.petstore.product.repository.TagRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {

  private final TagRepository tagRepository;
  private final TagMapper mapper = Mappers.getMapper(TagMapper.class);

  @Override
  @Transactional(readOnly = true)
  public List<TagDto> findAll() {
    return tagRepository.findAll().stream().map(mapper::toDto).toList();
  }
}
