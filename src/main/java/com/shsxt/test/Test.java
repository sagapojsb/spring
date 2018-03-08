package com.shsxt.test;

import org.springframework.context.ApplicationContext;

/**
 * 測試
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-context.xml");

		HelloService hs = (HelloService) act.getBean("helloService");

		hs.print();
	}
}
