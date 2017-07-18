package edu.mum.ea.service;

import java.util.List;

import edu.mum.ea.domain.UserCredentials;
 
public interface UserCredentialsService {

	public void save(UserCredentials userCredentials);
	public UserCredentials update(UserCredentials userCredentials);
	public List<UserCredentials> findAll();
	public UserCredentials findByUserNamePassword(String userName, String password);
 }
