package com.nt.beans;

public class RequestHandler {
	private static int count=0;

	//count of request 
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler::0-param constructor Request No:: "+count);
	}
	
	public void requestHandle(String data)
	{
		System.out.println("Request Data "+data+" is handled by ::"+count);
	}
	
}
