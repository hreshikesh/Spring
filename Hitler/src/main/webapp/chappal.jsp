<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.min.js" integrity="sha384-7qAoOXltbVP82dhxHAUje59V5r2YsVfBafyUDxEdApLPmcdhBPg1DKg1ERo0BZlK" crossorigin="anonymous"></script>

<h2>Chappal</h2>

<div class="row d-flex justify-content-center align-items-center">
    <form class="col-4" action="chappal" method="post">

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="chappalNameId" name="chappalName">
            <label for="chappalNameId">Chappal Name</label>
        </div>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="brandId" name="brandName">
            <label for="brandId">Brand</label>
        </div>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="priceId" name="price">
            <label for="priceId">Price</label>
        </div>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="typeId" name="chappalType">
            <label for="typeId">Type</label>
        </div>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="sizeId" name="size">
            <label for="sizeId">Size</label>
        </div>

        <button class="btn btn-primary" type="submit">Chappal Click</button>

    </form>
    <img src="smps.jpeg" alt="">
</div>

</body>
</html>
