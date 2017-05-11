
<%@include file="/jsp/taglib.jsp"%>
<c:set var="title" value="Recipe" />
<%@include file="/jsp/head.jsp"%>



<html>
<body>
<%@include file="/jsp/fixedNavbar.jsp"%>

<div class="container-fluid" role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <h1>${recipe.getRecipe_name()}</h1>
        <p>Meal Category: ${recipe.getMeal_category()}</p>
        <p>Food Category: ${recipe.getFood_category()}</p>
        <p>Preparation Time: ${recipe.getPreparation_time()}</p>
        <p>Cook Time: ${recipe.getCook_time()}</p>
        <p>Yield: ${recipe.getYield()}</p>
        <p>Preheat Temperature: ${recipe.getPreheat_temperature()}</p>
        <p>Your notes: ${recipe.getNotes()}</p>

        <br />

        <h3>Ingredients</h3>
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

        <br />
        <h3>Instructions</h3>


        <ol>
            <c:forEach var="instruction" items="${instructions}">
                <li>${instruction.getInstruction()}</li>
            </c:forEach>
        </ol>

    </div>
</div> <!-- /container -->


<%@include file="/jsp/footer.jsp"%>
</body>
</html>
