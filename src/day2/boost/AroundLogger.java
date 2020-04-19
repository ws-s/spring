package day2.boost;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class AroundLogger {
	private Logger log = Logger.getLogger(AroundLogger.class);
	
	public Object aroundLog(ProceedingJoinPoint jp) throws Throwable {
		log.info("���� "+jp.getTarget()+" �� " + jp.getSignature().getName()+" ����,���������:"
				+ Arrays.toString(jp.getArgs()));
		Object result = null;
		try {
			 result = jp.proceed();// ִ��Ŀ�귽�����õ����ķ���ֵ
			 log.info("���� "+jp.getTarget()+" �� " + jp.getSignature().getName()+" ����,�����ķ���ֵ:"
						+ result);
		}catch (Throwable e) {
			 log.info("���� "+jp.getTarget()+" �� " + jp.getSignature().getName()+" ���������쳣");
			throw e;
		}finally {
			log.info("���� "+jp.getTarget()+" �� " + jp.getSignature().getName()+" ����ִ�н�������");
		}
		return result;
	}
}
