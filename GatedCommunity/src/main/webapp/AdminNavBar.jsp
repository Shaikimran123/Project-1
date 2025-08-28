<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Navbar</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: #f4f4f9;
        margin: 0;
    }
    .navbar {
        background-color: #333;
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
        background-color: #555;
        border-radius: 4px;
    }
</style>
</head>
<body>

<div class="navbar">
    <a href="admin-loggedin.jsp">Home</a>
    <a href="viewAdminComplain">View All Complaints</a>
    <a href="manage-users.jsp">Manage Users</a>
    <a href="AdminProfileinfo.jsp">Profile</a>
    <a href="index.html">Logout</a>
</div>

</body>
</html>
