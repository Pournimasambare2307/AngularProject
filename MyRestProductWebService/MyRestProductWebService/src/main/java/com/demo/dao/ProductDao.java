package com.demo.dao;

import java.util.List;

import com.demo.bean.Product;

public interface ProductDao {

	List<Product> getAllData();

	Product getById(int id);

	int deleteProduct(int id);

	

	int updateProductData(Product p);

	int addAllProduct(Product p);



}
