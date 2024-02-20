<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2/13/2024
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First</title>
</head>
<body>

<%
    HttpSession sess = request.getSession();
    if(sess.isNew())
    {
        response.sendRedirect("login.html");
    }
%>
<%="Welcome  :- "  +  sess.getAttribute("name")%>

</body>
</html>
