<%-- 
    Document   : home.jsp
    Created on : 05 6, 15, 4:52:13 PM
    Author     : asi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String user = session.getAttribute("username").toString();
        %>
        <h3><a href="home.jsp">home</a>|<a href="profile.jsp">profile</a></h3>
        <h1>Welcome <%=user%>!</h1>
        <h1><%=user%></h1>
        
    </body>
</html>
