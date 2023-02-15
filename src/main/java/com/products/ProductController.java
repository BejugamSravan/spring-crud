package com.products;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * RestController acts as the front controller and used for restful web services. 
 * It is used at class level and allows to handle request made by the client
 */ 

@RestController

public class ProductController {
	
	
	/** 
	 * Autowired annotation 
	 * is used here to create a instance of product service class*/
	
	@Autowired
	private ProductService productservice;
	
	
	
	/**
	  * This method is used to get the list of products.
	  * @return List of products
	  */
	
	@RequestMapping(value = "/products", method=RequestMethod.GET)
	public List<Products> getAllProducts(){
		return productservice.getAllProducts();
	}
	
	/**
	  * This method is used to get the product based on the product id
	  * @param Id
	  * @return product details
	  */
	
	@RequestMapping(value = "/products/{id}", method=RequestMethod.GET)
	 public Optional<Products> getProductByid(@PathVariable("id")String id) {
		return productservice.getProductByID(id);
	
	}
	
	/**
	  * This method is used to add a product.
	  * @param product object
	  * @return product
	  */
	
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public void createProduct(@RequestBody Products product)
	{
		productservice.createProduct(product);
	}
	
	 /**
	  * This method is used to update product
	  * @param product id 
	  * @param product object
	  * @return product
	  */
	
	@RequestMapping(value = "/products/{id}",method = RequestMethod.PUT)
	public void updateProduct(@RequestBody Products product, @PathVariable String id)
	{
		productservice.updateProduct(product, id);
	}
	
	/**
	  * This method is used to delete product
	  * @param product id
	  * @return
	  */
	
	@RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id")String id)
	{
		productservice.deleteProduct(id);
	}
}
