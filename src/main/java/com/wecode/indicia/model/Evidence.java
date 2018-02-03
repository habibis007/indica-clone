package com.wecode.indicia.model;

public class Evidence {
	 private String id;

	    private String choice_id;

	    public String getId ()
	    {
	        return id;
	    }

	    public void setId (String id)
	    {
	        this.id = id;
	    }

	    public String getChoice_id ()
	    {
	        return choice_id;
	    }

	    public void setChoice_id (String choice_id)
	    {
	        this.choice_id = choice_id;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", choice_id = "+choice_id+"]";
	    }
}
