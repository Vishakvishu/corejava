package com.xworkz.king;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 15,urlPatterns = "/king")
public class KingServlet extends HttpServlet{
	
	public KingServlet () {
		System.out.println("Created :" + this.getClass().getSimpleName());
		}

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running in king era ...........");

			String name = req.getParameter("Name");
			String region = req.getParameter("region");
			String noOfQueens = req.getParameter("noOfQueens");
			String DOB = req.getParameter("DOB");
			String DOD = req.getParameter("DOD");

			System.out.println(name);
			System.out.println(region);
			System.out.println(noOfQueens);
			System.out.println(DOB);
			System.out.println(DOD);

			PrintWriter writ = resp.getWriter();
			writ.print("<html>");
			writ.print("<body>");
			writ.print("<h1>");
			writ.print("<spam style= 'color :blue'>");

			writ.print("King name =" + name + " " + "Printing Successfully");

			writ.print("</spam>");
			writ.print("</h1>");
			writ.print("</body>");
			writ.print("</html>");

			resp.setContentType("text/html");
		}

}
