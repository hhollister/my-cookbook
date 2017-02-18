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

        <title>Meal Planner</title>

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
                        <li class="active"><a href="mealPlanner.jsp">Meal Planner</a></li>
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
                <h1>Meal Planner</h1>
                <p></p>
            </div>


            <div class="row">

                <div class="row">
                    <div class="col-xs-6 col-sm-4"><b>Day of Week</b></div>
                    <div class="col-xs-6 col-sm-4"><b>Enter Meal</b></div>
                    <div class="col-xs-6 col-sm-4"><b>Meal Planned</b></div>
                </div>

                <br />
                <form class="form-signin">
                    <div class="row">
                        <div class="col-xs-6 col-sm-4">Sunday</div>
                        <div class="col-xs-6 col-sm-4">
                            <label for="mealName" class="sr-only">Sunday Meal</label>
                            <input type="text" id="mealName" class="form-control" placeholder="Sunday Meal" autofocus>
                        </div>
                        <div class="col-xs-6 col-sm-4">test</div>
                    </div>

                    <br />

                    <div class="row">
                        <div class="col-xs-6 col-sm-4">Monday</div>
                        <div class="col-xs-6 col-sm-4">
                            <input type="text" id="mondayMeal" class="form-control" placeholder="Monday Meal" >
                            <label for="TuesdayMeal" class="sr-only">Tuesday Meal</label>
                        </div>
                        <div class="col-xs-6 col-sm-4">test</div>
                    </div>

                    <br />

                    <div class="row">
                        <div class="col-xs-6 col-sm-4">Tuesday</div>
                        <div class="col-xs-6 col-sm-4">
                            <label for="TuesdayMeal" class="sr-only">Tuesday Meal</label>
                            <input type="text" id="TuesdayMeal" class="form-control" placeholder="Tuesday Meal" >
                        </div>
                        <div class="col-xs-6 col-sm-4">test</div>
                    </div>

                    <br />

                    <div class="row">
                        <div class="col-xs-6 col-sm-4">Wednesday</div>
                        <div class="col-xs-6 col-sm-4">
                            <label for="wednesdayMeal" class="sr-only">Wednesday Meal</label>
                            <input type="text" id="wednesdayMeal" class="form-control" placeholder="Wednesday Meal" >
                        </div>
                        <div class="col-xs-6 col-sm-4">test</div>
                    </div>

                    <br />

                    <div class="row">
                        <div class="col-xs-6 col-sm-4">Thursday</div>
                        <div class="col-xs-6 col-sm-4">
                            <label for="thursdayMeal" class="sr-only">Thursday Meal</label>
                            <input type="text" id="thursdayMeal" class="form-control" placeholder="Thursday Meal" >
                        </div>
                        <div class="col-xs-6 col-sm-4">test</div>
                    </div>

                    <br />

                    <div class="row">
                        <div class="col-xs-6 col-sm-4">Friday</div>
                        <div class="col-xs-6 col-sm-4">
                            <label for="fridayMeal" class="sr-only">Friday Meal</label>
                            <input type="text" id="fridayMeal" class="form-control" placeholder="Friday Meal" >
                        </div>
                        <div class="col-xs-6 col-sm-4">test</div>
                    </div>

                    <br />

                    <div class="row">
                        <div class="col-xs-6 col-sm-4">Saturday</div>
                        <div class="col-xs-6 col-sm-4">
                            <label for="saturdayMeal" class="sr-only">Saturday Meal</label>
                            <input type="text" id="saturdayMeal" class="form-control" placeholder="Saturday Meal" >
                        </div>
                        <div class="col-xs-6 col-sm-4">test</div>
                    </div>

                    <br />

                    <div class="row">
                        <div class="col-xs-6 col-sm-4"></div>
                        <div class="col-xs-6 col-sm-4">
                            <button class="btn btn-lg btn-primary btn-block" type="submit">Add To Planner</button>
                        </div>
                        <div class="col-xs-6 col-sm-4"></div>
                    </div>

                    <br />

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
