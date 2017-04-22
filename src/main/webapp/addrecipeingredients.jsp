<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../favicon.ico">

        <title>Add Recipe Ingredients</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <!-- Bootstrap theme -->
        <link href="css/bootstrap-theme.min.css" rel="stylesheet">
        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="theme.css" rel="stylesheet">

    </head>

    <body>

        <!-- Fixed navbar -->
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">My Cookbook</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="recipes.jsp">Home</a></li>
                        <li><a href="mealPlanner.jsp">Meal Planner</a></li>
                        <li class="active"><a href="addRecipe.jsp">Add Recipe</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li role="separator" class="divider"></li>
                                <li class="dropdown-header">Nav header</li>
                                <li><a href="#">Separated link</a></li>
                                <li><a href="#">One more separated link</a></li>
                            </ul>
                        </li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>

        <div class="container theme-showcase" role="main">

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                <h1>Add A Recipe Ingredient</h1>
                <p>Please add your recipe by completing the following steps below. You may edit or delete recipes under manage account. </p>
            </div>


            <div class="row">

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
                            <c:forEach var="ingredient" items="${ingredients}">
                                <tr>
                                    <td>${ingredient.getIngredient()}</td>
                                    <td>${ingredient.getQuantity()}</td></td>
                                    <td>${ingredient.getUnits_measurement()}</td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>

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

                <div class="row">

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

                    <form class="form-signin" action="/mycookbook/addrecipeinstructions">
                        <input type="hidden" id="recipeName" name="recipeName" class="form-control" value=${recipeName} readonly>
                        <label for="recipeInstruction" class="sr-only">Instruction</label>
                        <input type="recipeInstruction" id="recipeInstruction" name="recipeInstruction" class="form-control" placeholder="Instruction" required autofocus>

                        <br />

                        <button class="btn btn-lg btn-primary btn-block" type="submit">Add Instruction To Recipe</button>
                    </form>

                    <br />

                    <form class="form-signin" action="/mycookbook/recipecomplete">
                        <button class="btn btn-lg btn-primary btn-block" type="submit">Recipe Complete</button>
                    </form>
                </div>
            </div>


        </div> <!-- /container -->


        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
        <script src="../../dist/js/bootstrap.min.js"></script>
        <script src="../../assets/js/docs.min.js"></script>
        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
    </body>
</html>
