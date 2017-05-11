
<%@include file="/jsp/taglib.jsp"%>
<c:set var="title" value="Edit Recipe" />
<%@include file="/jsp/head.jsp"%>

<html>
<body>

<%@include file="/jsp/fixedNavbar.jsp"%>

    <div class="container-fluid" role="main">

        <!-- Main jumbotron for a primary marketing message or call to action -->
        <div class="jumbotron">
            <h1>Edit Your Recipe</h1>
            <p>Add, move, or delete your ingredients or instructions below.</p>
        </div>


        <div class="row">

            <div class="page-header">
                <h1>Information</h1>
            </div>

            <form class="form-signin">
                <label for="recipeName" class="sr-only">Name of Recipe</label>
                <input type="text" id="recipeName" class="form-control" placeholder="Name of Recipe" required autofocus>
                <label for="recipeType" class="sr-only">Type of Recipe</label>
                <input type="text" id="recipeType" class="form-control" placeholder="Type of Recipe">
                <label for="prepTime" class="sr-only">Preparation Time</label>
                <input type="text" id="prepTime" class="form-control" placeholder="Preparation Time (in minutes)">
                <label for="cookTime" class="sr-only">Cook Time</label>
                <input type="text" id="cookTime" class="form-control" placeholder="Cook Time (in minutes)">
                <label for="yield" class="sr-only">Yeild</label>
                <input type="text" id="yield" class="form-control" placeholder="Yeild">
                <label for="preheat" class="sr-only">Preheat Temperature</label>
                <input type="text" id="preheat" class="form-control" placeholder="Preheat Temperature">
                <label for="notes" class="sr-only">Notes</label>
                <input type="textbox" id="notes" class="form-control" placeholder="Notes">

            <div class="page-header">
                <h1>Ingredients</h1>
            </div>

            <div class="col-md-6">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Ingredient</th>
                            <th>Amount</th>
                            <th>Measurement</th>
                            <th>Move Down</th>
                            <th>Move Up</th>
                            <th>Delete</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
            </div>

                <label for="recipeIngredient" class="sr-only">Ingredient</label>
                <input type="text" id="recipeIngredient" class="form-control" placeholder="Ingredient" required>
                <label for="ingredientAmount" class="sr-only">Amount</label>
                <input type="text" id="ingredientAmount" class="form-control" placeholder="Amount">
                <label for="ingredientMeasurement" class="sr-only">Form of Measurement</label>
                <input type="text" id="ingredientMeasurement" class="form-control" placeholder="Form of Measurement (i.e. cups, teaspoons, tablespoons, etc.">
                <label for="yield" class="sr-only">Yeild</label>
                <input type="text" id="yield" class="form-control" placeholder="Yeild">
                <label for="preheat" class="sr-only">Preheat Temperature</label>
                <input type="text" id="preheat" class="form-control" placeholder="Preheat Temperature">

                <br />

            <p><button type="button" class="btn btn-default">Add Ingredient</button></p>


            <div class="page-header">
                <h1>Instructions</h1>
            </div>

            <div class="col-md-6">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Step</th>
                            <th>Instruction</th>
                            <th>Move Down</th>
                            <th>Move Up</th>
                            <th>Delete</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
            </div>

                <label for="recipeInstruction" class="sr-only">Instruction</label>
                <input type="recipeInstruction" id="notes" class="form-control" placeholder="Instruction">

                <br />

            <p><button type="button" class="btn btn-default">Add Instruction</button></p>

            <br />
            <br />

            <button class="btn btn-lg btn-primary btn-block" type="submit">Add Recipe</button>
            </form>

        </div>


    </div> <!-- /container -->

<%@include file="/jsp/footer.jsp"%>
</body>
</html>
