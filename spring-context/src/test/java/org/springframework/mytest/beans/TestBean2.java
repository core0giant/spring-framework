package org.springframework.mytest.beans;

import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author 刘强#81013684
 * @Date 2021/12/22
 */
@Component
public class TestBean2 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
