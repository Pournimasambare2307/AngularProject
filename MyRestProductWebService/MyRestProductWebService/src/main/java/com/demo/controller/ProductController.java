package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Product;
import com.demo.service.ProductService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
//rest controller used to create restful webservice once the requestbody generated it convert it into xml/json
public class ProductController {
	@Autowired
	//autowired is used autowire the besn to setter method ,methods,constu
	
	ProductService pservice;
	//@GetMapping("/products",produces="application/json")
	//getmapping is used to mapp http get request on specific handler method
	@GetMapping(value="/products",produces="application/json")
	public List<Product> getAllProduct()
	{
		List<Product> plist=pservice.getAllProduct();
		System.out.println("Length:"+plist.size());
		return plist;
		
	}
	
@GetMapping(path="/products/{id}",produces="application/json")

	public Product getProductById(@PathVariable("id") int id)
	{
		Product p=pservice.getProductById(id);
		return p;
	}
@DeleteMapping(path="/products/{id}",produces="application/json")
public List<Product> deleteProductById(@PathVariable("id") int id)
{
	int n=pservice.deleteProductById(id);
	
	List<Product> plist=pservice.getAllProduct();
	System.out.println("Length:"+plist.size());
	return plist;

	
}

@PostMapping(path="/products",headers="Content-type=application/json")
public  List<Product> addProduct(@RequestBody Product p)
{
	int n=pservice.addProduct(p);
	List<Product> plist=pservice.getAllProduct();
	return plist;
	
}
@PutMapping(path="/products",headers="Content-Type=application/json")
public List<Product> updateProduct(@RequestBody Product p)
{
int n=pservice.updateProduct(p);

List<Product> plist=pservice.getAllProduct();

return plist;


}
}
