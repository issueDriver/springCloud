
package com.zuojie.dao;

import java.util.ArrayList;
import java.util.List;

import com.zuojie.entity.UserEntity;
import org.springframework.stereotype.Component;


@Component
public class UserDao {

	public List<UserEntity> getAllUser() {
		List<UserEntity> listUser = new ArrayList<UserEntity>();
		for (int i = 0; i < 20; i++) {
			listUser.add(new UserEntity(i, "name:" + i));
		}
		return listUser;
	}

}
