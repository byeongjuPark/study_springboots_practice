<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <div>Notice JSP</div>
    <table>
        <tr>
            <th scope=>#</th>
            <th class="col-9" scope=>Title</th>
            <th scope=>user name</th>
            <th scope=>date</th>
        </tr>
        <c:forEach items="${dataInfo}" var="data" varStatus="status">
            <tr>
                <th scope=>${status.count}</th>
                <td><a href="/notice/edit/${data.title}">${data.title}</a></td>
                <td>${data.userName}</td>
                <td>${data.date}</td>
            </tr>
        </c:forEach>
        <tr>
            <td><a href="/notice/001">notice/001</a></td>
            <td><a href="/notice/001">notice/001</a></td>
            <td><a href="/notice/001">notice/001</a></td>
            <td><a href="/notice/001">notice/001</a></td>
        </tr>
    </table>
</body>

</html>