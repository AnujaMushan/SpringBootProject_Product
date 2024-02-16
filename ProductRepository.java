package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository <Product,Integer> {
	@Query("SELECT s FROM Product s WHERE s.pname=:pname")
	Product findByName(String pname);

}
