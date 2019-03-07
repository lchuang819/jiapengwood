package com.jiapengwood.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jiapengwood.model.MessageData;
import com.jiapengwood.service.MailService;
import com.jiapengwood.service.MessageService;
import com.jiapengwood.util.JSONUtils;


@RestController
public class MessageController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	MessageService messageService;
	
	@Autowired
	MailService mailService;

	@ResponseBody
    @RequestMapping(value = "/saveMessage", method = RequestMethod.POST)
	public String saveMessage(MessageData messageData) throws Exception {

		logger.debug(JSONUtils.toJSONString(messageData));
		
		if("test".equalsIgnoreCase(messageData.getSubject())) {
			logger.debug("===========Test==========");
		} else {
			mailService.sendEmail(messageData);
		}
		
		try {
			messageService.saveMessage(messageData);
		} catch (Exception e) {
			logger.error("Exception while saving message into DB:", e);
		}
		
		return "OK";
	}
}
