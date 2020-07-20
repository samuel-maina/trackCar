<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{font:0.7em sans-serif;}
td{padding:10px;
border:1px dashed #3e3;
margin:0px;
}
table{padding: 20% 30%;}
</style>
</head>
<body>
<table>
<tr>
<td>Latitude</td>
<td>Longitude</td>
<td>Time</td>
<td>DeviceId</td>
<td>Accuracy</td>
<td>Direction</td>
<td>Speed</td>
<td>Altitude</td>

</tr>
<c:forEach items="${DeviceDataPoints}" var="datapoints">
<tr>
<td>${datapoints.latitude }</td>
<td>${datapoints.longitude}</td>
<td>${datapoints.time }</td>
<td>${datapoints.deviceId }</td>
<td>${datapoints.accuracy }</td>
<td>${datapoints.direction }</td>
<td>${datapoints.speed }</td>
<td>${datapoints.altitude }</td>
</tr>
</c:forEach>

</table>

</body>
</html>