<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.min.js" integrity="sha384-7qAoOXltbVP82dhxHAUje59V5r2YsVfBafyUDxEdApLPmcdhBPg1DKg1ERo0BZlK" crossorigin="anonymous"></script>

<h2>Curry</h2>

<div class="row d-flex justify-content-center align-items-center">
    <form class="col-4" action="curry" method="post">

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="curryNameId" name="curryName">
            <label for="curryNameId">Curry Name</label>
        </div>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="ingredientId" name="mainIngredient">
            <label for="ingredientId">Main Ingredient</label>
        </div>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="priceId" name="price">
            <label for="priceId">Price</label>
        </div>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="typeId" name="curryType">
            <label for="typeId">Curry Type</label>
        </div>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="servingId" name="servingCount">
            <label for="servingId">Serving Count</label>
        </div>

        <button class="btn btn-primary" type="submit">Curry Click</button>

    </form>
</div>

</body>
</html>
