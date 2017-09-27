package mx.imaginefirst.ceres.controller;

import java.util.ArrayList;
import java.util.List;

import mx.imaginefirst.ceres.domain.usuario.Rol;

public class CatalogosInit {
	
	public List<Rol> crearRoles() {
		ArrayList<Rol> roles = new ArrayList<Rol>(); 
		
		Rol rol = new Rol("Administrador", "Administrador");
		roles.add(rol);
		
		rol = new Rol("Empresa", "Empresa");
		roles.add(rol);
		
		rol = new Rol("Alumno", "Alumno");
		roles.add(rol);
		
		rol = new Rol("Prácticas y Estadías", "Prácticas y Estadías");
		roles.add(rol);
		
		rol = new Rol("Egresados", "Egresados");
		roles.add(rol);
		
		rol = new Rol("Director", "Director");
		roles.add(rol);
		
		rol = new Rol("Tutor", "Tutor");
		roles.add(rol);
	
		return roles;
	}

}
