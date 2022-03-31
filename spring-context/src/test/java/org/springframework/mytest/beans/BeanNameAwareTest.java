package org.springframework.mytest.beans;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.core.testfixture.stereotype.Component;

/**
 * @Description TODO
 * @Author 刘强#81013684
 * @Date 2022/3/31
 */
@Component
public class BeanNameAwareTest implements BeanNameAware {

	private String name;

	@Override
	public void setBeanName(String name) {
		this.name = name;
		System.out.println(name);
	}
}
