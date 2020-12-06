package com.example.demo.data;

import java.util.Map;

public class ProductEntity {
	private Long id;
	private String name;
	private double price;
	private String image;
	private CategoryEntity category;
	private Map<String, Object> productDetails;

	public ProductEntity() {
		super();
	}

	public ProductEntity(Long id, String name, double price, String image, Map<String, Object> productDetails,
			CategoryEntity category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
		this.productDetails = productDetails;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Map<String, Object> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(Map<String, Object> productDetails) {
		this.productDetails = productDetails;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

}
