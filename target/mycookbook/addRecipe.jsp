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

        <title>Add Recipe</title>

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
                <h1>Add A Recipe Information</h1>
                <p>Please add your recipe by completing the following steps below. Once you are completely finished adding
                    your recipe, you may select Add Recipe at the bottom of the page. Your information will not be saved unless
                    this recipe is added. You may edit or delete recipes under manage account. </p>
            </div>


            <div class="row">
                 <form class="form-signin" action="/mycookbook/addrecipe">
                    <label for="recipeName" class="sr-only">Name of Recipe</label>
                    <input type="text" id="recipeName" name="recipeName" class="form-control" placeholder="Name of Recipe" required autofocus>
                    <label for="recipeType" class="sr-only">Type of Recipe</label>
                    <input type="text" id="recipeType" name="recipeType" class="form-control" placeholder="Type of Recipe">
                     <label for="foodType" class="sr-only">Type of Food</label>
                     <input type="text" id="foodType" name="foodType" class="form-control" placeholder="Type of Food">
                     <label for="prepTime" class="sr-only">Preparation Time</label>
                    <input type="text" id="prepTime" name="prepTime" class="form-control" placeholder="Preparation Time (in minutes)">
                    <label for="cookTime" class="sr-only">Cook Time</label>
                    <input type="text" id="cookTime" name="cookTime" class="form-control" placeholder="Cook Time (in minutes)">
                    <label for="yield" class="sr-only">Yield</label>
                    <input type="text" id="yield" name="yield" class="form-control" placeholder="Yield">
                    <label for="preheat" class="sr-only">Preheat Temperature</label>
                    <input type="text" id="preheat" name="preheat" class="form-control" placeholder="Preheat Temperature">
                    <label for="notes" class="sr-only">Notes</label>
                    <input type="textbox" id="notes" name="notes" class="form-control" placeholder="Notes">

                    <br />

                    <button class="btn btn-lg btn-primary btn-block" type="submit">Next: Add Ingedients</button>

                </form>

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
