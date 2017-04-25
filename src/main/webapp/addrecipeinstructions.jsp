<!DOCTYPE html>
<%@include file="/jsp/taglib.jsp"%>
<c:set var="title" value="Recipe Instructions" />
<html xmlns="http://www.w3.org/1999/xhtml">
<html lang="en">
<%@include file="/jsp/head.jsp"%>

<body>

<%@include file="/jsp/fixedNavbar.jsp"%>

<div class="container-fluid" role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <h1>Add A Recipe Instructions</h1>
        <p>Please add your recipe by completing the following steps below. You may edit or delete recipes under manage account. </p>

        <div class="row">
            <div class="progress">
                <div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 45%">
                    <span class="sr-only">100% Complete</span>
                </div>
            </div>

            <div class="col-md-3">
            </div>

            <div class="col-md-6">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Instruction</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="instruction" items="${instructions}">
                            <tr>
                                <td>${instruction.getInstruction()}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>


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
    </div>


</div> <!-- /container -->

<%@include file="/jsp/footer.jsp"%>

</body>
</html>
