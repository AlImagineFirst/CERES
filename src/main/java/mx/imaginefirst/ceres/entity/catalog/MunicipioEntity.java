/*
 * *******************************************************************************
 *   Copyright 2017 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.entity.catalog;

import com.fasterxml.jackson.databind.ObjectMapper;

import mx.imaginefirst.ceres.domain.catalogo.Municipio;
import mx.imaginefirst.ceres.interfaces.IEntity;

public class MunicipioEntity implements IEntity {

	private Long id;

	private String nombre;

	private String descripcion;
	
	private EstadoEntity estado;
	
	@Override
	public Object toModel() {
		ObjectMapper mapper = new ObjectMapper();
		Municipio model = mapper.convertValue(this, Municipio.class);
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

	public EstadoEntity getEstado() {
		return estado;
	}

	public void setEstado(EstadoEntity estado) {
		this.estado = estado;
	}
}