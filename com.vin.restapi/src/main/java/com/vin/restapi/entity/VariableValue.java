package com.vin.restapi.entity;

import lombok.Data;



public class VariableValue {

	private String Value;

	private String ValueId;
	private String Variable;
	private String VariableId;
	
	
	
	public VariableValue(String value, String valueId, String variable, String variableId) {
		super();
		Value = value;
		ValueId = valueId;
		Variable = variable;
		VariableId = variableId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Value == null) ? 0 : Value.hashCode());
		result = prime * result + ((ValueId == null) ? 0 : ValueId.hashCode());
		result = prime * result + ((Variable == null) ? 0 : Variable.hashCode());
		result = prime * result + ((VariableId == null) ? 0 : VariableId.hashCode());
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
		VariableValue other = (VariableValue) obj;
		if (Value == null) {
			if (other.Value != null)
				return false;
		} else if (!Value.equals(other.Value))
			return false;
		if (ValueId == null) {
			if (other.ValueId != null)
				return false;
		} else if (!ValueId.equals(other.ValueId))
			return false;
		if (Variable == null) {
			if (other.Variable != null)
				return false;
		} else if (!Variable.equals(other.Variable))
			return false;
		if (VariableId == null) {
			if (other.VariableId != null)
				return false;
		} else if (!VariableId.equals(other.VariableId))
			return false;
		return true;
	}

	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
	public String getValueId() {
		return ValueId;
	}
	public void setValueId(String valueId) {
		ValueId = valueId;
	}
	public String getVariable() {
		return Variable;
	}
	public void setVariable(String variable) {
		Variable = variable;
	}
	public String getVariableId() {
		return VariableId;
	}
	public void setVariableId(String variableId) {
		VariableId = variableId;
	}
	
	
}
