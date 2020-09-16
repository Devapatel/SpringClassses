package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer {
	private String beanId;
	
	//inject RequestHandler beanId 
	public WebContainer(String beanId) {
		System.out.println("WebContainer::1-param constructor");
		this.beanId = beanId;
	}

		
	public void webRequest(String data)
	{
		ApplicationContext ctx=null;
		RequestHandler handler=null;
		
		//create Extra IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		handler=ctx.getBean(beanId,RequestHandler.class);
		System.out.println("==>"+handler.hashCode());
		handler.requestHandle(data);
	}

}
