package day2.dao.impl;

import day2.dao.UserDao;
import day2.pojo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void save(User user) {
		System.out.println("增加用户成功！！"+user.toString());
		//throw new RuntimeException("手动抛出异常！！！");
	}

}
