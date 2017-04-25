<!DOCTYPE html>
<%@include file="/jsp/taglib.jsp"%>
<c:set var="title" value="Recipes" />
<html xmlns="http://www.w3.org/1999/xhtml">
<html lang="en">
<%@include file="/jsp/head.jsp"%>

<body>

<%@include file="/jsp/fixedNavbar.jsp"%>

    <div class="container-fluid" role="main">

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

<%@include file="/jsp/footer.jsp"%>
</body>
</html>
