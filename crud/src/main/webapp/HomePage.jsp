<!-- HomePage.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>

<style>
    *{
        margin:0;
        padding:0;
        box-sizing:border-box;
        font-family:Arial, sans-serif;
    }

    body{
        height:100vh;
        display:flex;
        justify-content:center;
        align-items:center;
        background:linear-gradient(135deg,#4facfe,#00f2fe);
    }

    .container{
        background:white;
        padding:50px;
        border-radius:15px;
        text-align:center;
        box-shadow:0 8px 20px rgba(0,0,0,0.2);
        width:400px;
    }

    h1{
        color:#333;
        margin-bottom:20px;
    }

    p{
        color:#666;
        margin-bottom:30px;
    }

    a{
        text-decoration:none;
        background:#4facfe;
        color:white;
        padding:12px 25px;
        border-radius:8px;
        transition:0.3s;
        font-weight:bold;
    }

    a:hover{
        background:#008cdd;
    }
</style>

</head>
<body>

<div class="container">
    <h1>Welcome</h1>
    <p>User Registration MVC Project</p>

    <a href="RegistrationPage.jsp">Register Now</a>
</div>

</body>
</html>