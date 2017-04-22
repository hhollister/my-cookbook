<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Recipes</title>

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
                <li class="active"><a href="recipes.jsp">Home</a></li>
                <li><a href="mealPlanner.jsp">Meal Planner</a></li>
                <li><a href="addRecipe.jsp">Add Recipe</a></li>
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
        <h1>Your Recipes</h1>
        <p>Here is a list of the recipes you have added to your account.</p>
    </div>


    <div class="page-header">
        <h1>Appetizers</h1>
    </div>
    <div class="row">
        <div class="col-md-6">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>Type</th>
                    <th>Recipe</th>
                    <th>Preparation</th>
                    <th>Total Time</th>
                    <th>Ingredients</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Appetizer</td>
                    <td>Salsa</td>
                    <td>25 minutes</td>
                    <td>60 minutes</td>
                    <td></td>
                </tr>
                <tr>
                    <td>Dinner</td>
                    <td>Lasagna</td>
                    <td>35 minutes</td>
                    <td>75 minutes</td>
                    <td></td>
                </tr>
                <tr>
                    <td>Breakfast</td>
                    <td>Egg Scrample</td>
                    <td>30 minutes</td>
                    <td>30 minutes</td>
                    <td></td>
                </tr>
                <tr>
                    <td>Lunch</td>
                    <td>Panini</td>
                    <td>10 minutes</td>
                    <td>10 minutes</td>
                    <td></td>
                </tr>
                </tbody>
            </table>
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
