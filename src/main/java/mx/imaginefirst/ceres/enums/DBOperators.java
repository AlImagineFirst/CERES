/*
 * *******************************************************************************
 *   Copyright 2017 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.enums;

public enum DBOperators {

	// Users
	STARTS_WITH(1, "Empieza con"), 
	END_WITH(2, "Termina con"), 
	EQUALS(3, "Igual a"),
	MORE_THAN(4, "Mayor que"),
	LESS_THAN(5, "Menor que"),
	BETWEEN(6, "Entre");
	
	private int id;
	private String description;

	private DBOperators(int id, String description) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return description;
	}
}