package com.huyiyu.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class C {

	@Autowired
	private A a;
	@Autowired
	private B b;


	public C() {
	}

	@Autowired
	public C(A a, B b) {
		this.a = a;
		this.b = b;
	}

	
	public C(A a) {
		this.a = a;
	}

	public C(B b) {
		this.b = b;
	}
}
