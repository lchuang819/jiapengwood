package com.jiapengwood.mongorepo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jiapengwood.model.Product;

public interface ProductRepo extends MongoRepository<Product, String> {
	
	
}
