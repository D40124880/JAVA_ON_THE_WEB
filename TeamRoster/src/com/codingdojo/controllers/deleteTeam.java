package com.codingdojo.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import com.codingdojo.models.League;
import com.codingdojo.models.Team;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class deleteTeam
 */
@WebServlet("/deleteTeam")
public class deleteTeam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteTeam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		League tempLeague = (League) session.getAttribute("league");
		int teamIdx = Integer.parseInt(request.getParameter("teamid"));
		ArrayList<Team> tempTeams = tempLeague.getTeams();
		tempTeams.remove(teamIdx);
	
		response.sendRedirect("/TeamRoster/Home");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
