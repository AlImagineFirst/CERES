/*
 * *******************************************************************************
 *   Copyright 2017 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.entity.catalog;

import com.fasterxml.jackson.databind.ObjectMapper;

import mx.imaginefirst.ceres.domain.catalogo.EstadoExpediente;
import mx.imaginefirst.ceres.interfaces.IEntity;

public class EstadoExpedienteEntity implements IEntity {

	private Long id;
	private String nombre;
	private String descripcion;
	
	@Override
	public Object toModel() {
		ObjectMapper mapper = new ObjectMapper();
		EstadoExpediente model = mapper.convertValue(this, EstadoExpediente.class);
		return model;
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