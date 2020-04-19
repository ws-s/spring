import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day2.pojo.TestEntity;

public class TestEntityDemo {

	@Test
	void test() {
		// 1��ͨ��spring�������ļ�������һ������
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext4.xml");
		// 2��ͨ��applicationContext����ķ���ȥ��������ļ���bean
		TestEntity test = (TestEntity) ctx.getBean("entity");
		// 3�������������ķ�����ʵ�����
		test.showValue();
	}

}