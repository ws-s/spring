package day2.boost;
/**
 * 异常增强的切面类
 * @author lindy
 * @创建时间 2020年4月17日下午3:27:45
 */

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class ErrorLogger {
	private Logger log = Logger.getLogger(ErrorLogger.class);
	
	// 定义一个增强的方法
	public void aterThrowing(JoinPoint jp,RuntimeException e) {
		log.info("调用 " + jp.getTarget()+" 的 "+ jp.getSignature().getName() +" 方法时发生异常！");
	}
}
