package com.example.demo.service;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Product;
public interface ProductService {
	public List<Product> getProduct();
	public Product getProductById(@PathVariable Integer pid);
	public Product getProductByName(@PathVariable String pname);
	public String updateProductById(Integer pid, Product product);

}
