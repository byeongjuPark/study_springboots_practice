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
    <div>CommonCode JSP</div>
    <table>
        <tr>
            <th scope=>#</th>
            <th class="col-9" scope=>COMMON_CODE_ID</th>
            <th scope=>NAME</th>
            <th scope=>ORDER_NUMBER</th>
        </tr>
        <c:forEach items="${commonCodeDao}" var="data" varStatus="status">
            <tr>
                <th scope=>${status.count}</th>
                <td>${data.COMMON_CODE_ID}</td>
                <td>${data.NAME}</td>
                <td>${data.ORDER_NUMBER}</td>
            </tr>
        </c:forEach>
    </table>
</body>

</html>