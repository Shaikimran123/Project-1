<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Dashboard - Gated Community</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-size: cover;
        }

        .container {
            padding: 60px;
            background-color: rgba(255, 255, 255, 0.85); /* Light overlay for contrast */
            margin: 100px auto;
            width: 80%;
            text-align: center;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.3);
        }

        h2 {
            font-size: 28px;
            color: #333; /* Dark text for light background */
        }
    </style>
</head>
<body>

    <%@ include file="UserNavBar.jsp" %>

    <!-- Welcome Message -->
    <div class="container">
        <h2>Welcome to the Gated Community, <%= session.getAttribute("email") %>!</h2>
    </div>

</body>
</html>
