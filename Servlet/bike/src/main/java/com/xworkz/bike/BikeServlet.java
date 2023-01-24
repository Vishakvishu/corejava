package com.xworkz.bike;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 5 ,urlPatterns = "/bike")
public class BikeServlet extends HttpServlet {
	
	

	  public  BikeServlet () {
		  System.out.println("created");
	  }
	  
	  @Override
		protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Delete from BIKE");
			String data = "displaying data as Delete";
			resp.getWriter().print(data);
			resp.setContentType("text/plain");
		}

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Get from Bike");
			String data = "displaying data as Get";
			resp.getWriter().print(data);


}
		@Override
		protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Head from Bike");
			String data = "displaying data as Head";
			resp.getWriter().print(data);
			resp.setContentType("text/plain");
		}

		@Override
		protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Options from Bike");
			String data = "displaying data as Options";
			resp.getWriter().print(data);
			resp.setContentType("text/plain");
		}

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Post from Bike");
			String data = "displaying data as Bike";
			resp.getWriter().print(data);
			resp.setContentType("text/plain");
		}

		@Override
		protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Put from Bike");
			String data = "displaying data as Put";
			resp.getWriter().print(data);
			resp.setContentType("text/plain");
		}

		@Override
		protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Trace from Bike");
			String data = "displaying data as Trace";
			resp.getWriter().print(data);
			resp.setContentType("text/plain");
 
       }
}