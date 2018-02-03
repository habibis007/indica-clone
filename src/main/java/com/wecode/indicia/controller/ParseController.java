package com.wecode.indicia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wecode.indicia.model.ParseRequest;
import com.wecode.indicia.model.ParseResponse;
import com.wecode.indicia.service.ParseService;

@RestController
public class ParseController {
	@Autowired
	ParseService parseService;
	public ParseResponse response;
	
	@PostMapping("/parse")
	public ParseResponse postText(@RequestBody ParseRequest parseRequest) {
		
		response = parseService.addText(parseRequest);
		
		return response;
	}

}
