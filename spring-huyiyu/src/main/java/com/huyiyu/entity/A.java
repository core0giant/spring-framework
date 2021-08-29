package com.huyiyu.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class A {

	@Autowired
	private B b;


}
