import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import 静态代理.ProxyLand;

class TestLand {

	@Test
	void test() {
		// 创建一个代理对象
		ProxyLand pland = new ProxyLand();
		// 调用代理对象的方法
		pland.proxyTenement();
	}

}
