<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Module Project</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">

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
        <h3 class="fw-bold display-4 text-center text-danger mb-3">Welcome Back</h3>
        <form action="signin" class="bg-dark p-4 " method="get">
            <div class="mb-3">
                <label for="nameId" class="form-label">UserName</label>
                <input type="text" class="form-control" id="nameId" name="name">

            </div>
            <div class="mb-3">
                <label for="passwordId" class="form-label" >Password</label>
                <input type="password" class="form-control"  name="password" id="passwordId">

            </div>
            <div class="mb-3">
                <button class="btn btn-danger w-100">SignUp</button>
            </div>
            <div>
                <c:if test="${not empty result}">
                    <c:choose>
                        <c:when test="${result==true}">
                            <p class="text-success">Login Sucessfull</p>
                        </c:when>
                        <c:otherwise>
                            <p class="text-warning">Invalid Credentials</p>
                        </c:otherwise>
                    </c:choose>
                </c:if>

            </div>
        </form>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q"
        crossorigin="anonymous"></script>

<script src="index.js"></script>
</body>
</html>

