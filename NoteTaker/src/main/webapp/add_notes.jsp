<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <h1>Welcome in NoteTaker AddNote Page</h1>
    <form method="post" action="SaveNotesServlet">
  <div class="form-group">
    <label for="title">Title of Note:</label>
    <input type="text" class="form-control" id="title" name="title"  placeholder="Please enter title of note.........." required>
  </div>
  <div class="form-group">
    <label for="content">Content of Note:</label>
    <textarea id="content" placeholder="please enter content..........." name="content" class= "form-control"  style="height: 300px"  ></textarea>
  </div>
  <div class="container text-center">
  <button type="submit" class="btn btn-primary">Submit</button>
  </div>
</form> 
</div>
</body>
</html>