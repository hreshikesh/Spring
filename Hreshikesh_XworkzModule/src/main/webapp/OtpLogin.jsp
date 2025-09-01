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
    <div class="container ">
        <a class="navbar-brand" href="#">
            <img src="images/logo.png"
                 alt="xworkz" width="100" height="50">
        </a>
        <div class="d-grid gap-2 d-md-block">
            <a class="btn btn-danger rounded-pill m-2" href="index.jsp" role="button">Home</a>
        </div>
    </div>
</nav>
<div class="container d-flex justify-content-center mt-4 align-items-center min-vh-100">
    <div class=" p-5 shadow-lg  mb-5 rounded">
        <h3 class="fw-bold display-4 text-center text-danger mb-3">OTP Login</h3>
        <form action="emailVerify" class="bg-dark p-4 " method="post">
            <div class="mb-3">
                <label for="emailId" class="form-label">Email</label>
                <input type="email" class="form-control" id="emailId" name="email" required>
            </div>
            <div class="mb-3">
                <button class="btn btn-danger w-50">verify Email</button>
            </div>
            <div>
                <c:if test="${not empty result}">
                    <c:if test="${result eq 'notVerified'}">
                        <p class="text-warning text-center">Email Not verified</p>
                    </c:if>
                    <c:if test="${result eq 'verified'}">
                        <form action="otpVerify" method="post">
                            <div class="mb-3">
                                <label for="otpId" class="form-label">UserName</label>
                                <input type="text" class="form-control" id="otpId" name="otp" maxlength="6" required>
                            </div>
                            <div class="mb-3">
                                <button class="btn btn-danger w-50">verify Otp</button>
                            </div>
                        </form>
                        <div>
                            <c:if test="${not empty status}">
                                <c:if test="${status eq 'fail'}">
                                    <p class="text-warning text-center">OTP not verified</p>
                                    <p class="text-center"><a class="link-opacity-50 " href="resendOtp">ResendOtp</a></p>

                                </c:if>
                            </c:if>
                        </div>
                    </c:if>
                </c:if>

            </div>
        </form>
    </div>
</div>
<script src="index.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q"
        crossorigin="anonymous"></script>

</body>
</html>

