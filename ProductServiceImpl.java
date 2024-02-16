package com.example.demo.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import java.util.Optional;
@Service
public class ProductServiceImpl {

	@Autowired
	ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	public List<Product> getProduct(){
		return productRepository.findAll();
	}
	public Product getProductById(Integer pid) {
		Optional<Product> product =productRepository.findById(pid);
		return product.orElse(null);
	}
	public Product getProductByName(String pname) {
		Product product =productRepository.findByName(pname);
		return product;
	}
	
	
	 public Product postProduct(Product product) {
		    // TODO Auto-generated method stub
		    Product p=productRepository.save(product);
		    return p;
		  }
	 public String updateProductById(Integer pid, Product product) {
		    // TODO Auto-generated method stub
		    Optional<Product> existingProduct=productRepository.findById(pid);
		     if(existingProduct.isPresent()) {
		       Product newproduct=existingProduct.get();
		       newproduct.setPname(product.getPname());
		       productRepository.save(newproduct);
		       return "Update success";
		     }
		     else {
		    	 return "Record not found";
		     }
		 }
	 public String deleteProductById(int pid) {
		    // TODO Auto-generated method stub
		    productRepository.deleteById(pid);
		    return "Delete Succes";
		  }
		  
	}


