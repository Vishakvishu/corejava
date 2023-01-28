package com.xworkz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 16, urlPatterns = "/location")
public class LocationAppServlet extends HttpServlet {

	
	

		public LocationAppServlet() {
			System.out.println("Created :" + this.getClass().getSimpleName());
		}

		

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("created dopost and servicing it");
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String start = req.getParameter("start");
			String end = req.getParameter("destination");
			String gender = req.getParameter("gender");
			

			System.out.println(name);
			System.out.println(email);
			System.out.println(start);
			System.out.println(end);
			System.out.println(gender);

			PrintWriter writer = resp.getWriter();
			writer.print("<html>");
			writer.print("<body>");
			writer.print("<h1>");
			if (name.length() > 3 && email.length() > 3 && start.length() > 3 && end.length() > 3) {
				writer.print("<span style='color:purple'>");
				writer.print("Signed up sucessfully");
				writer.print("</span>");
			} else {
				writer.print("<span style='color:blue'>");
				writer.print("Please insert valid info");
				writer.print("</span>");
			}

			writer.print("</h1>");
			writer.print("<a href=\"index.html\">home page</a>");
			writer.print("<br>");
			writer.print("<a href=\"location.html\">sign in again</a>");
			writer.print("</body>");
			writer.print("</html>");

			resp.setContentType("text/html");

		}

	}
