package com.demo.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
@Service
public class ProductServiceImpl implements ProductService{
@Autowired
ProductDao pdao;
	@Override
	public List<Product> getAllProduct() {
		
		return pdao.getAllData();
	}
	@Override
	public Product getProductById(int id) {
		
		return pdao.getById(id);
	}
	
	public int deleteProductById(int id) {
		return pdao.deleteProduct(id);
	}
	@Override
	public int updateProduct(Product p) {
		 return pdao.updateProductData(p);
	}
	@Override
	public int addProduct(Product p) {
		
		return pdao.addAllProduct(p);
	}

}
