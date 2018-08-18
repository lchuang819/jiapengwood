package com.jiapengwood.mongorepo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jiapengwood.model.MessageData;

public interface MessageRepo extends MongoRepository<MessageData, String> {
	
	
}
