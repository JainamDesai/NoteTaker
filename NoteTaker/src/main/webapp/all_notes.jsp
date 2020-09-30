<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="org.hibernate.SessionFactory" %>
    <%@page import="org.hibernate.Session" %>
    <%@page import="helper.FactoryClas" %>
    <%@page import="org.hibernate.Query" %>
    <%@page import="java.util.List" %>
    <%@page import="com.entity.Note" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <link rel="stylesheet" href="css/style.css">

    <title>All Note Taker</title>
    <%@include file = "AllJsCss.jsp" %>
  </head>
  <body>
    <div class="container">
    <%@include file ="navBar.jsp" %>
    <%
    Session s = FactoryClas.getSessionFactory().openSession();
    Query q = s.createQuery("from Note");
    List<Note> li = q.list();
    for(Note n : li){%>
    <div class="container-fluied">
    <div class="card mt-3" style="width: 18rem;">
  <img class="card-img-top mx-auto text-center" src="img/download.png" alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title" ><%=n.getTitle() %></h5>
    <p class="card-text"><%=n.getContent() %></p>
    <a href="delete?id=<%=n.getId()%>"  class="btn btn-primary">Delete</a>
     <a href="Update?id=<%=n.getId()%>" class="btn btn-primary">Update</a>
  </div>
</div>
</div>

    	<% 
    }
    s.close();
    %>
    </div>
</body>
</html>