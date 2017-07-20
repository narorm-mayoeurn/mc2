package edu.mum.ea.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.ea.dao.UserCredentialsDao;
import edu.mum.ea.domain.UserCredentials;

@Repository
public class UserCredentialsDaoImpl extends GenericDaoImpl<UserCredentials> implements UserCredentialsDao {

	public UserCredentialsDaoImpl() {
		super.setDaoType(UserCredentials.class);
	}

	public UserCredentials findByUserNamePassword(String userName, String password) {

		Query query = entityManager
				.createQuery("select m from Authentication m  where m.userName =:userName and m.password=:password");
		return (UserCredentials) query.setParameter("userName", userName).setParameter("password", password)
				.getSingleResult();

	}


	public UserCredentials findByUsername(String username) {

		Query query = entityManager
				.createQuery("select m from Authentication m  where m.userName =:userName");
		return (UserCredentials) query.setParameter("userName", username)
				.getSingleResult();

	}
}