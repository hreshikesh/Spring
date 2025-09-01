<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Module Project</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.min.css">
</head>
<body class="bg-dark text-light">

<nav class="navbar bg-dark border-bottom border-body" data-bs-theme="dark">
    <div class="container">
        <a class="navbar-brand" href="#">
            <img src="images/logo.png" alt="xworkz" width="100" height="50">
        </a>
        <div class="d-grid gap-2 d-md-block">
            <a class="btn btn-danger rounded-pill m-2" href="index.jsp" role="button">Home</a>
        </div>
    </div>
</nav>

<div class="container d-flex justify-content-center mt-4 align-items-center min-vh-100">
    <div class="p-5 shadow-lg mb-5 rounded bg-dark w-100" style="max-width: 450px;">
        <h3 class="fw-bold display-6 text-center text-danger mb-4">OTP Login</h3>
        <form action="emailVerify" method="post" class="mb-3">
            <div class="mb-3">
                <label for="emailId" class="form-label">Email</label>
                <input type="email" class="form-control" id="emailId" name="email" value="${email}" required>
            </div>
            <div class="text-center">
                <button class="btn btn-danger w-100">Verify Email</button>
            </div>
        </form>
        <c:if test="${not empty result}">
            <c:if test="${result eq 'notVerified'}">
                <div class="alert alert-warning text-center">Email Not Verified</div>
            </c:if>
            <c:if test="${result eq 'verified'}">
                <div class="alert alert-success text-center py-2">
                    Email Verified. OTP has been sent to your mail.
                </div>
            </c:if>
        </c:if>
        <form action="otpVerify" method="post" class="mt-3">
            <div class="mb-3">
                <label for="otpId" class="form-label">Enter OTP</label>
                <input type="text" class="form-control" id="otpId" name="otp" required>
            </div>
            <div class="text-center">
                <button class="btn btn-danger w-100">Verify OTP</button>
            </div>
        </form>
        <c:if test="${not empty status}">
            <c:if test="${status eq 'fail'}">
                <div class="alert alert-warning text-center  mt-3">
                    OTP Not Verified. <a href="resendOtp" class="alert-link">Resend OTP</a>
                </div>
            </c:if>
        </c:if>
    </div>
</div>

<script src="index.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q"
        crossorigin="anonymous"></script>
</body>
</html>
