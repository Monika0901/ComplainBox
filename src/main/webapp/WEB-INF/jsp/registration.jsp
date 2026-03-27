<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
    <link rel="stylesheet" href="./css/registration.css">
</head>
<body>

    <div class="register-container">
        <h2>Register</h2>

        <form >
            <div class="input-group">
                <label>Full Name</label>
                <input type="text" id="fullname" placeholder="Enter your name" >
            </div>

            <div class="input-group">
                <label>Email</label>
                <input type="email" id="email" placeholder="Enter your email" >
            </div>

            <div class="input-group">
                <label>Phone</label>
                <input type="tel" id="phone" placeholder="Enter your phone number" >
            </div>

            <div class="input-group">
                <label>Password</label>
                <input type="password"id="password" placeholder="Enter password" >
            </div>

            <div class="input-group">
                <label>Confirm Password</label>
                <input type="password" id= "confirmpassword" placeholder="Confirm password" >
            </div>

            <button type="button" onclick="saveuser();">Register</button>

            <p class="login-link">
                Already have an account? <a href="index">Login</a>
            </p>
        </form>
    </div>
</body>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="js/register.js"></script>
</html>