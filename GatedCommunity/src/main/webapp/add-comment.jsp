<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Complaint - Gated Community</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f4f9;
            margin: 0;
        }

        .container {
            max-width: 500px;
            margin: 60px auto 0; /* leave space for navbar */
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

        input[type="text"], textarea, select {
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
    <h2>Update Complaint</h2>
    <form action="updateComplaint" method="POST">

        <label for="ticketId">Ticket ID</label>
        <input type="text" name="ticketId" id="ticketId" placeholder="Enter Ticket ID" required>

        <label for="status">Status</label>
        <select name="status" id="status" required>
            <option value="">--Select Status--</option>
            <option value="New">New</option>
            <option value="In Progress">In Progress</option>
            <option value="Fixed">Fixed</option>
        </select>

        <label for="comments">Comments</label>
        <textarea name="comments" id="comments" rows="4" placeholder="Enter your comments..." required></textarea>

        <!-- Submit Button -->
        <button type="submit">Update Complaint</button>
    </form>
</div>

</body>
</html>
