package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "homePage",urlPatterns = {"*.sess"})
public class loginServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sess = req.getSession();
		resp.getWriter().print("the user is: " + sess.getAttribute("user")
						+ " their password is: " + sess.getAttribute("pass") + " id is: "
						+ sess.getId());
		System.out.println(sess.getAttribute("user"));
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sess = req.getSession();
		switch (req.getRequestURI()) {
		case "/ReimbursementProject/login.sess":
			sess.setAttribute("user", req.getParameter("username"));
			sess.setAttribute("pass", req.getParameter("password"));
			break;
		}
	}
	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String username = request.getParameter("user");
//		String password = request.getParameter("pass");
//		
//		System.out.println("username is: " + username);
//		System.out.println("password is: " + password);
//		
//		// get response writer
//        PrintWriter writer = response.getWriter();
//         
//        // build HTML code
//        String htmlRespone = "<html>";
//        htmlRespone += "<h2>Your username is: " + username + "<br/>";      
//        htmlRespone += "Your password is: " + password + "</h2>";    
//        htmlRespone += "</html>";
//         
//        // return response
//        writer.println(htmlRespone);
//	}

}
