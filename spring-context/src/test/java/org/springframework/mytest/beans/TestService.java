package org.springframework.mytest.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Init;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author 刘强#81013684
 * @Date 2022/3/25
 */
@Service
public class TestService {

	@Autowired
	@Lazy
	private TestBean1 testBean1;

	private static List<StrategyInterface> strategyInterfaceList = new ArrayList<>();

	@Autowired
	private void setStrategyInterfaceList(List<StrategyInterface> strategyInterface){
		strategyInterfaceList.addAll(strategyInterface);
	}

	@Autowired
	private PrototypeClass prototypeClass;

	@PostConstruct
	public void testAfterAutowire(){
//		System.out.println(strategyInterfaceList.size());
		System.out.println(prototypeClass.getClass().getName());
		System.out.println(prototypeClass.getClass().getName());
		System.out.println(prototypeClass.getClass().getName());
		System.out.println(getPrototypeClass2());
		System.out.println(getPrototypeClass2());
		System.out.println(getPrototypeClass2());

	}

	@Lookup
	public  PrototypeClass2 getPrototypeClass2(){
		return null;
	}

	public void test(){
		System.out.println("test");
	}

}
