package com.wecode.indicia.model;

import java.util.List;

public class PostRequest {
	private String sex;

    private List<Evidence> evidence;

    private String age;

    public String getSex ()
    {
        return sex;
    }

    public void setSex (String sex)
    {
        this.sex = sex;
    }

    
    public List<Evidence> getEvidence() {
		return evidence;
	}

	public void setEvidence(List<Evidence> evidence) {
		this.evidence = evidence;
	}

	public String getAge ()
    {
        return age;
    }

    public void setAge (String age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [sex = "+sex+", evidence = "+evidence+", age = "+age+"]";
    }


}
