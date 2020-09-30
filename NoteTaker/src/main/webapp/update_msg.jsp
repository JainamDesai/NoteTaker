<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="org.hibernate.SessionFactory" %>
    <%@page import="org.hibernate.Session" %>
    <%@page import="org.hibernate.Transaction" %>
    <%@page import="helper.FactoryClas" %>
    <%@page import="java.util.List" %>
    <%@page import="com.entity.Note" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="css/style.css">
<title>Add Notes</title>
<%@include file = "AllJsCss.jsp" %>
</head>
<body>
	 <div class="container">
    <%@include file ="navBar.jsp" %>
    <%
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    Note n = new Note();
    n.setTitle(title);
    n.setContent(content);
    Session s = FactoryClas.getSessionFactory().openSession();
	Transaction tc = s.beginTransaction();
	s.update(n);
	tc.commit();
	s.close();
    %>
    <h1 class="text-center">Your data successfully updated................</h1>
    </div>
</body>
</html>