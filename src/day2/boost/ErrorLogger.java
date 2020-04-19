package day2.boost;
/**
 * �쳣��ǿ��������
 * @author lindy
 * @����ʱ�� 2020��4��17������3:27:45
 */

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class ErrorLogger {
	private Logger log = Logger.getLogger(ErrorLogger.class);
	
	// ����һ����ǿ�ķ���
	public void aterThrowing(JoinPoint jp,RuntimeException e) {
		log.info("���� " + jp.getTarget()+" �� "+ jp.getSignature().getName() +" ����ʱ�����쳣��");
	}
}
