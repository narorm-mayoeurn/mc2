package edu.mum.ea.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.ea.dao.UserCredentialsDao;
import edu.mum.ea.domain.UserCredentials;
import edu.mum.ea.service.UserCredentialsService;

@Service
@Transactional 
public class UserCredentialsServiceImpl implements UserCredentialsService {
	
 	@Autowired
	private UserCredentialsDao userCredentialsDao;

 	
     public void save( UserCredentials userCredentials) {  		
  		userCredentialsDao.save(userCredentials);
 	}
  	
  	
	public List<UserCredentials> findAll() {
		return (List<UserCredentials>)userCredentialsDao.findAll();
	}

	public UserCredentials findByUserNamePassword(String userName, String password) {
		return userCredentialsDao.findByUserNamePassword(userName, password);
	}


	@Override
	public UserCredentials update(UserCredentials userCredentials) {
		return userCredentialsDao.update(userCredentials);
	
	}

}
