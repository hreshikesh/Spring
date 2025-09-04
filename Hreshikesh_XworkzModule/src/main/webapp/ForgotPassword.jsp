
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Module Project</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.min.css">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>

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
<c:if test="${not empty errors}">
    <div class="mt-3">

            <c:forEach var="error" items="${errors}" varStatus="loop">
                <div class="alert alert-dark" role="alert">
                    <p class="text-center text-danger">${error.defaultMessage}</p>
                </div>
            </c:forEach>

    </div>

</c:if>

<div class="container d-flex justify-content-center mt-4 align-items-center min-vh-100">
    <div class=" p-5 shadow-lg w-75 mb-5 rounded">
        <h3 class="fw-bold display-4 text-center text-danger mb-3">Update Password</h3>
        <form action="updatePassword" class="bg-dark p-4 " method="post">
            <div class="row mb-3">
                <div class="col-6 mx-auto">
                    <label for="passwordId" class="form-label">New password</label>
                    <div class="position-relative">
                        <input type="password" class="form-control" oninput="validatePassword()" name="password" id="passwordId" required>
                        <button type="button" class="position-absolute top-50 end-0 translate-middle-y text-danger  border-0 bg-transparent" onclick="viewPassword()">
                            <i class="bi bi-eye" id="toggleIcon"></i>
                        </button>
                    </div>
                    <span id="passwordErrorId" class="text-danger"></span>
                </div>
            </div>
            <div class="row mb-3">
                <div class="col-6 mx-auto">
                    <label for="cpasswordId" class="form-label">Confirm Password</label>
                    <input type="password" class="form-control" oninput="validateConfirmPassword()" id="cpasswordId" name="cpassword" required>
                    <span id="cpasswordErrorId" class="text-danger"></span>
                </div>
                <input type="hidden" name="email" value="${email}">
            </div>
            <div class="mb-3 text-center">
                <button class="btn btn-danger w-50 ">Submit</button>
            </div>
        </form>
        <div>
            <c:if test="${submitted}">
                    <c:if test="${status==true}">
                        <div class="modal fade show d-block" id="exampleModal" tabindex="-1" aria-labelledby="success" aria-modal="true" role="dialog">
                            <div class="modal-dialog modal-dialog-centered ">
                                <div class="modal-content bg-dark">
                                    <div class="modal-header  justify-content-center">
                                        <h1 class="modal-title text-success fs-5" id="exampleModalLabel">Update Successful</h1>
                                    </div>
                                    <div class="modal-body">
                                        <p class="text-center text-success lead">Password Successfully Updated</p>
                                    </div>
                                    <div class="modal-footer justify-content-center">
                                        <a href="signin.jsp" class="btn btn-outline-danger" role="button">Signin</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal-backdrop fade show"></div>
                    </c:if>
                    <c:if test="${status==false}">
                        <div class="alert alert-danger text-center mt-3" role="alert">
                            Password not updated. Try again.
                        </div>
                    </c:if>
            </c:if>
        </div>
    </div>
</div>




<script src="index.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q"
        crossorigin="anonymous"></script>
</body>
</html>