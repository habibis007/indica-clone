package com.wecode.indicia.model;

public class Question {
	 private String text;

	    private QuestionItem[] items;

	    private String type;

	   

	    public String getText ()
	    {
	        return text;
	    }

	    public void setText (String text)
	    {
	        this.text = text;
	    }

	    public QuestionItem[] getItems ()
	    {
	        return items;
	    }

	    public void setItems (QuestionItem[] items)
	    {
	        this.items = items;
	    }

	    public String getType ()
	    {
	        return type;
	    }

	    public void setType (String type)
	    {
	        this.type = type;
	    }

	  

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [text = "+text+", items = "+items+", type = "+type+"]";
	    }
	
				
				

}
