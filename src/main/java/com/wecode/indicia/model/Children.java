package com.wecode.indicia.model;

public class Children {
	private String id;
	private String parent_relation;
	public Children(String id, String parent_relation) {
		this.id = id;
		this.parent_relation = parent_relation;
	}
	 public Children() {
		 
	 }

	public String id() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getParent_relation() {
		return parent_relation;
	}
	public void setParent_relation(String parent_relation) {
		this.parent_relation = parent_relation;
	}
	 
	 

}
