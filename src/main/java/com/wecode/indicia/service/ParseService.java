package com.wecode.indicia.service;



import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import org.springframework.http.MediaType;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wecode.indicia.model.ParseRequest;
import com.wecode.indicia.model.ParseResponse;

@Service
public class ParseService {
	
	public ParseResponse parseResponse;
	String uri = "https://api.infermedica.com/v2/parse";
	RestTemplate restTemplate = new RestTemplate();
	
	public ParseResponse addText(ParseRequest parseRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("App-Id", "4d482fc1");	
		headers.set("App-Key", "2b1dd49af8c132d86be9eedd11650103");
		HttpEntity<ParseRequest> request = new HttpEntity<>(parseRequest,headers);
		ParseResponse response = restTemplate.postForObject(uri, request, ParseResponse.class);
		parseResponse = response;
		
		return parseResponse;
		
	}
	
	
	
	

}
