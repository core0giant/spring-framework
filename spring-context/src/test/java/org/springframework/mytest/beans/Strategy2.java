package org.springframework.mytest.beans;

import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author 刘强#81013684
 * @Date 2022/3/28
 */
@Component
public class Strategy2 extends StrategyInterface {

	@Override
	public void strategy() {
		System.out.println("strategy2");
	}
}
