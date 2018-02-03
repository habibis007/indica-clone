package com.wecode.indicia;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.wecode.indicia.controller.DiagnosisController;

@SpringBootApplication
public class IndiciaApplication {

	public static void main(String[] args) {
		
		
		
		SpringApplication.run(IndiciaApplication.class, args);
		
		

		
	}
	
	
}
