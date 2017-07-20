/*
 * *******************************************************************************
 *   Copyright 2017 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.domain.permisos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import mx.imaginefirst.ceres.domain.BaseObject;
import mx.imaginefirst.ceres.entity.UserEntity;
import mx.imaginefirst.ceres.interfaces.IModel;

@JsonIgnoreProperties(ignoreUnknown=true)
@SuppressWarnings("serial")
@Entity
public class Accion extends BaseObject implements IModel {
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String nombre;
	
	@ManyToOne
	private Seccion seccion;

	@Override
	public Object toEntity() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		UserEntity entity = mapper.convertValue(this, UserEntity.class);
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

	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	
}