<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>

<html>
<head>
    <title>OTP Verification</title>
    <style>
        body { 
            font-family: Arial, sans-serif; 
            background-color: #f4f6f9; 
            display: flex; 
            justify-content: center; 
            align-items: center; 
            height: 100vh; 
            margin: 0; 
        }
        .container { 
            background-color: #fff; 
            padding: 30px 40px; 
            border-radius: 8px; 
            box-shadow: 0 4px 10px rgba(0,0,0,0.1); 
            text-align: center; 
            width: 350px; 
        }
        .btn { 
            background-color: #007bff; 
            color: white; 
            padding: 10px 18px; 
            border: none; 
            border-radius: 4px; 
            cursor: pointer; 
            margin-top: 15px; 
        }
        input[type="text"] { 
            padding: 10px; 
            width: 90%; 
            margin-top: 15px; 
            border: 1px solid #ccc; 
            border-radius: 4px; 
        }
        input[type="submit"] { 
            background-color: #28a745; 
            color: white; 
            padding: 10px 18px; 
            border: none; 
            border-radius: 4px; 
            cursor: pointer; 
            margin-top: 10px; 
        }
        .message { 
            margin-top: 15px; 
            font-weight: bold; 
        }
        .success { color: green; }
        .error { color: red; }
    </style>
</head>
<body>

<div class="container">
    <h2>OTP Verification</h2>
    
    <p>Email: <strong>${sessionScope.userEmail}</strong></p>

    <!-- Success message -->
    <c:if test="${not empty success}">
        <div class="message success">${success}</div>
    </c:if>

    <!-- Error message -->
    <c:if test="${not empty error}">
        <div class="message error">${error}</div>
    </c:if>

    <div id="otpSection">
        <form action="verifyOtp" method="post">
            <input type="text" name="otp" placeholder="Enter OTP" required />
            <br>
            <input type="submit" value="Verify OTP" />
        </form>
    </div>

    <form action="sendOtp" method="post" style="margin-top: 10px;">
        <input type="submit" value="Resend OTP" class="btn" />
    </form>
</div>

</body>
</html>
