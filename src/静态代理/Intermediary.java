package 静态代理;
/**
 * 中介
 * @author lindy
 * @创建时间 2020年4月14日下午3:02:17
 */
public class Intermediary {
	// 租房前
	public static void before() {
		System.out.println("带客户看房.....");
		System.out.println("沟通价格.......");
	}
	// 租房后
	public static void after() {
		System.out.println("交付钥匙.......");
	}
}
