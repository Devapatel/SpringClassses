package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainer;

public class LMIProblemTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WebContainer webCon=null;
		
		//create IOC container
		System.out.println("============= IOC Container Creation (main) ===========");
		
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		webCon=ctx.getBean("webCon",WebContainer.class);
		
		System.out.println("============================");
		webCon.webRequest("First ");
		System.out.println("-------------------");
		webCon.webRequest("second ");
		System.out.println("--------------------");
		webCon.webRequest("Third ");

		((AbstractApplicationContext) ctx).close();
	}

}
