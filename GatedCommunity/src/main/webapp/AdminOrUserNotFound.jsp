<%@ page import="java.util.*, com.gatedcommunity.modal.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>not found</title>
    <meta charset="UTF-8">
    <title>Login Failed</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f4f9;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background: #fff;
            padding: 40px;
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
            text-align: center;
            width: 350px;
        }
        h2 {
            color: red;
        }
        button {
            margin-top: 20px;
            padding: 10px 20px;
            border: none;
            border-radius: 8px;
            background: #4CAF50;
            color: white;
            font-size: 16px;
            cursor: pointer;
        }
        button:hover {
            opacity: 0.9;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2> <%= session.getAttribute("role") %> <%= session.getAttribute("email") %>, Invalid Mail or Password</h2>
       <form action="<%= "Admin".equals(session.getAttribute("role")) ? "admin-login.html" : "user-login.html" %>" method="get">
            <button type="submit">Back to Login</button>
        </form>
    </div>
</body>
</html>
