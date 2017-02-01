package com.luv2code.servletdemo.mvcstudent.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luv2code.servletdemo.mvcstudent.model.StudentDataUtil;
import com.luv2code.servletdemo.mvcstudent.model.Student;
import java.util.List;

/**
 * Servlet implementation class MvcStudentServlet
 */
@WebServlet("/MvcStudentServlet")
public class MvcStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MvcStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get student data from "model"
		List<Student> students = StudentDataUtil.getStudents();
		
		//add list of students to request object
		request.setAttribute("student_list", students);
		
		//get request dispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("mvc_students_view.jsp");
		
		//pass data to JSP
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
