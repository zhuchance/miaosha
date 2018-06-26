package com.moyhui.miaosha.service;

import com.moyhui.miaosha.dao.UserDao;
import com.moyhui.miaosha.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
	@Autowired
	UserDao userDao;

	public User getById(int id){
		return userDao.getById(id);
	}



	@Transactional
	public boolean tx() {
		User u1= new User();
		u1.setId(2);
		u1.setName("2222");
		userDao.insertUser(u1);

		User u2= new User();
		u2.setId(1);
		u2.setName("11111");
		userDao.insertUser(u2);

		return true;
	}
}
