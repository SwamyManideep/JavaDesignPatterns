package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControllerServlet
 */
@WebServlet("/FrontControllerServlet")
public class FrontControllerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                 
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
		
		String username=request.getParameter("username");
		String password=request.getParameter("pwd2");
		
		if (password.equals("Manideep1")) {
			
			RequestDispatcher rd=request.getRequestDispatcher("/Success.jsp");
			rd.forward(request, response);
		} else {

			RequestDispatcher rd=request.getRequestDispatcher("/Error.jsp");
			rd.forward(request, response);
		}

	}

}
