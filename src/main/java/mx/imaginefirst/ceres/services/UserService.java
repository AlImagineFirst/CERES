/*
 * *******************************************************************************
 *   Copyright 2015 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.imaginefirst.ceres.domain.CustomCriteria;
import mx.imaginefirst.ceres.domain.Usuario;
import mx.imaginefirst.ceres.jpa.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager entityManager;
	
	
	public List<Usuario> findByCustomFilter(Set<CustomCriteria> criterias) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
	    CriteriaQuery<Usuario> criteriaQuery = criteriaBuilder.createQuery(Usuario.class);
	    Root<Usuario> user = criteriaQuery.from(Usuario.class);

	    Path<String> namePath = user.get("name");
	    Path<String> userTypeClassTypeDisplayName = 
	                     user.get("userType").get("classType").get("displayName");
	    Path<String> userTypeModel = user.get("userType").get("model");
	    List<Predicate> predicates = new ArrayList<>();
	    for(String word : words) {
	        Expression<String> wordLiteral = criteriaBuilder.literal(word);
	        predicates.add(
	                criteriaBuilder.or(
	                    criteriaBuilder.like(criteriaBuilder.lower(namePath), criteriaBuilder.lower(wordLiteral)),
	                    criteriaBuilder.like(criteriaBuilder.lower(userTypeClassTypeDisplayName),
	                            criteriaBuilder.lower(wordLiteral)),
	                    criteriaBuilder.like(criteriaBuilder.lower(userTypeModel), criteriaBuilder.lower(wordLiteral))
	                )
	        );
	    }
	    criteriaQuery.select(doc).where(
	            criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]))
	    );

	    return entityManager.createQuery(criteriaQuery).getResultList();
	}
//	
//	/**
//	 * Find User by email
//	 * 
//	 * @param email
//	 * @return
//	 */
//	public Usuario findByEmail(String email) {
//		Usuario user = userRepository.findByEmail(email);
//		return user;
//	}
//	
//	/**
//	 * Find User by nickname
//	 * 
//	 * @param nickname
//	 * @return
//	 */
//	public Usuario findByNickname(String nickname) {
//		Usuario user = userRepository.findByNickname(nickname);
//		return user;
//	}
//	
//	/**
//	 * Find User by email and password
//	 * 
//	 * @param email
//	 * @return
//	 */
//	public List<Usuario> findAllByEmailAndPassword(String email, String password) {
//		List<Usuario> users = userRepository.findAllByEmailAndPassword(email, password);
//		return users;
//	}
//
//	/**
//	 * Find User by nickname and password
//	 * 
//	 * @param nickname
//	 * @return
//	 */
//	public List<Usuario> findByNicknameAndPassword(String nickname, String password) {
//		List<Usuario> users = userRepository.findAllByNicknameAndPassword(nickname, password);
//		return users;
//	}
//	
//	/**
//	 * Returns a detached User. This method is used for update method
//	 * 
//	 * @param id
//	 * @return
//	 */
//	public Usuario findUserDetached(long id) {
//		Usuario user = userRepository.findOne(id);
//		entityManager.detach(user);
//		return user;
//	}
//	
//	/**
//	 * Verify if the user exists in the database
//	 * 
//	 * @param id
//	 * @return
//	 */
//	public boolean exists(Long id) {
//    	return userRepository.exists(id);
//    }
//
//	/**
//	 * Saves an user.
//	 * 
//	 * @param user
//	 *            User to save
//	 * 
//	 * @return Saved user
//	 */
//	public Usuario save(Usuario user) {
//		Usuario savedUser = userRepository.save(user);
//		return savedUser;
//	}
}