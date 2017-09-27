/*
 * *******************************************************************************
 *   Copyright 2017 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.domain.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import mx.imaginefirst.ceres.domain.BaseObject;
import mx.imaginefirst.ceres.entity.usuario.RolEntity;
import mx.imaginefirst.ceres.interfaces.IModel;

@JsonIgnoreProperties(ignoreUnknown=true)
@SuppressWarnings("serial")
@Entity
public class Rol extends BaseObject implements IModel {
	
	public Rol() {}
	
	public Rol(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private String descripcion;
	
	@Override
	public Object toEntity() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		RolEntity entity = mapper.convertValue(this, RolEntity.class);
		return entity;
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