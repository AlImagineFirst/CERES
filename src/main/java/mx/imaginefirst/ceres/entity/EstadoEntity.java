/*
 * *******************************************************************************
 *   Copyright 2017 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.entity;

import com.fasterxml.jackson.databind.ObjectMapper;

import mx.imaginefirst.ceres.domain.catalog.Estado;
import mx.imaginefirst.ceres.interfaces.IEntity;

public class EstadoEntity implements IEntity {
	private Long id;

	private String nombre;

	private String descripcion;

	@Override
	public Object toModel() {
		ObjectMapper mapper = new ObjectMapper();
		Estado user = mapper.convertValue(this, Estado.class);
		return user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
}