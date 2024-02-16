package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.serviceimpl.ProductServiceImpl;

@RestController
public class ProductController {
    ProductServiceImpl productservice;
	
	public ProductController(ProductServiceImpl productservice) {
		super();
		this.productservice = productservice;
	}
	@GetMapping(value="/getp")
	public List<Product> getProduct(){
		
		return productservice.getProduct();
		
	}
	@GetMapping("/getById/{pid}")
	public Product getProductById(@PathVariable Integer pid){
		
		return productservice.getProductById(pid);
		
	}
	@GetMapping(value="/get/{pname}")
	public Product getProductByName(@PathVariable String pname){
		
		return productservice.getProductByName(pname);
		
	}
	 @PostMapping(value="/post")
	  public Product postProduct(@RequestBody Product product){
	    return productservice.postProduct(product);
	  }
	  @PutMapping(value="/put/{pid}")
	  public String updateProductById(@PathVariable Integer pid ,@RequestBody Product product) {
	    return productservice.updateProductById(pid,product);
	     
	  }
	  @DeleteMapping(value="/delete/{pid}")
	  public String deleteProductById(@PathVariable int pid) {
	    return productservice.deleteProductById(pid);
	     

}
}
