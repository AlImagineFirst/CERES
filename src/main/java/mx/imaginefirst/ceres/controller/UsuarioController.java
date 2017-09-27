/*
 * *******************************************************************************
 *   Copyright 2015 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;

import mx.imaginefirst.ceres.services.usuario.UserService;

@RestController
@RequestMapping("/api")
@Api(description = "User Model API", value = "")
public class UsuarioController {

	private final static Log log = LogFactory.getLog(UsuarioController.class);

	@Autowired
	private UserService userService;
	
	
	

}