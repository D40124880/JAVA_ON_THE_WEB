package com.codingdojo.userinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username;
		String favlang;
		String town;
		username = request.getParameter("username");
		if(username == null) {
			username = "Unknown";
		}
		favlang = request.getParameter("favlang");
		if(favlang == null) {
			favlang = "Unknown";
		}
		town = request.getParameter("town");
		if(town == null) {
			town = "Unknown";
		}
		
		response.setContentType("text/html");
		// the responses
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome,  " + username + "</h1>");
		out.write("<h2>Your favorite language is: " + favlang + "</h2>");
		out.write("<h2>Your hometown is: " + town + "</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
