package com.springrest3.springrest3.entities;

public class Products {

	
	
	private long id;
	
	private String product_name;
	
	private String description;
	
	
	
	
	//parametrised constructor
	public Products(long id, String product_name, String description) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.description = description;
	}



	//constructor of super class
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getProduct_name() {
		return product_name;
	}



	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "products [id=" + id + ", product_name=" + product_name + ", description=" + description + "]";
	}
	
	
}
