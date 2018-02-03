package com.wecode.indicia.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.wecode.indicia.model.Symptom;
import com.wecode.indicia.service.SymptomService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/symptoms")
public class SymptomController {
	@Autowired
	private SymptomService symptomService;
	
	@RequestMapping("/all")
	public List<Symptom> getAllSymptoms() {
		
		return symptomService.getSymptoms();
		
	}
	
	@RequestMapping(value ="/all/{id}", method=RequestMethod.GET)
	public Symptom getSymptom(@PathVariable("id") String id) {
		return symptomService.getSymptoms(id);
		
	}

}
