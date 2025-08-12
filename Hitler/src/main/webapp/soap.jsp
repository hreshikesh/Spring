<!DOCTYPE html>
<html>
<head>
    <title>Soap Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>

<div class="container mt-5">
    <h2 >Soap Form</h2>

    <div class="row justify-content-center">
        <form class="col-6" action="soap" method="post">

            <div class="form-floating mb-3">
                <input type="text" class="form-control" id="typeId" name="type" required>
                <label for="typeId">Type</label>
            </div>

            <div class="form-floating mb-3">
                <input type="text" class="form-control" id="originId" name="origin" required>
                <label for="originId">Origin</label>
            </div>

            <div class="form-floating mb-3">
                <input type="text" class="form-control" id="companyId" name="company" required>
                <label for="companyId">Company</label>
            </div>

            <div class="form-floating mb-3">
                <input type="text" class="form-control" id="priceId" name="price" required>
                <label for="priceId">Price</label>
            </div>

            <div class="form-floating mb-3">
                <input type="text" class="form-control" id="quantityId" name="quantity" required>
                <label for="quantityId">Quantity</label>
            </div>

            <button type="submit" class="btn btn-primary">Submit Soap</button>

        </form>
    </div>
    <img src="smps.jpeg" alt="">
</div>

</body>
</html>
