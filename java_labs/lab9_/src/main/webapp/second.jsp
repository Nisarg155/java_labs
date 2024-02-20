<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2/13/2024
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Second</title>
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