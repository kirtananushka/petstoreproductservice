package com.chtrembl.petstore.product.repository;

import com.chtrembl.petstore.product.model.Status;
import java.util.stream.Stream;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class StatusConverter implements AttributeConverter<Status, String> {

  @Override
  public String convertToDatabaseColumn(Status status) {
    if (status == null) {
      return null;
    }
    return status.getValue();
  }

  @Override
  public Status convertToEntityAttribute(String string) {
    if (string == null) {
      return null;
    }
    return Stream.of(Status.values())
      .filter(s -> s.getValue().equals(string))
      .findFirst()
      .orElseThrow(IllegalArgumentException::new);
  }
}
