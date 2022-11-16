package com.springrest3.springrest3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest3.springrest3.entities.Products;
import com.springrest3.springrest3.service.CategoriesServices;

@RestController
public class MyController {
	
	
	@Autowired
    private CategoriesServices CategoriesService;

	@GetMapping("/home")
	public String home()
	{
		return "Welcome...";
	}
	
	
	//get the category
	@GetMapping("/Products")
	public List<Products> getProduct()
	{
		return this.CategoriesService.getProducts();
	}
	
	@GetMapping("/Products/{ProductId}")
	public Products getproduct(@PathVariable String ProductId)
	{
		return this.CategoriesService.getProduct(Long.parseLong(ProductId));
	}
	
	@PostMapping("/Products")
	public Products addProduct(@RequestBody Products product)
	{
		return this.CategoriesService.addProduct(product);
	}
	@PutMapping("/Products")
	
	public Products putProduct(@RequestBody Products product)
	{
		return this.CategoriesService.putProduct(product);
	}
	
	
	
	
	
}
