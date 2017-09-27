/*
 * *******************************************************************************
 *   Copyright 2015 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.services.usuario;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.imaginefirst.ceres.domain.usuario.Rol;
import mx.imaginefirst.ceres.jpa.usuario.RolRepository;

@Service
public class RolService {

	@Autowired
	private RolRepository rolRepository;
	
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager entityManager;
	
	/**
	 * Guarda un rol.
	 * 
	 * @param rol
	 *            Rol a ser guardado
	 * 
	 * @return Rol Guardado
	 */
	public Rol save(Rol rol) {
		Rol savedItem = rolRepository.save(rol);
		return savedItem;
	}
	
	/**
	 * Todos los roles.
	 * 
	 * @return Todos los roles
	 */
	public List<Rol> findAll() {
		List<Rol> savedItems = rolRepository.findAll();
		return savedItems;
	}
	
	/**
	 * Verifica si existe un rol por nombre.
	 * 
	 * @return Verdadero si existe: Falso en otro caso
	 */
	public boolean exists(String nombre) {
		Rol savedItem = rolRepository.findByNombre(nombre);
		return savedItem == null ? false : true;
	}
}