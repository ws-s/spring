import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day2.pojo.Teacher;
import day2.pojo.User;
import day2.service.UsaerService;

class TestThrowing {

	@Test
	void test() {
		// 获得ApplicationContext对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext5.xml");
		UsaerService us = (UsaerService) ctx.getBean("userService");
		Teacher t = new Teacher();
		t.setId(1);
		t.setTname("张老师");
		User user = new User("张三", 20, "四川绵阳", t);
		us.save(user);
	}

}
