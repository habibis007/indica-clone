package com.wecode.indicia.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.wecode.indicia.model.PostRequest;
import com.wecode.indicia.model.Symptom;

@Service
public class SymptomService {
	List<Map<String, Object>> symptoms;
	Symptom each_symptoms;
	String uri = "https://api.infermedica.com/v2/symptoms";
	RestTemplate restTemplate = new RestTemplate();
	

	public List<Symptom> getSymptoms(){
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("App-Id", "4d482fc1");	
		headers.set("App-Key", "2b1dd49af8c132d86be9eedd11650103");
		
		ResponseEntity<ArrayList> response = restTemplate.exchange(uri,
				HttpMethod.GET,
				new HttpEntity<ArrayList<HashMap<String, Object>>>(headers),
				ArrayList.class);
		
		symptoms = response.getBody();
		
		//Map<String, Object> s1 = (Map<String, Object>) symptoms.get(0);
		//Symptom sympObject = new Symptom(s1.get("name"), sq.get(""))
		
		List<Symptom> objcs = symptoms.stream().map(m -> {
			String id = (String)m.get("id");
			String name = (String) m.get("name");
			String common_name = (String) m.get("common_name");
			String sex = (String)m.get("sex_filter");
			String category = (String)m.get("category");
			String seriousness = (String)m.get("seriousness");
			return new Symptom(id,name,common_name,sex,category,seriousness);
		}).collect(Collectors.toList());
				
				
		return objcs;
		
	}
	
	public Symptom getSymptoms(String id){
		final String url = "https://api.infermedica.com/v2/symptoms/";
	
		HttpHeaders headers = new HttpHeaders();
		headers.set("App-Id", "4d482fc1");	
		headers.set("App-Key", "2b1dd49af8c132d86be9eedd11650103");
		
		
		ResponseEntity<Symptom> response = restTemplate.exchange(url + id, HttpMethod.GET, new HttpEntity<Symptom>(headers), Symptom.class);
	
		each_symptoms = response.getBody();

				
		return each_symptoms;
		
		
	}
	
	

}
