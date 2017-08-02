/*
 * *******************************************************************************
 *   Copyright 2015 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.imaginefirst.ceres.domain.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {

}