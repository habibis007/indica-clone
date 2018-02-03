package com.wecode.indicia.model;

public class ConditionProbability {
	 private String id;

	    private String name;

	    private String common_name;

	    private Double probability;

	    public String getId ()
	    {
	        return id;
	    }

	    public void setId (String id)
	    {
	        this.id = id;
	    }

	    public String getName ()
	    {
	        return name;
	    }

	    public void setName (String name)
	    {
	        this.name = name;
	    }

	    public String getCommon_name ()
	    {
	        return common_name;
	    }

	    public void setCommon_name (String common_name)
	    {
	        this.common_name = common_name;
	    }

	    public Double getProbability ()
	    {
	        return probability;
	    }

	    public void setProbability (Double probability)
	    {
	        this.probability = probability;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", name = "+name+", common_name = "+common_name+", probability = "+probability+"]";
	    }

				
				

}
