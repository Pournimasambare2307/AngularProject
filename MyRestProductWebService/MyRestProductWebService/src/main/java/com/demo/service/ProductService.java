package com.demo.service;

import java.util.List;

import com.demo.bean.Product;

public interface ProductService {

	List<Product> getAllProduct();

	Product getProductById(int id);

	int  deleteProductById(int id);

	int updateProduct(Product p);

	int addProduct(Product p);

	

}
