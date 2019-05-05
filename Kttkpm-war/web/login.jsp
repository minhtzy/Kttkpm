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
            <div>
                <label for="username"><b>Username</b></label> <br>
                <input type="text" placeholder="Enter Username" name="username" required> <br>
                <label for="password"><b>Password</b></label> <br>
                <input type="password" placeholder="Enter Password" name="password" required> <br>
                <button type="submit">Login</button> <br>
    <!--            <label>
                  <input type="checkbox" checked="checked" name="remember"> Remember me
                </label>-->
            </div>
      </form> 
    </body>
</html>
