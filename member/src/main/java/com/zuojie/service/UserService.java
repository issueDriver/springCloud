
package com.zuojie.service;

import java.util.List;

import com.zuojie.dao.UserDao;
import com.zuojie.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	public List<UserEntity> getAllUser() {
		  return userDao.getAllUser();
	}
	public UserEntity getUser(Integer id){
		List<UserEntity> allUser = getAllUser();
		for (UserEntity userEntity : allUser) {
			if(userEntity.getId()==id){
			   return userEntity;
			}
		}
		return null;
	}
	
}
