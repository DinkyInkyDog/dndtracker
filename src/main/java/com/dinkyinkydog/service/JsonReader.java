package com.dinkyinkydog.service;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReader {
	
	public Character readJsonFile(String filePath) throws IOException{
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(new File(filePath), Character.class);
	}
}
