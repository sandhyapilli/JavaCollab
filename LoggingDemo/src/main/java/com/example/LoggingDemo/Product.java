package com.example.LoggingDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer id;
   private String name;
   private Integer price;
   @Enumerated(EnumType.STRING)
   private Stock stock;
   public Product(Integer id, String name, Integer price, Stock stock) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}

    public Product() {
    	
    }
  
public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getPrice() {
	return price;
}

public void setPrice(Integer price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
}

}
