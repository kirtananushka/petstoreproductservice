package com.chtrembl.petstore.product.model;

import com.chtrembl.petstore.product.repository.StatusConverter;
import java.util.List;
import java.util.Objects;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "default_generator")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private Category category;

  private String name;

  private String photoURL;

  @ManyToMany
  @JoinTable(
    name = "product_tag",
    joinColumns = @JoinColumn(name = "product_id"),
    inverseJoinColumns = @JoinColumn(name = "tag_id")
  )
  private List<Tag> tags;

  @Convert(converter = StatusConverter.class)
  private Status status;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhotoURL() {
    return photoURL;
  }

  public void setPhotoURL(String photoURL) {
    this.photoURL = photoURL;
  }

  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Product pet = (Product) o;

    if (!Objects.equals(id, pet.id)) return false;
    if (!Objects.equals(category, pet.category)) return false;
    if (!Objects.equals(name, pet.name)) return false;
    if (!Objects.equals(photoURL, pet.photoURL)) return false;
    if (!Objects.equals(tags, pet.tags)) return false;
    return status == pet.status;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (category != null ? category.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (photoURL != null ? photoURL.hashCode() : 0);
    result = 31 * result + (tags != null ? tags.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Product{" +
      "id=" + id +
      ", category=" + category +
      ", name='" + name + '\'' +
      ", photoURL='" + photoURL + '\'' +
      ", tags=" + tags +
      ", status=" + status +
      '}';
  }
}
