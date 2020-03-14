package com.vin.restapi.entity;

import java.util.List;

import lombok.Data;
import lombok.ToString;

public class VINInfo {

	private int Count;
	private String Message;
	private String SearchCriteria;
	private List<VariableValue>   Results;
	
	public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getSearchCriteria() {
		return SearchCriteria;
	}
	public void setSearchCriteria(String searchCriteria) {
		SearchCriteria = searchCriteria;
	}
	public List<VariableValue> getResults() {
		return Results;
	}
	public void setResults(List<VariableValue> results) {
		Results = results;
	}
	public VINInfo(int count, String message, String searchCriteria, List<VariableValue> results) {
		super();
		Count = count;
		Message = message;
		SearchCriteria = searchCriteria;
		Results = results;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Count;
		result = prime * result + ((Message == null) ? 0 : Message.hashCode());
		result = prime * result + ((Results == null) ? 0 : Results.hashCode());
		result = prime * result + ((SearchCriteria == null) ? 0 : SearchCriteria.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VINInfo other = (VINInfo) obj;
		if (Count != other.Count)
			return false;
		if (Message == null) {
			if (other.Message != null)
				return false;
		} else if (!Message.equals(other.Message))
			return false;
		if (Results == null) {
			if (other.Results != null)
				return false;
		} else if (!Results.equals(other.Results))
			return false;
		if (SearchCriteria == null) {
			if (other.SearchCriteria != null)
				return false;
		} else if (!SearchCriteria.equals(other.SearchCriteria))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "VINInfo [Count=" + Count + ", Message=" + Message + ", SearchCriteria=" + SearchCriteria + ", Results="
				+ Results + "]";
	}
	
	
	
}
