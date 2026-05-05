<!-- RegistrationPage.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>

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
        background:linear-gradient(135deg,#667eea,#764ba2);
    }

    .form-container{
        background:white;
        padding:40px;
        border-radius:15px;
        width:400px;
        box-shadow:0 8px 20px rgba(0,0,0,0.3);
    }

    h2{
        text-align:center;
        margin-bottom:25px;
        color:#333;
    }

    .input-group{
        margin-bottom:20px;
    }

    label{
        display:block;
        margin-bottom:8px;
        color:#555;
        font-weight:bold;
    }

    input{
        width:100%;
        padding:12px;
        border:1px solid #ccc;
        border-radius:8px;
        outline:none;
        transition:0.3s;
    }

    input:focus{
        border-color:#667eea;
    }

    button{
        width:100%;
        padding:12px;
        border:none;
        border-radius:8px;
        background:#667eea;
        color:white;
        font-size:16px;
        cursor:pointer;
        transition:0.3s;
    }

    button:hover{
        background:#5a67d8;
    }

    .error{
        color:red;
        text-align:center;
        margin-bottom:15px;
    }

</style>

</head>
<body>

<div class="form-container">

    <h2>Create Account</h2>

    <% String error=(String)request.getAttribute("error");
       if(error!=null){ %>

        <p class="error"><%= error %></p>

    <% } %>

    <form action="register" method="post">

        <div class="input-group">
            <label>Name</label>
            <input type="text" name="name" required>
        </div>

        <div class="input-group">
            <label>Email</label>
            <input type="email" name="email" required>
        </div>

        <div class="input-group">
            <label>Password</label>
            <input type="password" name="password" required>
        </div>

        <button type="submit">Register</button>

    </form>

</div>

</body>
</html>