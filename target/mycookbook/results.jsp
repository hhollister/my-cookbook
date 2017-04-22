<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Results</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="jumbotron.css" rel="stylesheet">

</head>

<html>
<body>



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


            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
