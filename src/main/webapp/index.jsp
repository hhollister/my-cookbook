
<%@include file="/jsp/taglib.jsp"%>
<c:import url="/recipes"/>
<c:set var="title" value="Recipes" />
<%@include file="/jsp/head.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#recipesTable').DataTable();
    } );
</script>
<html>
<body>
<%@include file="/jsp/fixedNavbar.jsp"%>

<div class="container-fluid">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <br />
        <h4><HH:Hello/></h4>
        <h1>Your Recipes</h1>
        <p>Here is a list of the recipes you have added to your account.</p>

        <table id="recipesTable" class="display" cellspacing="0" width="100%">
            <thead>
            <th>Meal Category</th>
            <th>Food Category</th>
            <th>Recipe</th>
            <th>Preparation</th>
            <th>Cook Time</th>
            <th>View Recipe</th>
            </thead>
            <tbody>
            <c:forEach var="recipe" items="${recipes}">
                <tr>
                    <td>${recipe.meal_category}</td>
                    <td>${recipe.food_category}</td>
                    <td>${recipe.recipe_name}</td>
                    <td>${recipe.preparation_time}</td>
                    <td>${recipe.cook_time}</td>
                    <td>
                        <form action="/mycookbook/showrecipe">
                            <input type="hidden" id="recipeid" name="recipeid" class="form-control" value=${recipe.getRecipeid()}>
                            <button type="submit" class="btn btn-default" aria-label="View Recipe" value=${recipe.getRecipeid()}>
                                <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>
                            </button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</div> <!-- /container -->


<%@include file="/jsp/footer.jsp"%>
</body>
</html>
