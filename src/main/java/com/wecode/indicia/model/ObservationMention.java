package com.wecode.indicia.model;

public class ObservationMention {
	
	private String id;
	private String name;
	private String common_name;
	
	private String choice_id;
	
	
	
	
	public ObservationMention(String id, String name, String common_name, String choice_id) {
		super();
		this.id = id;
		this.name = name;
		this.common_name = common_name;
		this.choice_id = choice_id;
	}


	public ObservationMention() {
		
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
	
	public String getChoice_id() {
		return choice_id;
	}
	public void setChoice_id(String choice_id) {
		this.choice_id = choice_id;
	}
	

	
	
	

}
