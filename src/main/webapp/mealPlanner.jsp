
<%@include file="/jsp/taglib.jsp"%>
<c:set var="title" value="Meal Planner" />
<%@include file="/jsp/head.jsp"%>


<html>
<body>
<%@include file="/jsp/fixedNavbar.jsp"%>

<div class="container-fluid" role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <h1>Meal Planner</h1>

        <div class="row">
            <form class="form-signin">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Day of Week</th>
                            <th>Enter Meal</th>
                            <th>Meal Planned</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Sunday</td>
                            <td>
                                <input type="text" id="sunday" name="sunday" class="form-control" placeholder="Sunday Meal" autofocus>
                            </td>
                            <td>Test</td>
                        </tr>
                        <tr>
                            <td>Monday</td>
                            <td>
                                <input type="text" id="monday" name="monday" class="form-control" placeholder="Monday Meal">
                            </td>
                            <td>Test</td>
                        </tr>
                        <tr>
                            <td>Tuesday</td>
                            <td>
                                <input type="text" id="tuesday" name="tuesday" class="form-control" placeholder="Tuesday Meal">
                            </td>
                            <td>Test</td>
                        </tr>
                        <tr>
                            <td>Wednesday</td>
                            <td>
                                <input type="text" id="wednesday" name="wednesday" class="form-control" placeholder="Wednesday Meal">
                            </td>
                            <td>Test</td>
                        </tr>
                        <tr>
                            <td>Thursday</td>
                            <td>
                                <input type="text" id="thursday" name="thursday" class="form-control" placeholder="Thursday Meal">
                            </td>
                            <td>Test</td>
                        </tr>
                        <tr>
                            <td>Friday</td>
                            <td>
                                <input type="text" id="friday" name="friday" class="form-control" placeholder="Friday Meal">
                            </td>
                            <td>Test</td>
                        </tr>
                        <tr>
                            <td>Saturday</td>
                            <td>
                                <input type="text" id="saturday" name="saturday" class="form-control" placeholder="Saturday Meal">
                            </td>
                            <td>Test</td>
                        </tr>
                    </tbody>
                </table>

                <br />
                <div class="col-md-3">
                </div>

                <div class="col-md-6">
                    <button class="btn btn-lg btn-primary btn-block" type="submit">Add To Planner</button>
                </div>

                <br />
            </form>
        </div>

    </div>


</div> <!-- /container -->

<%@include file="/jsp/footer.jsp"%>
</body>
</html>
