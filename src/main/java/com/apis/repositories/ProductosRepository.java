package com.apis.repositories;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.apis.documents.Productos;

@Repository
public interface ProductosRepository extends MongoRepository<Productos, Serializable>{
	
}
