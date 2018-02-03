package com.wecode.indicia.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wecode.indicia.service.DiagnosisService;
import com.wecode.indicia.model.DiagnosisResponse;
import com.wecode.indicia.model.PostRequest;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
public class DiagnosisController {
	@Autowired
	private DiagnosisService diagnosisService;

	@PostMapping("/diagnosis")
	public DiagnosisResponse postDiagnosis(@RequestBody PostRequest postRequest) {
		return diagnosisService.addDiagnosis(postRequest);
	}
	

}
