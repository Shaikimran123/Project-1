<%@ page  import="java.util.*, com.gatedcommunity.modal.Complain"  language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
    <title>View All Complaints</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        h2 {
            margin-bottom: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
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
    </style>
</head>
<body>
 <%@ include file="UserNavBar.jsp" %>
 

<h2 style="text-align: center;"> <%= session.getAttribute("email") %>! , Here is the list of your Complaints </h2>
    <table>
        <thead>
            <tr>
                <th>Ticket ID</th>
                <th>Category</th>
                <th>Description</th>
                <th>Urgency</th>
                <th>Status</th>
                <th>Modify</th>
                <th>Delete</th>
                <th>Assigned to</th>
                <th> Comments </th>
            </tr>
        </thead>
        <% List<Complain> list= (List<Complain>) request.getAttribute("complains"); 
         for(Complain c:list){%>
         <tbody>
        	<tr>
        		<td> <%= c.getComplainID() %></td>
        		<td> <%= c.getCategory() %></td>
        		<td> <%= c.getDescription() %></td>
        		<td> <%= c.getUrgency() %></td>
        		<td> <%=c.getStatus() %> </td> 
        		<td>  <a href="UpdateComplain.jsp?id=<%= c.getComplainID() %>"> update</a>
        		<td>  <a href="deletecomplain?id=<%= c.getComplainID() %>">Delete</a> </td>
        		<th> <%= c.getAssidnedto() %>
        		<td> <%=c.getComments() %></td>      		
        	</tr> 
        </tbody>
       <% } %>
       
    </table>

</body>
</html>