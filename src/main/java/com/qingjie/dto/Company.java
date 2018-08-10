package com.qingjie.dto;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "catchPhrase", "bs" })
public class Company {

	@JsonProperty("name")
	private String name;

	@JsonProperty("catchPhrase")
	private String suicatchPhrasete;

	@JsonProperty("bs")
	private String bs;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("catchPhrase")
	public String getSuicatchPhrasete() {
		return suicatchPhrasete;
	}

	@JsonProperty("catchPhrase")
	public void setSuicatchPhrasete(String suicatchPhrasete) {
		this.suicatchPhrasete = suicatchPhrasete;
	}

	@JsonProperty("bs")
	public String getBs() {
		return bs;
	}

	@JsonProperty("bs")
	public void setBs(String bs) {
		this.bs = bs;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

}
