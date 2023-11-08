package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GirlDriver {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		 Girl girl = context.getBean("girl",Girl.class);
		System.out.println(girl);
		System.out.println(girl.ice);
	}
}
