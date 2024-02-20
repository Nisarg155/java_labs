<%@ page import="org.lab9.lab9_.Calc" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2/13/2024
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<%! int ans ;
    String opr;
    boolean op = true;

%>
<jsp:useBean id="c1" class="org.lab9.lab9_.Calc" scope="request"></jsp:useBean>


<form method="post" action="">
    <label for="op1">Operand 1</label><input name="op1" id="op1" type="number" placeholder="Operand 1">
    <label for="op2">Operand 2</label><input name="op2" id="op2" type="number" placeholder="Operand 2">
    <label for="op3">Operation</label><input name="op3" id="op3" type="text" placeholder="Operation">
    <button type="submit">Submit</button>
</form>


<jsp:setProperty name="c1" property="num1" param="op1"></jsp:setProperty>
<jsp:setProperty name="c1" property="num2" param="op2"></jsp:setProperty>
<jsp:setProperty name="c1" property="operation" param="op3"></jsp:setProperty>
<%
switch (c1.getOperation())
{
    case '+':
        ans = c1.getNum1() + c1.getNum2();
        break;

    case '-':
        ans = c1.getNum1() - c1.getNum2();
        break;
    case '/':
        ans = c1.getNum1() / c1.getNum2();
        break;
    case '*':
        ans = c1.getNum1() * c1.getNum2();
        break;
    case '\0':
        op = true;
        break;

    default: op = false;
    opr = "Invalid ans ";
    break;
}
if(op) opr =  "The ans is :- " +  String.valueOf(ans);

%>

<%=opr%>




</body>
</html>
