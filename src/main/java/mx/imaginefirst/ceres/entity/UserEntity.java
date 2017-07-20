/*
 * *******************************************************************************
 *   Copyright 2017 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;

import mx.imaginefirst.ceres.domain.Usuario;
import mx.imaginefirst.ceres.interfaces.IEntity;

public class UserEntity implements IEntity {
	
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
		Usuario usuario = mapper.convertValue(this, Usuario.class);
		return usuario;
	}

	
}