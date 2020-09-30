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


public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try{
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				int id = Integer.parseInt(request.getParameter("id"));
				Session s = FactoryClas.getSessionFactory().openSession();
				Transaction tc = s.beginTransaction();
					Note n = (Note) s.get(Note.class, id);
			
					out.println("<form action=update_msg.jsp  method=get>");
					out.println("<label>Title</label><input type=text name=title  value="+n.getTitle());
					out.println("<br>");
					out.println("<label>Content</label><input type=text name=content value="+n.getContent());
					out.println("<br>");
					out.println("<button type=submit value=submit>Submit</button>");
					out.println("</form>");
					s.close();	
			}
			catch(Exception e){
				e.printStackTrace();
			}
	}


}
