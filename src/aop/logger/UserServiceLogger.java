package aop.logger;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

/**
 * 为业务层中的方法添加增加的日志信息类
 * @author lindy
 * @创建时间 2020年4月14日下午4:11:22
 */
public class UserServiceLogger {
	private Logger log = Logger.getLogger(UserServiceLogger.class);
	// 调用保存方法前的增强方法
	public void before(JoinPoint jp) {
		log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()
				+" 方法。方法参数："+Arrays.toString(jp.getArgs()));
	}
	// 调用保存方法后的增强方法
	public void after(JoinPoint jp,Object result) {
		log.info("调用"+jp.getTarget()+" 的"+jp.getSignature().getName()
				+" 方法，方法返回值是：" + result);
	}
}
