package com.jiapengwood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiapengwood.model.Product;
import com.jiapengwood.mongoopt.ProductOpt;

@Service
public class ProductService {

	@Autowired
	private ProductOpt productOpt;

	public List<Product> fetchProductList() {

		return productOpt.findAll();
	}
}
