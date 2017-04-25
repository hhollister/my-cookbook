<!DOCTYPE html>
<%@include file="/jsp/taglib.jsp"%>
<c:set var="title" value="Authentication Failed" />
<html xmlns="http://www.w3.org/1999/xhtml">
<html lang="en">
<%@include file="/jsp/head.jsp"%>

<body>

<%@include file="/jsp/fixedNavbar.jsp"%>
    <h2>Invalid userid/password combination.</h2><br />
    <a href="index.jsp">Try again</a>

<%@include file="/jsp/footer.jsp"%>
</body>
</html>
