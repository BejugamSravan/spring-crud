package com.products;

import org.springframework.data.repository.CrudRepository;


/**CrudRepository is an interface in spring. 
 * It contains all the crud related methods*/

public interface ProductRepository extends CrudRepository<Products,String> {
	

}
