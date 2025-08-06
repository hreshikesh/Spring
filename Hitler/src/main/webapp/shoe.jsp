<!DOCTYPE html>
<html>
<head>
    <title>Shoe Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
</head>
<body>

<h2>Shoe Form</h2>

<div class="row justify-content-center mt-4">
    <form class="col-6" action="shoe" method="post">

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="typeId" name="type" required>
            <label for="typeId">Type</label>
        </div>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="originId" name="origin">
            <label for="originId">Origin</label>
        </div>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="companyId" name="company">
            <label for="companyId">Company</label>
        </div>

        <div class="form-floating mb-3">
            <input type="number" class="form-control" id="priceId" name="price">
            <label for="priceId">Price</label>
        </div>

        <div class="form-floating mb-3">
            <input type="number" class="form-control" id="quantityId" name="quantity">
            <label for="quantityId">Quantity</label>
        </div>

        <button class="btn btn-primary " type="submit">Submit Shoe</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>

</body>
</html>
