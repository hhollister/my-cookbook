<!DOCTYPE html>
<%@include file="/jsp/taglib.jsp"%>
<c:import url="/recipes"/>
<c:set var="title" value="Recipes" />
<%@include file="/jsp/head.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#recipesTable').DataTable();
    } );
</script>
<html xmlns="http://www.w3.org/1999/xhtml">
<body>

<%@include file="/jsp/fixedNavbar.jsp"%>

<div class="container-fluid" role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <h1>Your Recipes</h1>
        <p>Here is a list of the recipes you have added to your account.</p>

        <table class="table table-hover" id="recipesTable">
            <thead>
                <tr>
                    <th>Meal Category</th>
                    <th>Food Category</th>
                    <th>Recipe</th>
                    <th>Preparation</th>
                    <th>Cook Time</th>
                    <th>View Recipe</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="recipe" items="${recipes}">
                    <form class="form-signin" action="/mycookbook/showrecipe">
                        <tr>
                            <td>${recipe.meal_category}</td>
                            <td>${recipe.food_category}</td>
                            <td>${recipe.recipe_name}</td>
                            <td>${recipe.preparation_time}</td>
                            <td>${recipe.cook_time}</td>
                            <td>
                                <button type="submit" class="btn btn-default" aria-label="View Recipe" value=${recipe.getRecipeid()}>
                                    <span class="glyphicon glyphicon-info-sign" aria-hidden="true">
                                        <input type="hidden" id="recipeid" name="recipeid" class="form-control" value=${recipe.getRecipeid()}>
                                    </span>
                                </button>
                            </td>
                        </tr>

                    </form>
                </c:forEach>
            </tbody>
        </table>
    </div>

</div> <!-- /container -->


<%@include file="/jsp/footer.jsp"%>
</body>
</html>
