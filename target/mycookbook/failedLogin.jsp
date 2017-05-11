
<%@include file="/jsp/taglib.jsp"%>
<c:set var="title" value="Failed Log In" />
<%@include file="/jsp/head.jsp"%>

<html>
<body>

<%@include file="/jsp/fixedNavbar.jsp"%>

<div class="container-fluid">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <h2>Invalid userid/password combination.</h2><br />
        <a href="index.jsp">Try again</a>
    </div>
</div>

<%@include file="/jsp/footer.jsp"%>
</body>
</html>
