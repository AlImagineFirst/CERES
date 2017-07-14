/*
 * *******************************************************************************
 *   Copyright 2017 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import mx.imaginefirst.ceres.domain.catalog.Rol;
import mx.imaginefirst.ceres.entity.UserEntity;
import mx.imaginefirst.ceres.interfaces.IModel;

@JsonIgnoreProperties(ignoreUnknown=true)
@SuppressWarnings("serial")
@Entity
public class User extends BaseObject implements IModel {
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private String apellido_paterno;

	@Column(nullable = true)
	private String apellido_materno;

	@Column(nullable = false)
	private String correo;

	@Column(nullable = true)
	private String telefono;
	
	@Column(nullable = false)
	private String password;

	@Column(nullable = true)
	private String fotografia;
	
	@OneToOne
	private Rol rol;
	
	@Override
	public Object toEntity() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		UserEntity entity = mapper.convertValue(this, UserEntity.class);
		return entity;
	}
	
	public void initBasicUser() {
		this.setTelefono("");
		this.setFotografia("../avatar/001.png");
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

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFotografia() {
		return fotografia;
	}

	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
}