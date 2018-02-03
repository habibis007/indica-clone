package com.wecode.indicia.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParseRequest {
	
	@JsonProperty("text")
	private String text;
	
	@JsonProperty("include_tokens")
	private boolean include_tokens;
	
	@JsonProperty("correct_spelling")
	private boolean correct_spelling;
	
	@JsonProperty("concept_types")
	private String[] concept_types;

	public ParseRequest(String text, boolean include_tokens, boolean correct_spelling, String[] concept_types) {
		super();
		this.text = text;
		this.include_tokens = include_tokens;
		this.correct_spelling = correct_spelling;
		this.concept_types = concept_types;
	}
	
	public ParseRequest() {
		
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isInclude_tokens() {
		return include_tokens;
	}

	public void setInclude_tokens(boolean include_tokens) {
		this.include_tokens = include_tokens;
	}

	public boolean isCorrect_spelling() {
		return correct_spelling;
	}

	public void setCorrect_spelling(boolean correct_spelling) {
		this.correct_spelling = correct_spelling;
	}

	public String[] getConcept_types() {
		return concept_types;
	}

	public void setConcept_types(String[] concept_types) {
		this.concept_types = concept_types;
	}
	
	

}
