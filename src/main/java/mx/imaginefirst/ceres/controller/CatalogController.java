/*
 * *******************************************************************************
 *   Copyright 2015 Mercury Solutions.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import mx.imaginefirst.ceres.domain.usuario.Rol;
import mx.imaginefirst.ceres.entity.usuario.RolEntity;
import mx.imaginefirst.ceres.services.usuario.RolService;

@RestController
@RequestMapping("/api")
@Api(description = "Catalogos API", value = "")
public class CatalogController {

	private final static Log log = LogFactory.getLog(CatalogController.class);

	@Autowired
	private RolService rolService;

	@RequestMapping(value = "/roles", method = RequestMethod.GET)
	@ApiOperation(value = "Regresa todos los roles", notes = "Regresa todos los roles")
	public ResponseEntity<List<RolEntity>> findByEmail() {
		ResponseEntity<List<RolEntity>> response = null;
		
		List<Rol> roles = rolService.findAll();
		ArrayList<RolEntity> savedRol = new ArrayList<RolEntity>();
		
		for(Rol rol : roles) {
			RolEntity entity = (RolEntity) rol.toEntity();
			savedRol.add(entity);
		}
		
		response = new ResponseEntity<List<RolEntity>>(savedRol, HttpStatus.OK);
		return response;
	}	
}