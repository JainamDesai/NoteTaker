package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Note;

import helper.FactoryClas;

/**
 * Servlet implementation class delete
 */
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("id"));		
		Session s = FactoryClas.getSessionFactory().openSession();
		Transaction tc = s.beginTransaction();
		if(s!=null){
		        Note note = (Note)s.get(Note.class, id);
		        s.delete(note);
		        tc.commit();
		        RequestDispatcher rd = request.getRequestDispatcher("delete_msg.jsp");
		        rd.forward(request, response);
		        s.close();
		}
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
	        rd.forward(request, response);	
	        s.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}


}
