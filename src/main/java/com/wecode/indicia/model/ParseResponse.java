package com.wecode.indicia.model;



import com.fasterxml.jackson.annotation.JsonProperty;

public class ParseResponse {
	
	@JsonProperty("tokens")
	private String[] tokens;
	
	@JsonProperty("mentions")
	private ObservationMention[] mentions;
	

	public ParseResponse(String[] tokens, ObservationMention[] mentions) {
		super();
		this.tokens = tokens;
		this.mentions = mentions;
	}




	public ParseResponse() {
		
	}

	
	public ObservationMention[] getMentions() {
		return mentions;
	}




	public void setMentions(ObservationMention[] mentions) {
		this.mentions = mentions;
	}



	public String[] getTokens() {
		return tokens;
	}

	public void setTokens(String[] tokens) {
		this.tokens = tokens;
	}
	
	
	@Override
	public String toString() {
		return mentions.toString();
	}
	

}
