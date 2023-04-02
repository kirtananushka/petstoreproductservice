package com.chtrembl.petstore.product.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * pet status in the store
 */
public enum Status {
  AVAILABLE("available"),

  PENDING("pending"),

  SOLD("sold");

  private String value;

  Status(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Status fromValue(String value) {
    for (Status b : Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
