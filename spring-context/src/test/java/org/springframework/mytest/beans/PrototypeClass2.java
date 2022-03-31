package org.springframework.mytest.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * @Description TODO
 * @Author 刘强#81013684
 * @Date 2022/3/29
 */
@Component
@Scope(scopeName = "prototype")
public class PrototypeClass2 {

	private Integer count = 0;

	public void showProto(){
		System.out.println(count ++);
	}
}
