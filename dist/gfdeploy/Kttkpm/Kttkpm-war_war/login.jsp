<%-- 
    Document   : login
    Created on : May 5, 2019, 8:57:06 PM
    Author     : minht
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/doLogin" method="post">
            <label for="username"><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="username" required>

            <label for="password"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="password" required>

            <button type="submit">Login</button>
<!--            <label>
              <input type="checkbox" checked="checked" name="remember"> Remember me
            </label>-->
      </form> 
    </body>
</html>
