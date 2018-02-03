package com.wecode.indicia.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class DiagnosisResponse
{
    @JsonProperty("conditions")
	private ConditionProbability[] conditions;

    @JsonProperty("question")
    private Question question;

  

    public ConditionProbability[] getConditions ()
    {
        return conditions;
    }

    public void setConditions (ConditionProbability[] conditions)
    {
        this.conditions = conditions;
    }

    public Question getQuestion ()
    {
        return question;
    }

    public void setQuestion (Question question)
    {
        this.question = question;
    }

   

    @Override
    public String toString()
    {
        return "ClassPojo [conditions = "+conditions+", question = "+question+"]";
    }
}
			
			