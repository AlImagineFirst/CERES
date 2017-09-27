/*
 * *******************************************************************************
 *   Copyright 2015 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.jpa.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.imaginefirst.ceres.domain.usuario.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
	
	public Rol findByNombre(String nombre);
}