<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Module Project</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.min.css">
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
        <div class="d-flex justify-contend-end">
            <a class="btn btn-danger rounded-pill m-2" href="index.jsp" role="button">Home</a>
        </div>
    </div>
</nav>
<div class="container d-flex justify-content-center mt-4 align-items-center min-vh-100">
    <div class=" p-5 shadow-lg w-75 mb-5 rounded">
        <h3 class="fw-bold display-4 text-center text-danger mb-3">Register Form</h3>

            <c:if test="${not empty errors}">
                <div  class="alert alert-secondary" role="alert">
                <c:forEach var="error" items="${errors}" varStatus="loop">
                    <p>${error.defaultMessage}</p>
                </c:forEach>
                </div>
            </c:if>

        <form action="register" class="bg-dark p-4 " method="post">
            <div class="row mb-3">
                <div class="col-6">
                    <label for="nameId" class="form-label">Name</label>
                    <input type="text"  oninput="validateName()"  class="form-control" id="nameId" name="name" value="${dto.name}" required minlength="3" maxlength="10" >
                    <span id="nameErrorId" class="text-danger"></span>
                </div>
                <div class="col">
                    <label for="emailId" class="form-label">Email</label>
                    <input type="email" oninput="validateEmail()" onchange="checkEmail()" class="form-control" id="emailId" name="email" value="${dto.email}" required>
                    <span id="emailErrorId" class="text-danger"></span>
                </div>
            </div>
            <div class="row mb-3">
                <div class="col-6">
                    <label for="phoneId" class="form-label">Phone No</label>
                    <input type="text"  class="form-control" oninput="validatePhone()"  maxlength="10" id="phoneId" name="phone" value="${dto.phone}" required >
                    <span class="text-danger" id="phoneErrorId"></span>
                </div>
                <div class="col-3">
                    <label for="ageId" class="form-label">Age</label>
                    <input type="text" class="form-control"  oninput="validateAge()" maxlength="2" id="ageId" name="age" value="${dto.age}" required>
                    <span class="text-danger" id="ageErrorId"></span>
                </div>
                <div class="col-3">
                    <label for="genderId" class="form-label">Gender</label>
                    <select class="form-select" name="gender" id="genderId" required>
                        <option value="" selected disabled>Select Gender</option>
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                        <option value="other">Other</option>
                    </select>
                    <span class="text-danger" id="genderErrorId"></span>
                </div>
            </div>
            <div class="mb-3">
                <label for="addressId" class="form-label">Address</label>
                <input type="text" class="form-control" name="address" value="${dto.address}" id="addressId" required style="height: 100px;">
            </div>
            <div class="row mb-3">
                <div class="col">
                    <label for="passwordId" class="form-label">Password</label>
                    <div class="position-relative">
                        <input type="password" class="form-control" oninput="validatePassword()" name="password" id="passwordId" minlength="8" maxlength="15" required>
                        <button type="button" class="position-absolute top-50 end-0 translate-middle-y text-danger  border-0 bg-transparent" onclick="viewPassword()">
                            <i class="bi bi-eye" id="toggleIcon"></i>
                        </button>
                    </div>
                    <span id="passwordErrorId" class="text-danger"></span>
                </div>
                <div class="col">
                    <label for="cpasswordId" class="form-label">Confirm Password</label>
                    <input type="password" class="form-control" oninput="validateConfirmPassword()" id="cpasswordId" minlength="8" maxlength="15" name="cpassword" required>
                    <span id="cpasswordErrorId" class="text-danger"></span>
                </div>
            </div>
            <div class="mb-3">
                <button class="btn btn-danger w-100">Submit</button>
            </div>
            <div class="text-success text-center">
                <c:if test="${not empty status}">
                    <c:choose>
                        <c:when test="${status == true}">
                            <p>Sucessfully Registered</p>
                        </c:when>
                        <c:otherwise>
                            <p>Failed to Register</p>
                        </c:otherwise>
                    </c:choose>
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