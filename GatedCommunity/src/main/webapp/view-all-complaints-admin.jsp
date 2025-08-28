<%@ page import="java.util.*, com.gatedcommunity.modal.Complain" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Complaints - Admin</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 20px;
    }
    h2 {
        margin-bottom: 20px;
        text-align: center;
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
    }
    table, th, td {
        border: 1px solid #aaa;
    }
    th, td {
        padding: 10px;
        text-align: left;
    }
    th {
        background: #f2f2f2;
    }
    a {
        text-decoration: none;
        color: #4CAF50;
    }
    a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>

<%@ include file="AdminNavBar.jsp" %>

<h2>All Complaints</h2>

<table>
    <thead>
        <tr>
            <th>Ticket ID</th>
            <th>Category</th>
            <th>Description</th>
            <th>Urgency</th>
            <th>Status</th>
            <th>Raised By</th>          
            <th>Assigned to</th> 
            <th>Comments</th>
            
        </tr>
    </thead>
    <%
        List<Complain> list = (List<Complain>) request.getAttribute("allComplainsForAdminView");
        if (list != null) {
            for (Complain c : list) {
    %>
        <tr>
            <td><%= c.getComplainID() %></td>
            <td><%= c.getCategory() %></td>
            <td><%= c.getDescription() %></td>
            <td><%= c.getUrgency() %></td>
             <td><%= c.getStatus() %></td> 
            <td><%= c.getRaisedBy() %></td>          
            <td><%= c.getAssidnedto() %> </td>
            <td><%= c.getComments() %></td>           
            
            
        </tr>
    <%
            }
        } else {
    %>
        <tr>
            <td colspan="9" style="text-align:center;">No complaints found.</td>
        </tr>
    <%
        }
    %>
    
    
    
    
</table>

</body>
</html>
