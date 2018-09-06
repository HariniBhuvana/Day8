package com.harink.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/employeeservlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Employee>empData=new ArrayList<>();
	
	
	private ServletContext context;
       
	 @Override
	    public void init(ServletConfig config)throws ServletException{
	    	context=config.getServletContext();
	    	empData.add(new Employee(1234,"Hari",25000,"Java"));
	    	empData.add(new Employee(12345,"Sudhar",25000,"C"));
	    	empData.add(new Employee(123456,"Onsite",25000,"C++"));
	    	empData.add(new Employee(14,"Sandeep",25000,"SAP"));
	    	empData.add(new Employee(12634,"Harini",25000,"Java"));    	
	    	
	    }

    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out= response.getWriter();
		String id= request.getParameter("Id");
		boolean found=false;
		 for (Employee employee : empData) {
			if(employee.getEmpId()==Long.parseLong(id))
			{
				out.println("<table border='1' align='center'> <tr> <th> ID</th> <th>Name</th><th>salary</th><th>Department Name</th></tr>");
				out.println("<tr><td>"+employee.getEmpId()+"<td>"+employee.getName()+"<td>"+employee.getSalary()+"<td>"+employee.getDeptname());
				found=true;
			}
			
		
		}
		 if(!found) {
			 out.println("Employee Doesnt exists");
		 }
		
		
	}

}
