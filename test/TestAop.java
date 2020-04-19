import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.pojo.User;
import aop.service.UserService;

class TestAop {

	@Test
	void test() {
		// 创建ApplicationContext对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		// 通过getBean方法获得对象
		UserService us = (UserService) ctx.getBean("userService");
		// 调用对象的方法执行操作
		User user = new User(1, "张三", 18);
		us.saveUser(user);
	}

}
