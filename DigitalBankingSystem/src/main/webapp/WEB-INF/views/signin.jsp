
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>User Login - Bank of FLM</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background-color: #f0f4f8;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .login-box {
            background-color: #fff;
            padding: 40px 30px;
            border-radius: 8px;
            box-shadow: 0 4px 15px rgba(0,0,0,0.1);
            width: 360px;
            text-align: center;
        }

        h2 {
            color: #2c3e50;
            margin-bottom: 20px;
        }

        input[type="email"],
        input[type="password"] {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 14px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #28a745;
            border: none;
            color: white;
            font-size: 16px;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #218838;
        }

        .signup-link {
            margin-top: 15px;
            font-size: 14px;
        }

        .signup-link a {
            color: #007bff;
            text-decoration: none;
        }

        .signup-link a:hover {
            text-decoration: underline;
        }
        
		.forget-pass {
		  margin-top: 15px;
		  font-size: 14px;
		}
		
		.forget-pass a {
		  color: #007bff;             /* blue color */
		  text-decoration: none;      /* remove underline */
		  transition: color 0.2s;     /* smooth color change */
		  font-weight: 500;
		}
		
		/* Hover effect for the link */
		.forget-pass a:hover {
		  color: #0056b3;              /* darker blue on hover */
		  text-decoration: underline; /* underline on hover */
		}
		        

        .error {
            color: red;
            font-size: 14px;
            margin-bottom: 10px;
        }
    </style>
<body>
<div class="login-box">
    <h2>User Login</h2>

   
    <form action="signin" method="post">
        <input type="email" name="email" placeholder="Email" required>
        <input type="password" name="password" placeholder="Password" required>
        <input type="submit" value="Login">
    </form>

    <div class="signup-link">
        Don't have an account? <a href="signup">Sign up</a>
    </div>
    
    <div class="forget-pass">
     <a href="forgotPassword">forgot password? </a>    
    </div>
    
    
</div>
</body>
</html>
