package org.springframework.mytest.beans;

import net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution.Preserved;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author 刘强#81013684
 * @Date 2021/12/22
 */
@Component
public class TestBean1 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void testProxy(){
		System.out.println("11");
	}
}
