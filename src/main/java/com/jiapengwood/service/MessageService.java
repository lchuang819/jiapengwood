package com.jiapengwood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiapengwood.model.MessageData;
import com.jiapengwood.mongoopt.MessageOpt;

@Service
public class MessageService {
	
	@Autowired
	private MessageOpt messageOpt;

	public String saveMessage(MessageData messageData){
		
		messageData = messageOpt.save(messageData);
		
		return "ok";
	}
}
