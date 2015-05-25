<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css"
	href="resources/css/shopping3-1.css">
<title>상품목록화면</title>
</head>
<body>
	<div align="center" class="body">
		<h2>상품 목록 화면</h2>
		<table border="1">
			<tr class="herader">
				<th align="center" width="80">상품ID</th>
				<th align="center" width="320">상품명</th>
				<th align="center" width="100">가격</th>
			</tr>
			<c:forEach items=${itemLsit} var="item">
				<tr class="record">
					<td align="center">${item.itemId}</td>
					<td align="left">${item.itemName}</td>
					<td align="right">${item.price}원</td>
				</tr>
			</c:forEach>
		</table>
	</div>	
</body>
</html>