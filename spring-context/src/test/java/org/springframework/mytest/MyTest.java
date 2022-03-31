package org.springframework.mytest;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mytest.beans.TestConfig;
import org.springframework.mytest.beans.TestService;

/**
 * @Description TODO
 * @Author 刘强#81013684
 * @Date 2021/12/22
 */
public class MyTest {

	@Test
	public void testAnnotationConfig(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(TestConfig.class);
		context.refresh();
		TestService testService = (TestService) context.getBean("testService");
		testService.test();


	}


}
