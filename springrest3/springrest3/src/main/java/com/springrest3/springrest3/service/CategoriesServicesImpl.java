package com.springrest3.springrest3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest3.springrest3.entities.Products;


@Service
public class CategoriesServicesImpl implements CategoriesServices{

	
	
	List<Products> list;
	
	public CategoriesServicesImpl()
	{
		
		
		
		list = new ArrayList<>();
		
		list.add(new Products(145," product1","good product"));
		list.add(new Products(1256,"product2","this also good product"));
	}
	


	@Override
	public List<Products> getProducts() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Products getProduct(long ProductId) {
		// TODO Auto-generated method stub
		
		Products p = null;
		
		for(Products Product:list)
		{
			if(Product.getId()==ProductId)
			{
				p = Product;
				break;
			}
		}
		
		
		return p;
	}


	@Override
	public Products addProduct(Products product) {
		// TODO Auto-generated method stub
		
		list.add(product);
		return product;
	}



	@Override
	public Products putProduct(Products product) {
		// TODO Auto-generated method stub
		
		//list.put(product);
		return product;
	}



	
}
