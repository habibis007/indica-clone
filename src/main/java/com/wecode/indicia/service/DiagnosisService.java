package com.wecode.indicia.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.wecode.indicia.model.DiagnosisResponse;
import com.wecode.indicia.model.PostRequest;
import com.wecode.indicia.model.Symptom;

@Service
public class DiagnosisService {
	DiagnosisResponse resultOfDiagnosis;
	String uri = "https://api.infermedica.com/v2/diagnosis";
	RestTemplate restTemplate = new RestTemplate();
	
	public DiagnosisResponse addDiagnosis(PostRequest postRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("App-Id", "4d482fc1");	
		headers.set("App-Key", "2b1dd49af8c132d86be9eedd11650103");
		HttpEntity<PostRequest> request = new HttpEntity<>(postRequest,headers);
		DiagnosisResponse response = restTemplate.postForObject(uri, request, DiagnosisResponse.class);
		resultOfDiagnosis = response;
		
		return resultOfDiagnosis;
		
	}
}
	
	
		

		

