package com.codingdojo.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import java.util.ArrayList;

import com.codingdojo.models.League;
import com.codingdojo.models.Team;

import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TeamList
 */
@WebServlet("/TeamList")
public class TeamList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeamList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/NewTeam.jsp");
		view.forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String newTeam = request.getParameter("teamname");
		HttpSession session = request.getSession();
		League tempLeague = (League) session.getAttribute("league");
		
		Team tempTeam = new Team();
		tempTeam.setTeamName(newTeam);
		ArrayList<Team> tempTeams = tempLeague.getTeams();
		
		tempTeams.add(tempTeam);
		
		tempLeague.setTeams(tempTeams);
		
		session.setAttribute("league", tempLeague);
		
		response.sendRedirect("/TeamRoster/Home");
	}

}
