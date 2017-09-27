/*
 * *******************************************************************************
 *   Copyright 2017 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.entity.usuario;

import com.fasterxml.jackson.databind.ObjectMapper;

import mx.imaginefirst.ceres.domain.usuario.Usuario;
import mx.imaginefirst.ceres.interfaces.IEntity;

public class UsuarioEntity implements IEntity {

	private Long id;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String correo;
	private String telefono;
	private String password;
	private String fotografia;

	@Override
	public Object toModel() {
		ObjectMapper mapper = new ObjectMapper();
		Usuario model = mapper.convertValue(this, Usuario.class);
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
}
