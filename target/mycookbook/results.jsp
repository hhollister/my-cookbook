<!DOCTYPE html>
<%@include file="/jsp/taglib.jsp"%>
<c:set var="title" value="Results" />
<html xmlns="http://www.w3.org/1999/xhtml">
<html lang="en">
<%@include file="/jsp/head.jsp"%>

<body>

<%@include file="/jsp/fixedNavbar.jsp"%>

<div class="container-fluid">
    <h2>Results: </h2>
    <table id="userTable" class="display" cellspacing="0" width="100%">
        <thead>
        <th>ID</th>
        <th>First Name</th>
        <th>Email</th>
        </thead>
        <tbody>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.userid}</td>
                    <td>${user.firstName}</td></td>
                    <td>${user.email}</td>
                </tr>



                <th>Move Down</th>
                <th>Move Up</th>
                <th>Delete</th>

                <td>
                    <button type="button" class="btn btn-default" aria-label="Move Down">
                        <span class="glyphicon glyphicon-arrow-down" aria-hidden="true"></span>
                    </button>
                </td>
                <td>
                    <button type="button" class="btn btn-default" aria-label="Move Up">
                        <span class="glyphicon glyphicon-arrow-up" aria-hidden="true"></span>
                    </button>
                </td>
                <td>
                    <button type="button" class="btn btn-default" aria-label="Delete">
                        <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                    </button>
                </td>

            </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="/jsp/footer.jsp"%>

</body>
</html>
