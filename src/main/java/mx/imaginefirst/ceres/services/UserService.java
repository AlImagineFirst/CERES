/*
 * *******************************************************************************
 *   Copyright 2015 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.imaginefirst.ceres.domain.Usuario;
import mx.imaginefirst.ceres.jpa.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager entityManager;
	
	/**
	 * Find User by email
	 * 
	 * @param email
	 * @return
	 */
	public Usuario findByEmail(String email) {
		Usuario user = userRepository.findByEmail(email);
		return user;
	}
	
	/**
	 * Find User by nickname
	 * 
	 * @param nickname
	 * @return
	 */
	public Usuario findByNickname(String nickname) {
		Usuario user = userRepository.findByNickname(nickname);
		return user;
	}
	
	/**
	 * Find User by email and password
	 * 
	 * @param email
	 * @return
	 */
	public List<Usuario> findAllByEmailAndPassword(String email, String password) {
		List<Usuario> users = userRepository.findAllByEmailAndPassword(email, password);
		return users;
	}

	/**
	 * Find User by nickname and password
	 * 
	 * @param nickname
	 * @return
	 */
	public List<Usuario> findByNicknameAndPassword(String nickname, String password) {
		List<Usuario> users = userRepository.findAllByNicknameAndPassword(nickname, password);
		return users;
	}
	
	/**
	 * Returns a detached User. This method is used for update method
	 * 
	 * @param id
	 * @return
	 */
	public Usuario findUserDetached(long id) {
		Usuario user = userRepository.findOne(id);
		entityManager.detach(user);
		return user;
	}
	
	/**
	 * Verify if the user exists in the database
	 * 
	 * @param id
	 * @return
	 */
	public boolean exists(Long id) {
    	return userRepository.exists(id);
    }

	/**
	 * Saves an user.
	 * 
	 * @param user
	 *            User to save
	 * 
	 * @return Saved user
	 */
	public Usuario save(Usuario user) {
		Usuario savedUser = userRepository.save(user);
		return savedUser;
	}
}