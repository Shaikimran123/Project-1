<%@page import="com.gatedcommunity.modal.Complain"%>
<%@page import="com.gatedcommunity.dao.ComplainDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Complaint</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f9;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .navbar {
    width: 100%;
    background: #333;
    color: white;
    padding: 15px;
    position: fixed;  /* sticks at the top */
    top: 0;
    left: 0;
}
    .update-container {
        background-color: #fff;
        padding: 40px;
        border-radius: 12px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        width: 400px;
    }
    h1 {
        text-align: center;
        color: #333;
        margin-bottom: 30px;
    }
    label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
    }
    input[type="text"], select {
        width: 100%;
        padding: 10px;
        margin-bottom: 20px;
        border-radius: 6px;
        border: 1px solid #ccc;
        font-size: 16px;
    }
    input[type="submit"] {
        width: 100%;
        padding: 12px;
        border: none;
        border-radius: 8px;
        background-color: #4CAF50;
        color: white;
        font-size: 16px;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        opacity: 0.9;
    }
</style>
</head>
<body>
<%@ include file="UserNavBar.jsp" %>

<%
    int ticketId = Integer.parseInt(request.getParameter("id")); // ticket id from link
    ComplainDAO dao = new ComplainDAO();
    Complain c = dao.getComplain(ticketId);   // fetch complaint details
    if (c == null) {
%>
    <p>Complaint not found!</p>
<%
    } else {
%>

<div class="update-container">

<h1>Update Complaint Details</h1> 
<form action="updateComplain" method="post">
    <input type="hidden" name="id" value="<%= ticketId %>">

    <label for="category">Category:</label>
    <select id="category" name="category" required>
        <option value="Water Issue" <%= "Water Issue".equals(c.getCategory()) ? "selected" : "" %>>Water Issue</option>
        <option value="Electricity Issue" <%= "Electricity Issue".equals(c.getCategory()) ? "selected" : "" %>>Electricity Issue</option>
        <option value="Sanitation" <%= "Sanitation".equals(c.getCategory()) ? "selected" : "" %>>Sanitation</option>
        <option value="Maintenance" <%= "Maintenance".equals(c.getCategory()) ? "selected" : "" %>>Maintenance</option>
        <option value="Other" <%= "Other".equals(c.getCategory()) ? "selected" : "" %>>Other</option>
    </select>

    <label for="description">Description:</label>
    <input type="text" id="description" name="description" value="<%= c.getDescription() %>" required>

    <label for="urgency">Urgency:</label>
    <select id="urgency" name="urgency" required>
        <option value="P0" <%= "P0".equals(c.getUrgency()) ? "selected" : "" %>>P0</option>
        <option value="P1" <%= "P1".equals(c.getUrgency()) ? "selected" : "" %>>P1</option>
        <option value="P2" <%= "P2".equals(c.getUrgency()) ? "selected" : "" %>>P2</option>
        <option value="P3" <%= "P3".equals(c.getUrgency()) ? "selected" : "" %>>P3</option>
    </select>

    <input type="submit" value="Update">
</form>
</div>

<% } %>
</body>
</html>
