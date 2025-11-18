<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Admin Dashboard - Bank of FLM</title>

  <style>
    body {
      margin: 0;
      font-family: Arial, sans-serif;
      background: #e8f0f5; /* light gray-blue background */
    }

    /* Navbar */
    .navbar {
      background: olive; /* Sea Green from a nice dashboard palette */ :contentReference[oaicite:1]{index=1}
      padding: 15px 25px;
      color: white;
      display: flex;
      align-items: center;
      justify-content: space-between;
      position: relative;
      box-shadow: 0 2px 6px rgba(0, 0, 0, 0.2);
    }

    .navbar .title {
      position: absolute;
      left: 50%;
      transform: translateX(-50%);
      font-size: 22px;
      font-weight: bold;
      letter-spacing: 1px;
    }

    .home-btn, .logout-btn {
      padding: 8px 16px;
      font-weight: bold;
      border-radius: 20px;
      text-decoration: none;
      transition: .25s;
      border: 2px solid white;
    }

    .home-btn {
      background: white;
      color: #24ac54;
    }
    .home-btn:hover {
      background: #24ac54;
      color: white;
    }

    .logout-btn {
      background: white;
      color: #d9534f; /* red-ish for logout */
      border-color: white;
    }
    .logout-btn:hover {
      background: #d9534f;
      color: white;
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
      box-shadow: 0 3px 10px rgba(0, 0, 0, 0.1);
      cursor: pointer;
      transition: .25s;
      color: #2f4858; /* dark blue-gray text */
    }

    .box:hover {
      background: #1d745d; /* darker green-teal */
      color: white;
      transform: translateY(-5px);
      box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
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
    <a  href="/DigitalBankingSystem/bank/adminDashboard" class="home-btn">Home</a>
    <div class="title">Bank of FLM - Admin</div>
    <a href="/DigitalBankingSystem/index.jsp" class="logout-btn">Logout</a>
  </div>

  <!-- Dashboard Box Grid -->
  <div class="container">
    <div class="box" onclick="location.href='newAccountRequests'">New Account Activation</div>
    
    <div class="box" onclick="location.href='BankAccountRequest'">Bank Account Activation</div>
    
    <div class="box" onclick="location.href='newCheckBookRequest'">New Check Book Request's</div>
    
    <div class="box" onclick="location.href='loanApprovals'">Loan Approvals</div>
    
    <div class="box" onclick="location.href='viewAllAccounts'">View All Account holders</div>
    
    <div class="box" onclick="location.href='viewLoanStatus'">View All Loan Status</div>
    
    
    
    
    
    
    
    
    <!-- More boxes if needed -->
  </div>
</body>
</html>
