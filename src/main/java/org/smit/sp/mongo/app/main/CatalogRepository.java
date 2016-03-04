package org.smit.sp.mongo.app.main;

import java.util.List;

import org.smit.sp.mongo.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatalogRepository extends MongoRepository<Product, String>{

	/*
	 * # Spring Data MongoDB so useful is the fact that we don’t have to create this implementation. 
	 *   Spring Data MongoDB creates it on the fly when we run the application. 
	 * */	
	
	@Override
	public <S extends Product> S save(S entity);
	
	@Override 
	public Product findOne(String id);
	
	@Override
	public List<Product> findAll();
}
