package edu.mum.ea.dao;

import edu.mum.ea.domain.UserCredentials;

public interface UserCredentialsDao extends GenericDao<UserCredentials> {
  
	public UserCredentials findByUserNamePassword(String userName, String password);

	public UserCredentials findByUsername(String username);
}
