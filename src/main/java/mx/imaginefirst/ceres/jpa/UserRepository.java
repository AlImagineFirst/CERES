/*
 * *******************************************************************************
 *   Copyright 2015 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.imaginefirst.ceres.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String email);

	public User findByNickname(String nickname);
	
	public List<User> findAllByEmailAndPassword(String email, String password);
	
	public List<User> findAllByNicknameAndPassword(String nickname, String password);
}
