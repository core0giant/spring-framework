package com.huyiyu;

import com.huyiyu.entity.C;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Application.class);
		C bean = annotationConfigApplicationContext.getBean(C.class);
		System.out.println(bean);

	}


}
