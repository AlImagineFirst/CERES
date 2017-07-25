/*
 * *******************************************************************************
 *   Copyright 2017 Imagine First.
 * *******************************************************************************
 */

package mx.imaginefirst.ceres.domain;

import mx.imaginefirst.ceres.enums.DBOperators;

public class CustomCriteria {
	private String field;
	
	private DBOperators operator;
	
	private String value;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public DBOperators getOperator() {
		return operator;
	}

	public void setOperator(DBOperators operator) {
		this.operator = operator;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
