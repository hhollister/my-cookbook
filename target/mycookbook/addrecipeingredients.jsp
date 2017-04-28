<!DOCTYPE html>
<%@include file="/jsp/taglib.jsp"%>
<c:set var="title" value="Recipe Ingredients" />
<html xmlns="http://www.w3.org/1999/xhtml">
<html lang="en">
<%@include file="/jsp/head.jsp"%>

<body>

<%@include file="/jsp/fixedNavbar.jsp"%>

<div class="container-fluid" role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <h1>Add Recipe Ingredients</h1>
        <p>Please add your recipe by completing the following steps below. You may edit or delete recipes under manage account. </p>

        <div class="row">
            <div class="col-md-3">
            </div>

            <div class="col-md-6">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Ingredient</th>
                            <th>Amount</th>
                            <th>Measurement</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="ingredient" items="${ingredients}">
                            <tr>
                                <td>${ingredient.getIngredient()}</td>
                                <td>${ingredient.getQuantity()}</td></td>
                                <td>${ingredient.getUnits_measurement()}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

                <form class="form-signin" action="/mycookbook/addrecipeingredients">
                    <input type="hidden" id="recipeName" name="recipeName" class="form-control" value=${recipeName}>
                    <label for="recipeIngredient" class="sr-only">Ingredient</label>
                    <input type="text" id="recipeIngredient" name="recipeIngredient" class="form-control" placeholder="Ingredient" required autofocus>
                    <label for="ingredientAmount" class="sr-only">Amount</label>
                    <input type="text" id="ingredientAmount" name="ingredientAmount" class="form-control" placeholder="Amount">
                    <label for="ingredientMeasurement" class="sr-only">Form of Measurement</label>
                    <input type="text" id="ingredientMeasurement" name="ingredientMeasurement" class="form-control" placeholder="Form of Measurement (i.e. cups, teaspoons, tablespoons, etc.">

                    <br />

                    <button class="btn btn-lg btn-primary btn-block" type="submit">Add Ingredient To Recipe</button>

                </form>

                <br />

                <form class="form-signin" action="/mycookbook/addrecipeinstructions">
                    <input type="hidden" id="recipeName" name="recipeName" class="form-control" value=${recipeName}>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">Next: Add Recipe Instructions</button>
                </form>
            </div>
        </div>
    </div>

</div> <!-- /container -->


<%@include file="/jsp/footer.jsp"%>
</body>
</html>
