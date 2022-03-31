package org.springframework.mytest.beans;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author 刘强#81013684
 * @Date 2022/3/28
 */
@Aspect
@Component
public class TestAspect {

	@Pointcut("execution(* org.springframework.mytest.beans.**.*(..))")
	public void test(){

	}

	@Before("test()")
	public void beforeTest(){
		System.out.println("before");
	}

	@After("test()")
	public void afterTest(){
		System.out.println("after");
	}
}
