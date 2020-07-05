<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Eclipse Appk</title>
<style>
body{padding:20% 30%;
font:0.7em sans-serif ;
}
a{text-decoration:none;
}
</style>
</head>
<body>
<p>This application receives data from a gps device set in a vehicle and posts the data to a database for future reference and tracking</p>
<a href="postgpsdata?lat=3478&long=788967&time=1232309&id=4543&accuracy=12356&direction=45&speed=3433&altitude=456">Mock data to for a real gps device</a>
<br>
<a href="getdevicedata?deviceid=4543">test get device data</a>
</body>
</html>