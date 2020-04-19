import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import print.Printer;

class TestPrinter {

	@Test
	void test() {
		// 1、创建ApplicationContext对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext1.xml");
		// 2、通过getBean方法获得配置的bean信息，并保存这个对象
		Printer p = (Printer) ctx.getBean("printer");
		// 3、调用对象的方法来实现操作
		p.print();
	}

}
