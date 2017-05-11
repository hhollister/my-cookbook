
<%@include file="/jsp/taglib.jsp"%>
<c:set var="title" value="Log In" />
<%@include file="/jsp/head.jsp"%>


<html>
<body>

<%@include file="/jsp/fixedNavbar.jsp"%>

<div class="container-fluid" role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <h1>Login</h1>
        <p>Login to your account. If you don't have an account, you may <a href="createAccount.jsp">create a new account</a>.</p>

        <div class="row">
            <div class="col-md-3">
            </div>

            <div class="col-md-6">
                <form class="form-signin" action="j_security_check" method="POST">
                    <h2 class="form-signin-heading">Please sign in</h2>
                    <label for="username" class="sr-only">Username</label>
                    <input type="text" id="username" class="form-control" placeholder="Username" name="j_username" required autofocus>
                    <label for="password" class="sr-only">Password</label>
                    <input type="password" id="password" class="form-control" placeholder="Password" name="j_password" required>
                    <br />
                    <button type="submit" id="myButton" data-loading-text="Loading..." class="btn btn-lg btn-primary btn-block" autocomplete="off">
                        Sign In
                    </button>

                </form>
            </div>
        </div>
    </div>

</div> <!-- /container -->


<%@include file="/jsp/footer.jsp"%>
</body>
</html>
