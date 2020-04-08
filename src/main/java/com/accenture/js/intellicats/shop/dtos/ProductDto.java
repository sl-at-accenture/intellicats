package com.accenture.js.intellicats.shop.dtos;

import java.math.BigDecimal;

public class ProductDto {
	private String title;
	private String ean;
	private BigDecimal price;
	
	public ProductDto() {
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "ProductDTO [" + (title != null ? "title=" + title + ", " : "")
				+ (ean != null ? "ean=" + ean + ", " : "") + (price != null ? "price=" + price : "") + "]";
	}
	public ProductDto(String title, String ean, BigDecimal price) {
		super();
		this.title = title;
		this.ean = ean;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEan() {
		return ean;
	}
	public void setEan(String ean) {
		this.ean = ean;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
