package day2.boost;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class AfterLogger {
	private Logger log = Logger.getLogger(AfterLogger.class);
	
	// 定义一个最终增强的切面方法
	// 最终增强，其实就是在主要业务方法执行完后再执行的操作  交付钥匙
	public void afterLog(JoinPoint jp) {
		log.info("调用 "+jp.getTarget()+" 的 "+ jp.getSignature().getName()+" 方法结束！！！");
	}
}
