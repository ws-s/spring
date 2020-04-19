package aop.dao.impl;

import java.util.ArrayList;
import java.util.List;

import aop.dao.UserDao;
import aop.pojo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void saveUser(User user) {
		List<User> list = new ArrayList<User>();
		list.add(user);
		System.out.println("增加用户信息成功");
	}

}
