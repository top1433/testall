package net.xinqushi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component(value="log")
public class Log {
	@Pointcut(value="execution(* net.xinqushi.service.impl.*.*(..))")
	public void Point() {}
	@Before("Point()")
	public void mybefore(JoinPoint jp) {
		System.out.println(jp.getSignature());
		System.out.println("方法执行开始......");
	}
	@AfterReturning("Point()")
	public void myend(JoinPoint jp) {
		System.out.println("方法执行结束......");
		System.out.println(jp.getSignature());
	}

}
