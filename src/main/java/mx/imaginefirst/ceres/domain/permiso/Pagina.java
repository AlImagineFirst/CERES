/*
 * *******************************************************************************
 *   Copyright 2017 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.domain.permiso;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import mx.imaginefirst.ceres.domain.BaseObject;
import mx.imaginefirst.ceres.entity.UsuarioEntity;
import mx.imaginefirst.ceres.interfaces.IModel;

@JsonIgnoreProperties(ignoreUnknown=true)
@SuppressWarnings("serial")
@Entity
public class Pagina extends BaseObject implements IModel {
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String nombre;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = "pagina")
	private Set<Seccion> secciones;

	@Override
	public Object toEntity() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		UsuarioEntity entity = mapper.convertValue(this, UsuarioEntity.class);
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

	public Set<Seccion> getSecciones() {
		return secciones;
	}

	public void setSecciones(Set<Seccion> secciones) {
		this.secciones = secciones;
	}
	
	
}