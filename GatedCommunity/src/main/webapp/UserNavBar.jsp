<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f4f9;
            margin: 0;
        }
        .navbar {
            background-color: #4CAF50;
            padding: 15px;
            display: flex;
            justify-content: space-around;
        }
        .navbar a {
            color: white;
            text-decoration: none;
            font-size: 16px;
            font-weight: bold;
            padding: 8px 16px;
        }
        .navbar a:hover {
            background-color: #45a049;
            border-radius: 4px;
        }
        .container {
            text-align: center;
            margin-top: 50px;
        }
        h2 {
            color: #333;
        }
    </style>
<body>

<div class="navbar">
    <a href="user-loggedin.jsp">Home</a>
    <a href="raise-complaint.jsp">Raise a Complaint</a>
    <a href="viewcomplains">View All Complaints</a>
    <a href="Userprofileinfo.jsp">Profile</a> 
    <a href="index.html">Logout</a>
</div>
</body>
</html>