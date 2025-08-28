<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Assign Complaint - Gated Community</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f4f9;
            margin: 0;
        }

        .container {
            max-width: 500px;
            margin: 60px auto 0; /* adjust spacing from top */
            background: #fff;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 25px;
        }

        input[type="text"] {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 8px;
            font-size: 16px;
        }

        button {
            width: 100%;
            padding: 12px;
            margin-top: 20px;
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
        <h2>Assign Complaint</h2>
        <form action="assignComplain" method="POST">

            <label for="ticketId">Ticket ID</label>
            <input type="text" name="ticketId" id="ticketId" placeholder="Enter Ticket ID" required>

            <label for="assignedTo">Assign To</label>
            <input type="text" name="assignedTo" id="assignedTo" placeholder="Enter Name" required>

            <!-- Submit Button -->
            <button type="submit">Assign Complaint</button>
        </form>
    </div>
</body>
</html>
