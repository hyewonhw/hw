package com.gdu.pre.aop;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


@Component  // RequestLoggingAspect Ŭ������ Bean���� ����� �νÿ�.
@Aspect     // �ȳ�. �� Aspect��. AOP �����Ϸ��� ���� �ʿ���.
public class RequestLoggingAspect {
	
	
	// �ΰ�
	private static final Logger LOG = LoggerFactory.getLogger(RequestLoggingAspect.class);

	
	// ����Ʈ�� ����
	@Pointcut("within(com.gdu.app11.controller..*)")  // ��Ʈ�ѷ��� ��� �޼ҵ带 ����Ʈ������ �����ϰڴ�.
	                                                  // ��Ʈ�ѷ��� ��� �޼ҵ忡�� �����̽�(�ֿܼ� �α� ���)�� �����Ѵ�.
	public void setPointCut() { }  // ���� ����Ʈ�� ����� �����ϱ� ���� �޼ҵ�(�̸� : �ƹ��ų�, ���� : ����)
	
	
	// �����̽� ����
	// �����̽� ���� ����
	// @Before, @After, @AfterReturning, @AfterThrowing, @Around
	@Around("com.gdu.app11.aop.RequestLoggingAspect.setPointCut()")  // setPointCut() �޼ҵ忡 ������ ����Ʈ�ƿ��� �����ϴ� �����̽�
	public Object executeLogging(ProceedingJoinPoint joinPoint) throws Throwable {  // @Around�� �ݵ�� ProceedingJoinPoint joinPoint �����ؾ� ��
		
		// HttpServletRequest�� ����ϴ� ���
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		
		// HttpServletRequest�� Map���� �ٲٱ�
		// �Ķ���ʹ� Map�� key�� �ǰ�, ���� Map�� value�� �ȴ�.
		Map<String, String[]> map = request.getParameterMap();
		String params = "";
		if(map.isEmpty()) {
			params += "[No Parameter]";
		} else {
			for(Map.Entry<String, String[]> entry : map.entrySet()) {				
				params += "[" + entry.getKey() + "=" + String.format("%s", (Object[])entry.getValue()) + "]";
			}
		}
		
		// �����̽��� proceed() �޼ҵ� ���� ����� ��ȯ
		Object result = null;
		try {
			result = joinPoint.proceed(joinPoint.getArgs());
		} catch (Exception e) {
			throw e;
		} finally {
			// ������ ����Ǵ� ����(���⼭ �α׸� ��´�.)
			// ġȯ���� : {}
			LOG.info("{} {} {} > {}", request.getMethod(), request.getRequestURI(), params, request.getRemoteHost());
		}
		
		return result;
		
	}
	
}