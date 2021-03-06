package com.luv2code.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set content type
		response.setContentType("text/html");
		
		//Get PrintWriter
		PrintWriter out = response.getWriter();
		
		//Generate html content
		out.println("<!DOCTYPE html>");
		out.println("<html><head>");
		out.println("<title>Servlet response</title></head>");
		out.println("<body>");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		out.println("The student is confirmed: " + firstName + " " + lastName + "<br/>");
		out.println("<a href=\"student-form.html\">Back to form</a>");
		out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
