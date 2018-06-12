package com.codingdojo.guessnumber;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Number
 */
@WebServlet("/Number")
public class Number extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int randNum = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Number() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		if(session.getAttribute("randNum") == null) {
			Random r = new Random();
			randNum = r.nextInt(101) + 1;
			session.setAttribute("randNum", randNum);
		} else {
			Random r = new Random();
			randNum = r.nextInt(101) + 1;
			session.setAttribute("randNum", randNum);
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/guessnumber.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int guess = Integer.parseInt(request.getParameter("guess"));
		HttpSession session = request.getSession();
		
		if(guess > (Integer) session.getAttribute("randNum")) {
			request.setAttribute("switch", "high");
		} else if(guess < (Integer) session.getAttribute("randNum")) {
			request.setAttribute("switch", "low");
		} else {
			request.setAttribute("switch", "win");
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/guessnumber.jsp");
		view.forward(request, response);
		
		
		// here is to redirect to another page after a POST of a form
		// ...
//		public class Greeting extends HttpServlet {    
//		    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		        // do something with the POST request
//		        
//		        // redirect
//		        response.sendRedirect("/Home/Greeting");
//		    }
//		}    

		
	}
}
