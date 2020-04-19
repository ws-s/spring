import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day2.pojo.Teacher;
import day2.pojo.User;
import day2.service.UsaerService;

class TestUser {

	@Test
	void test() {
		// 创建ApplicationContext对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext3.xml");
		/*
		 * User user = (User) ctx.getBean("user"); System.out.println(user.toString());
		 * System.out.println("=========================================");
		 * 
		 * User user1 = (User)ctx.getBean("user1");
		 * System.out.println(user1.toString());
		 * 
		 */
		
		UsaerService us = (UsaerService) ctx.getBean("userService");
		Teacher t = new Teacher();
		t.setId(1);
		t.setTname("张老师");
		User user = new User("张三", 20, "四川绵阳", t);
		us.save(user);
	}

}
