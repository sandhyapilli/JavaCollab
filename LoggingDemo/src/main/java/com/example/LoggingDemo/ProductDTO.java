//package com.example.LoggingDemo;
//
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Positive;
//
//public class ProductDTO {
//	@NotNull
//	private Integer id;
//	@NotNull(groups=createGroup.class)
//	private String name;
//	   @Positive
//	   private Integer price;
//	   public ProductDTO(Integer id, String name, Integer price) {
//		   this.id=id;
//		   this.name=name;
//		   this.price=price;
//	   }
//	   public ProductDTO() {
//		   
//	   }
//	   public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Integer getPrice() {
//		return price;
//	}
//	public void setPrice(Integer price) {
//		this.price = price;
//	}
//	
//}
