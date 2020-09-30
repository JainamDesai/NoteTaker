package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.entity.Note;
import helper.FactoryClas;

/**
 * Servlet implementation class SaveNotesServlet
 */
public class SaveNotesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			String title = request.getParameter("title");
		    String content = request.getParameter("content");
			Note note = new Note(title,content);
			Session session = FactoryClas.getSessionFactory().openSession();
			session.save(note);
			Transaction tc = session.beginTransaction();
			tc.commit();
			RequestDispatcher rd = request.getRequestDispatcher("save.jsp");
			rd.forward(request, response);
			session.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}
