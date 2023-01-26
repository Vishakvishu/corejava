package com.xworkz.olympic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 34,urlPatterns = "/olympic")
public class OlympicServlet extends HttpServlet{
	
	public OlympicServlet() {
		System.out.println("Created :" + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running in olympic ...........");

		String id = req.getParameter("id");
		String gamesType = req.getParameter("gamesType");
		String playerName = req.getParameter("playerName");
		String country = req.getParameter("country");
		String noOfPlayers = req.getParameter("noOfPlayers");

		String noOfTeams = req.getParameter("noOfTeams");
		String noOfMedals = req.getParameter("noOfMedals");
		String jerseyNo = req.getParameter("jerseyNo");
		String winningPrizeAmount = req.getParameter("winningPrizeAmount");
		String medalType = req.getParameter("medalType");

		System.out.println(id);
		System.out.println(gamesType);
		System.out.println(playerName);
		System.out.println(country);
		System.out.println(noOfPlayers);
		System.out.println(noOfTeams);
		System.out.println(noOfMedals);
		System.out.println(jerseyNo);
		System.out.println(winningPrizeAmount);
		System.out.println(medalType);

		PrintWriter writ = resp.getWriter();
		writ.print("<html>");
		writ.print("<body>");
		writ.print("<h1>");
		writ.print("<spam style= 'color :blue'>");

		writ.print("Olympic name ="  + " " + "Printing Successfully");

		writ.print("</spam>");
		writ.print("</h1>");
		writ.print("</body>");
		writ.print("</html>");

		resp.setContentType("text/html");
	}


}
