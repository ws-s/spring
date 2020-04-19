import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestSpring {

	@Test
	void test() {
		// 1、通过spring的配置文件来创建一个对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2、通过applicationContext对象的方法去获得配置文件中bean
		SpringTest test = (SpringTest) ctx.getBean("test");
		// 3、调用这个对象的方法来实现输出
		test.print();
	}

}