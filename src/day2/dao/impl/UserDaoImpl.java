package day2.dao.impl;

import day2.dao.UserDao;
import day2.pojo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void save(User user) {
		System.out.println("�����û��ɹ�����"+user.toString());
		//throw new RuntimeException("�ֶ��׳��쳣������");
	}

}
