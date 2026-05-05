<!-- Dashboard.jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Dashboard</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background:linear-gradient(135deg,#667eea,#764ba2);
    min-height:100vh;
}

/* Navbar */

.navbar{
    width:100%;
    background:white;
    padding:15px 40px;
    display:flex;
    justify-content:space-between;
    align-items:center;
    box-shadow:0 4px 10px rgba(0,0,0,0.1);
}

.logo{
    font-size:24px;
    font-weight:bold;
    color:#667eea;
}

.logout-btn{
    text-decoration:none;
    background:#ff4d4d;
    color:white;
    padding:10px 18px;
    border-radius:8px;
    transition:0.3s;
}

.logout-btn:hover{
    background:#e60000;
}

/* Main Dashboard */

.dashboard-container{
    width:90%;
    max-width:1100px;
    margin:40px auto;
}

/* Welcome Card */

.welcome-card{
    background:white;
    border-radius:20px;
    padding:40px;
    text-align:center;
    box-shadow:0 8px 20px rgba(0,0,0,0.2);
    margin-bottom:30px;
}

.welcome-card h1{
    color:#333;
    margin-bottom:15px;
    font-size:36px;
}

.welcome-card p{
    color:#666;
    font-size:18px;
}

/* Cards */

.card-container{
    display:grid;
    grid-template-columns:repeat(auto-fit,minmax(250px,1fr));
    gap:25px;
}

.card{
    background:white;
    padding:30px;
    border-radius:18px;
    text-align:center;
    transition:0.3s;
    box-shadow:0 8px 20px rgba(0,0,0,0.15);
}

.card:hover{
    transform:translateY(-8px);
}

.card h2{
    color:#667eea;
    margin-bottom:15px;
}

.card p{
    color:#555;
    margin-bottom:20px;
}

.card button{
    background:#667eea;
    color:white;
    border:none;
    padding:12px 20px;
    border-radius:8px;
    cursor:pointer;
    transition:0.3s;
}

.card button:hover{
    background:#4f5bd5;
}

/* Footer */

.footer{
    text-align:center;
    color:white;
    margin-top:40px;
    padding-bottom:20px;
}

</style>

</head>
<body>

<!-- Navbar -->

<div class="navbar">

    <div class="logo">
        MVC Dashboard
    </div>

    <a href="HomePage.jsp" class="logout-btn">
        Logout
    </a>

</div>

<!-- Dashboard -->

<div class="dashboard-container">

    <!-- Welcome Card -->

    <div class="welcome-card">

        <h1>
            Welcome,
            <%= request.getAttribute("username") %> 🎉
        </h1>

        <p>
            Registration completed successfully.
            Welcome to your dashboard.
        </p>

    </div>

    <!-- Feature Cards -->

    <div class="card-container">

        <div class="card">
            <h2>Profile</h2>

            <p>
                View and manage your profile information.
            </p>

            <button>Open</button>
        </div>

        <div class="card">
            <h2>Settings</h2>

            <p>
                Customize your account settings and preferences.
            </p>

            <button>Manage</button>
        </div>

        <div class="card">
            <h2>Notifications</h2>

            <p>
                Check latest updates and system notifications.
            </p>

            <button>View</button>
        </div>

        <div class="card">
            <h2>Support</h2>

            <p>
                Contact support team for any help or guidance.
            </p>

            <button>Contact</button>
        </div>

    </div>

</div>

<!-- Footer -->

<div class="footer">
    © 2026 MVC Registration Project
</div>

</body>
</html>