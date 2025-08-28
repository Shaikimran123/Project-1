<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manage Complaint Actions</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: #f4f4f9;
        margin: 0;
    }

    .container {
        max-width: 400px;
        margin: 120px auto 0;
        background: #fff;
        padding: 30px;
        border-radius: 12px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        text-align: center;
    }

    h2 {
        color: #333;
        margin-bottom: 25px;
    }

    button {
        width: 80%;
        padding: 12px;
        margin: 10px 0;
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

<%@ include file="AdminNavBar.jsp" %>

<div class="container">
    <h2>Manage Complaints</h2>
    
    <form action="assign-complain.jsp" method="post">
        <button type="submit">Assign Complaint</button>
    </form>
    
    <form action="add-comment.jsp" method="post">
        <button type="submit">Update complaint</button>
    </form>
    
</div>

</body>
</html>
