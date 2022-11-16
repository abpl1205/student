package com.springrest3.springrest3.service;

import java.util.List;

import com.springrest3.springrest3.entities.Products;

public interface CategoriesServices {

	
	
	public List<Products> getProducts();
	
	
	public Products getProduct(long ProductId);
	
	public Products addProduct(Products product);


	public Products putProduct(Products product);

}
