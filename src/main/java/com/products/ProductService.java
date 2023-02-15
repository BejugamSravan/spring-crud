package com.products;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService  {
	
	
	
	@Autowired
	private ProductRepository productRepository;
	
	
	/**
	  * This method is used to get the list of products.
	  * @return List of products
	  * 
	  * This method will use findAll method in crudRepository to get the products
	  * */
	public List<Products>getAllProducts()
	{
		List<Products> products = new ArrayList<Products>();
		productRepository.findAll()
		.forEach(products::add);
		return products;
		
	}
	
	/**
	  * This method is used to get the product based on the product id
	  * @param Id
	  * @return product details
	  * 
	  * This method will use findById method in crudRepository to get the products
	  */
	
	public Optional<Products> getProductByID(String id)
	{
		return productRepository.findById(id);
		
	}
	
	/**
	  * This method is used to add a product.
	  * @param product object
	  * 
	  * This method will use save method in crudRepository to create a product
	  */
	public void createProduct(Products product)
	{
		productRepository.save(product);
	}
	
	/**
	  * This method is used to update product
	  * @param product id 
	  * @param product object
	  * 
	  * This method will use save method in crudRepository to update a product
	  */
	public void updateProduct(Products product, String id)
	{
		productRepository.save(product);
	}
	
	/**
	  * This method is used to delete product
	  * @param product id
	  * @return
	  * 
	  * This method will use deleteById method in crudRepository to delete a product
	  */
	public void deleteProduct(String id){
		productRepository.deleteById(id);
	}
}
