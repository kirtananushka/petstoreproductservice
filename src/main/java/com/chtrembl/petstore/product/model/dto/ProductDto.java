package com.chtrembl.petstore.product.model.dto;

import com.chtrembl.petstore.product.model.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Product
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-12-20T15:31:39.272-05:00")

public class ProductDto {
	@JsonProperty("id")
	private Long id;

	@JsonProperty("category")
	private CategoryDto categoryDto;

	@JsonProperty("name")
	private String name;

	@JsonProperty("photoURL")
	@Valid
	private String photoURL;

	@JsonProperty("tags")
	@Valid
	private List<TagDto> tagDtos = null;

	@JsonProperty("status")
	private Status status;

	public ProductDto id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 *
	 * @return id
	 */
	@ApiModelProperty(value = "")

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProductDto category(CategoryDto categoryDto) {
		this.categoryDto = categoryDto;
		return this;
	}

	/**
	 * Get categoryDto
	 *
	 * @return categoryDto
	 */
	@ApiModelProperty(value = "")

	@Valid

	public CategoryDto getCategory() {
		return categoryDto;
	}

	public void setCategory(CategoryDto categoryDto) {
		this.categoryDto = categoryDto;
	}

	public ProductDto name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 *
	 * @return name
	 */
	@ApiModelProperty(example = "doggie", required = true, value = "")
	@NotNull

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get photoUrls
	 *
	 * @return photoUrls
	 */
	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public ProductDto tags(List<TagDto> tagDtos) {
		this.tagDtos = tagDtos;
		return this;
	}

	public ProductDto addTagsItem(TagDto tagsItem) {
		if (this.tagDtos == null) {
			this.tagDtos = new ArrayList<>();
		}
		this.tagDtos.add(tagsItem);
		return this;
	}

	/**
	 * Get tagDtos
	 *
	 * @return tagDtos
	 */
	@ApiModelProperty(value = "")

	@Valid

	public List<TagDto> getTags() {
		return tagDtos;
	}

	public void setTags(List<TagDto> tagDtos) {
		this.tagDtos = tagDtos;
	}

	public ProductDto status(Status status) {
		this.status = status;
		return this;
	}

	/**
	 * pet status in the store
	 *
	 * @return status
	 */
	@ApiModelProperty(value = "pet status in the store")

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProductDto productDto = (ProductDto) o;
		return Objects.equals(this.id, productDto.id) && Objects.equals(this.categoryDto, productDto.categoryDto)
				&& Objects.equals(this.name, productDto.name) && Objects.equals(this.photoURL, productDto.photoURL)
				&& Objects.equals(this.tagDtos, productDto.tagDtos) && Objects.equals(this.status, productDto.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, categoryDto, name, photoURL, tagDtos, status);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Product {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    categoryDto: ").append(toIndentedString(categoryDto)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    photoUrls: ").append(toIndentedString(photoURL)).append("\n");
		sb.append("    tagDtos: ").append(toIndentedString(tagDtos)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
