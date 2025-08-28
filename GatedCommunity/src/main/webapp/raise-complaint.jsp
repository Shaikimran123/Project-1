<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Raise a Complaint - Gated Community</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f4f9;
            margin: 0;
        }

        
        .container {
            max-width: 500px;
            margin: 120px auto 0; /* leave space for navbar */
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
<%@ include file="UserNavBar.jsp" %>
  <div class="container">
        <h2>Raise a Complaint</h2>
        <form action="complains" method="POST">

            <label for="category">Category</label>
            <select name="category" id="category" required>
                <option value="">--Select Category--</option>
                <option value="Water Issue">Water Issue</option>
                <option value="Electricity Issue">Electricity Issue</option>
                <option value="Sanitation">Sanitation</option>
                <option value="Maintenance">Maintenance</option>
                <option value="Other">Other</option>
            </select>

            <label for="description">Description</label>
            <textarea name="description" id="description" rows="4" placeholder="Describe your issue..." required></textarea>

            <label for="urgency">Urgency</label>
            <select name="urgency" id="urgency" required>
                <option value="">--Select Priority--</option>
                <option value="P0">P0 - High</option>
                <option value="P1">P1 - Medium</option>
                <option value="P2">P2 - Low</option>
            </select>

            <!-- Submit Button -->
            <button type="submit">Submit Complaint</button>
        </form>
    </div>
 



</body>
</html>


