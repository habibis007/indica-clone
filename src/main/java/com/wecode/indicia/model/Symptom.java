package com.wecode.indicia.model;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


public class Symptom {
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("common_name")
	private String common_name;

	@JsonProperty("question")
	private String question;
	
	@JsonProperty("sex_filter")
	private String sex_filter;
	
	@JsonProperty("category")
	private String category;
	
	@JsonProperty("seriousness")
	private String seriousness;
	
	@JsonProperty("image_url")
	private String image_url;
	
	@JsonProperty("image_source")
	private String image_source;
	
	@JsonProperty("parent_id")
	private String parent_id;
	
	@JsonProperty("parent_relation")
	private String parent_relation;
	
	
	public Symptom(String id, String name, String common_name, String question, String sex_filter, String category,
			 String image_url, String image_source, String parent_id,
			String parent_relation) {
		super();
		this.id = id;
		this.name = name;
		this.common_name = common_name;
		this.question = question;
		this.sex_filter = sex_filter;
		this.category = category;
		
		
		this.image_url = image_url;
		this.image_source = image_source;
		this.parent_id = parent_id;
		this.parent_relation = parent_relation;
	}
	
	public Symptom() {
		
	}
	public Symptom(String id) {
		this.id = id;
	}
	
	public Symptom(String id, String name, String common_name, String sex_filter, String category, String seriousness) {
		this.id = id;
		this.name = name;
		this.common_name = common_name;
		this.sex_filter = sex_filter;
		this.category = category;
		this.seriousness = seriousness;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCommon_name() {
		return common_name;
	}
	public void setCommon_name(String common_name) {
		this.common_name = common_name;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getSex_filter() {
		return sex_filter;
	}
	public void setSex_filter(String sex_filter) {
		this.sex_filter = sex_filter;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getImage_source() {
		return image_source;
	}
	public void setImage_source(String image_source) {
		this.image_source = image_source;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	public String getParent_relation() {
		return parent_relation;
	}
	public void setParent_relation(String parent_relation) {
		this.parent_relation = parent_relation;
	}
	public String getSeriousness() {
		return seriousness;
	}
	public void setSeriousness(String seriousness) {
		this.seriousness = seriousness;
	}
	

}
