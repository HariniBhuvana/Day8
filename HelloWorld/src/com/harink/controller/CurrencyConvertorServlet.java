package com.harink.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CurrencyConvertor")
public class CurrencyConvertorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CurrencyConvertorServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		out.println("<table style='border: 1px solid black' align='center' bgcolor=\"#C0C0C0\"><tr align='center'>");
		out.println("<th style='border: 1px solid black'>USD(Dollar)</th><th style='border: 1px solid black'>IND(Rs)</th></tr>");
		
		for(int i=1;i<=50;i++) {
			out.println("<tr align='center'> <td style='border: 1px solid black'>");
			out.println(i);
			out.println("</td> <td style='border: 1px solid black'>");
			out.println(i*45);
			out.println("</td>     </tr>");
			
		}
		
		out.println("</table> ");
		out.close();
		
	}

}
