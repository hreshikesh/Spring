<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.min.js" integrity="sha384-7qAoOXltbVP82dhxHAUje59V5r2YsVfBafyUDxEdApLPmcdhBPg1DKg1ERo0BZlK" crossorigin="anonymous"></script>

<h2>Milk</h2>

<div class="row d-flex justify-content-center align-items-center">
    <form class="col-4" action="milk" method="post">

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="milkTypeId" name="milkType">
            <label for="milkTypeId">Milk Type</label>
        </div>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="sourceId" name="source">
            <label for="sourceId">Source </label>
        </div>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="fatContentId" name="company">
            <label for="fatContentId">Company</label>
        </div>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="priceId" name="price">
            <label for="priceId">Price</label>
        </div>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="quantityId" name="quantity">
            <label for="quantityId">Quantity</label>
        </div>

        <button class="btn btn-primary" type="submit">Milk Click</button>

    </form>
</div>

</body>
</html>
