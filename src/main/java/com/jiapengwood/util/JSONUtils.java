package com.jiapengwood.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtils {

	private static final ObjectMapper mapper = new ObjectMapper();

	public static String toJSONString(Object data) {

		try {
			String string = mapper.writeValueAsString(data);
			return string;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return null;
	}

}
