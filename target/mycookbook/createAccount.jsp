
<%@include file="/jsp/taglib.jsp"%>
<c:set var="title" value="Create Account" />
<%@include file="/jsp/head.jsp"%>

<html>
<body>


<div class="container-fluid" role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <h1>Create Your Account</h1>
        <p></p>

        <div class="row">

            <div class="col-md-3">
            </div>

            <div class="col-md-6">
                <form class="form-signin" action="/mycookbook/createaccount">
                    <label for="firstName" class="sr-only">First Name</label>
                    <input type="text" id="firstName" name="firstName" class="form-control" placeholder="First Name" required autofocus>
                    <label for="emailAddress" class="sr-only">Email Address</label>
                    <input type="text" id="emailAddress" name="emailAddress" class="form-control" placeholder="Email Address" requried>
                    <label for="username" class="sr-only">Username</label>
                    <input type="text" id="username" name="username" class="form-control" placeholder="Username" required>
                    <label for="password" class="sr-only">Password</label>
                    <input type="password" id="password" name="password" class="form-control" placeholder="Password" required>

                    <br />

                    <button class="btn btn-lg btn-primary btn-block" type="submit">Create Account</button>

                </form>

            </div>
        </div>
    </div>

</div> <!-- /container -->


<%@include file="/jsp/footer.jsp"%>
</body>
</html>
