package com.example.sim;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class SimPlanEntity {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private Long Id;
	   private String name;
	   private String description;
	   private Double price;
	   private Integer validity;
	   private String planType;

	     public SimPlanEntity() {
		super();
      	}
	 
	   public SimPlanEntity(Long id, String name, String description, double price, Integer validity, String planType) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.validity = validity;
		this.planType=planType;
	}
	
   public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getValidity() {
		return validity;
	}
	public void setValidity(Integer validity) {
		this.validity = validity;
	}
	 @Override
	public String toString() {
		return "SimPlanEntity [Id=" + Id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", validity=" + validity + ", planType=" + planType + "]";
	}

}
