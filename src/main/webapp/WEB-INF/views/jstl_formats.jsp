<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <div>jstl_formats.jsp</div>
    <div>
    154114.12 - 154,114.12
    2023.01.16 10:18.50 - 2023 1 16,
    </div>
    <c:set var = "num_first" value = "1234567.89"/>
    <div>세자리 구분 : <fmt:formatNumber value="${num_first}" type ="number" /></div>
    <c:set var = "num_second" value = "0.541"/>
    <div>백분율 : <fmt:formatNumber value="${num_second}" type="percent" /></div>
    <div>jstl Formats - Date</div>
    <c:set var = "date_first" value = "<%= new java.util.Date()%>"/>
    <div>값 출력 : ${date_first}</div>
    <div>time 출력 : <fmt:formatDate value="${date_first}" type="time"/></div>
    <div>Date 출력 : <fmt:formatDate value="${date_first}" type="date"/></div>
    <div>date and time 출력 : <fmt:formatDate value="${date_first}" type="both"/></div>
    <hr />
    <div>jstl Formats - Location</div>
    <c:set var = "num_third" value = "1234567.89"/>
    <c:set var = "date_third" value = "<%= new java.util.Date()%>"/>
    <div>http://www.lingoes.net/en/translator/langcode.htm</div>
    <div>[대한민국] - ko-KR</div>
    <div>나라 : <fmt:setLocale value="ko_KR" scope="session"/></div>
    <div>통화 : <fmt:formatNumber value="${num_third}" type="currency"/></div>
    <div>날짜 : <fmt:formatDate value="${date_third}" type="both"/></div>

    <div>[일본]</div>
    <div>나라 : <fmt:setLocale value="ja_jp" scope="session"/></div>
    <div>통화 : <fmt:formatNumber value="${num_third}" type="currency"/></div>
    <div>날짜 : <fmt:formatDate value="${date_third}" type="both"/></div>

    <div>[미국]</div>
    <div>나라 : <fmt:setLocale value="en-US" scope="session"/></div>
    <div>통화 : <fmt:formatNumber value="${num_third}" type="currency"/></div>
    <div>날짜 : <fmt:formatDate value="${date_third}" type="both"/></div>
    <div></div>

    
    <div></div>
</body>

</html>