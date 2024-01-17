package com.demo.SpringBoot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBoot.model.Product;

@RestController
public class ProductRestController {

	@PostMapping("/product")
	public String saveProduct(@RequestBody Product product) {
		
		System.out.println(product);
		return "Product Added Successfully.";
	}
	
	@GetMapping("/product/{pid}")
	public Product getProduct(@PathVariable Integer pid) {
		Product product = null;
		if(pid == 100) {
		product = new Product(101,"Mouse",500.00);
		}
		else if(pid == 101) {
			product = new Product(102,"HD",3000.00);
		}
		return product;
	}
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		
		Product p1 = new Product(101,"Mouse",500.00);
		Product p2 = new Product(102,"HD",3000.00);
		
		List<Product> products = Arrays.asList(p1,p2);
		return products;
	}
}
