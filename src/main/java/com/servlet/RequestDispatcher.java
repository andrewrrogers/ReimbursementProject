package com.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDispatcher {
	
	public static void dataRetriever(HttpServletRequest req, HttpServletResponse res) {
		System.out.println(req.getRequestURI());
//		switch (req.getRequestURI()) {
//		case "/BootWebService/user.json":
//			new UserController().findAllUsers(req, res);
//			break;
//		}
	}

	public static String retrievePage(HttpServletRequest req) {
		System.out.println(req.getRequestURI());
		
		switch (req.getRequestURI()) {
		case "/ReimbursementProject/html/login.sess":
			return "html/index.html";
		default:
			return "html/404-page.html";
		}
	}

}
