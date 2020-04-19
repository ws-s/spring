import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day2.pojo.TestEntity;

public class TestEntityDemo {

	@Test
	void test() {
		// 1、通过spring的配置文件来创建一个对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext4.xml");
		// 2、通过applicationContext对象的方法去获得配置文件中bean
		TestEntity test = (TestEntity) ctx.getBean("entity");
		// 3、调用这个对象的方法来实现输出
		test.showValue();
	}

}