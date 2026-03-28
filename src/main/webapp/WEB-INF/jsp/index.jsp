<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <link rel="stylesheet" href="./css/index.css">
</head>
<body>

<div class="login-container">
    <h2>Login</h2>

    <form>
        <div class="input-group">
            <label>Email</label>
            <input type="email" id="email" placeholder="Enter your email" required>
        </div>

        <div class="input-group">
            <label>Password</label>
            <input type="password" id="password" placeholder="Enter your password" required>
        </div>

        <button type="button" onclick="loginForm()">Login</button>


        <p class="register-link">
            Don't have an account? <a href="registration">Register</a>
        </p>
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="./js/register.js"></script>

</body>
</html>