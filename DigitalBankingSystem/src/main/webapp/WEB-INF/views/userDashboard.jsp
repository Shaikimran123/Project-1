<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Dashboard - Bank of FLM</title>

<style>
    body {
        margin: 0;
        font-family: Arial, sans-serif;
        background: #f4f6f9;
    }

    /* Navbar */
    .navbar {
        background: olive; /* Parrot Green */
        padding: 15px 25px;
        color: white;
        display: flex;
        align-items: center;
        justify-content: space-between;
        box-shadow: 0 2px 6px rgba(0,0,0,0.2);
    }

    /* Home button */
    .home-btn {
        background: white;
        color: #32CD32;
        padding: 8px 16px;
        font-weight: bold;
        border-radius: 20px;
        cursor: pointer;
        text-decoration: none;
        font-size: 14px;
        transition: .25s;
        border: 2px solid white;
    }

    .home-btn:hover {
        background: #32CD32;
        color: white;
        border-color: white;
    }

    /* Logout button */
    .logout-btn {
        background: white;
        color: red;
        padding: 8px 16px;
        border-radius: 20px;
        font-weight: bold;
        text-decoration: none;
        border: 2px solid white;
        transition: .25s;
    }

    .logout-btn:hover {
        background: red;
        color: white;
        border-color: white;
    }

    /* Navbar Title */
    .title {
        flex-grow: 1;
        text-align: center;
        font-size: 22px;
        font-weight: bold;
        letter-spacing: 1px;
    }

    /* Dashboard Grid */
    .container {
        width: 90%;
        margin: 40px auto;
        display: grid;
        grid-template-columns: repeat(4, 1fr);
        grid-gap: 25px;
    }

    .box {
        background: white;
        padding: 35px 10px;
        text-align: center;
        border-radius: 12px;
        font-size: 17px;
        font-weight: bold;
        box-shadow: 0 3px 10px rgba(0,0,0,0.1);
        cursor: pointer;
        transition: .25s;
    }

    .box:hover {
        background: #32CD32;
        color: white;
        transform: translateY(-5px);
        box-shadow: 0 8px 20px rgba(0,0,0,0.2);
    }

    /* Responsive */
    @media (max-width: 900px) {
        .container {
            grid-template-columns: repeat(2, 1fr);
        }
    }

    @media (max-width: 500px) {
        .container {
            grid-template-columns: repeat(1, 1fr);
        }
    }
</style>
</head>

<body>

<!-- Navbar -->
<div class="navbar">

    <!-- Home button (left) -->
    <a href="/DigitalBankingSystem/bank/userDashboard" class="home-btn">Home</a>

    <!-- Title (center) -->
    <div class="title">
        Welcome to Bank of FLM - Built for the Future
    </div>

    <!-- Logout button (right) -->
    <a href="/DigitalBankingSystem/index.jsp" class="logout-btn">Logout</a>

</div>

<!-- Dashboard Box Grid -->
<div class="container">

    <div class="box" onclick="location.href='requestAccount'">Raise a Request for Bank Account</div>
    
    <div class="box" onclick="location.href='myStatus'">My Status</div>
    
    <div class="box" onclick="location.href='addBankAccount'">Add Bank Account</div>

    <div class="box" onclick="location.href='profile'">Profile</div>
    
  
    <div class="box" onclick="location.href='checkBalance'">Check Balance</div>
    
    <div class="box" onclick="location.href='sendMoney'">Money Transfer</div>
    
    <div class="box" onclick="location.href='ePassbook'">E-Passbook</div>
    
    <div class="box" onclick="location.href='cards'">Cards </div>
    
    
    
    <div class="box" onclick="location.href='loan'">Loan Request</div>
    
    <div class="box" onclick="location.href='invest'">Invest</div>
    
    
    


</div>

</body>
</html>
