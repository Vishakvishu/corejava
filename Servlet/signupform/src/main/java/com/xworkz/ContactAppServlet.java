package com.xworkz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 98, urlPatterns = "/contact")
public class ContactAppServlet extends HttpServlet {
	
	
		public ContactAppServlet() {
			System.out.println("Created :" + this.getClass().getSimpleName());
		}


		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("created dopost and servicing it");
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String number = req.getParameter("number");
			String commet = req.getParameter("comments");
			//Long mobile = Long.parseLong(number);

			System.out.println(name);
			System.out.println(email);
			System.out.println(number);
			System.out.println(commet);

			PrintWriter writer = resp.getWriter();
			writer.print("<html>");
			writer.print("<h1>");
			if (name.length() > 3 && email.length() > 3 && number.length() == 10 && commet.length() > 3) {
				writer.print("<span style='color:pink'>");
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
			writer.print("<a href=\"contact.html\">sign in again</a>");
			writer.print("</body>");
			writer.print("</html>");

			resp.setContentType("text/html");

		}
	}