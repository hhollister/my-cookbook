<!DOCTYPE html>
<%@include file="/jsp/taglib.jsp"%>
<c:set var="title" value="Add Recipe" />
<html xmlns="http://www.w3.org/1999/xhtml">
<html lang="en">
<%@include file="/jsp/head.jsp"%>

<body>

<%@include file="/jsp/fixedNavbar.jsp"%>

<div class="container-fluid" role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <h1>Add A Recipe Information</h1>
        <p>Please add your recipe by completing the following steps below. Once you are completely finished adding
            your recipe, you may select Add Recipe at the bottom of the page. Your information will not be saved unless
            this recipe is added. You may edit or delete recipes under manage account. </p>

        <div class="row">
            <div class="progress">
                <div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width: 45%">
                    <span class="sr-only">50% Complete</span>
                </div>
            </div>

            <div class="col-md-3">
            </div>

            <div class="col-md-6">
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
