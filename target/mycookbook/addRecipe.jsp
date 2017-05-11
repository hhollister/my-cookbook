<%@include file="/jsp/taglib.jsp"%>
<c:set var="title" value="Add Recipe" />
<%@include file="/jsp/head.jsp"%>

<html>
<body>

<%@include file="/jsp/fixedNavbar.jsp"%>

<div class="container-fluid" role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <h1>Add A Recipe</h1>
        <p>Please add your recipe by completing the following steps below. Once you are completely finished adding
            your recipe, you may select Add Recipe at the bottom of the page. Your information will not be saved unless
            this recipe is added. You may edit or delete recipes under manage account. </p>

        <div class="row">

            <div class="col-md-3">
            </div>

            <div class="col-md-6">
                 <form class="form-signin" action="/mycookbook/addrecipe">
                     <label for="recipeName" class="sr-only">Name of Recipe</label>
                     <input type="text" id="recipeName" name="recipeName" class="form-control" placeholder="Name of Recipe" title="Enter the name of your recipe" required autofocus>
                     <label for="recipeType" class="sr-only">Type of Recipe</label>
                     <input type="text" id="recipeType" name="recipeType" class="form-control" placeholder="Type of Recipe" title="Enter the type of recipe ie Breakfast, Lunch, Dinner, Appetizer, Dessert, etc.">
                     <label for="foodType" class="sr-only">Type of Food</label>
                     <input type="text" id="foodType" name="foodType" class="form-control" placeholder="Type of Food" title="Enter the type of food ie Beef, Chicken, Pork, Vegetarian, etc.">
                     <label for="prepTime" class="sr-only">Preparation Time</label>
                     <input type="text" id="prepTime" name="prepTime" class="form-control" placeholder="Preparation Time (in minutes)" title="Enter the amount of time it takes to prepare the recipe in minutes">
                     <label for="cookTime" class="sr-only">Cook Time</label>
                     <input type="text" id="cookTime" name="cookTime" class="form-control" placeholder="Cook Time (in minutes)" title="Enter the time it takes to cook the recipe in minutes.">
                     <label for="yield" class="sr-only">Yield</label>
                     <input type="text" id="yield" name="yield" class="form-control" placeholder="Yield" title="Enter the amount of servings this recipe produces.">
                     <label for="preheat" class="sr-only">Preheat Temperature</label>
                     <input type="text" id="preheat" name="preheat" class="form-control" placeholder="Preheat Temperature" title="Enter the temperature the recipe should cook at (if applicable).">
                     <label for="notes" class="sr-only">Notes</label>
                     <input type="textbox" id="notes" name="notes" class="form-control" placeholder="Notes" title="Enter any notes you would like for this recipe">

                     <br />

                     <button type="submit" id="myButton" data-loading-text="Loading..." class="btn btn-lg btn-primary btn-block" autocomplete="off">
                         Next: Add Ingredients
                     </button>

                </form>

            </div>
        </div>
    </div>

</div> <!-- /container -->


<%@include file="/jsp/footer.jsp"%>
</body>
</html>
