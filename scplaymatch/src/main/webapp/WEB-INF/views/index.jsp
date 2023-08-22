<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!-- JSTL -->
<!DOCTYPE html>
<html>
<head>
<style>
	#insertTable {
		text-align: center;
	}
	
	#selectTable {
		text-align: center;
	}
	
	#selectTable td {
		width: 100px;
	}
</style>
<meta charset="UTF-8">
<title>JSP Title</title>
</head>
<body>
	<h2>카트에 담을 물건</h2>
	<form method="post" action="/insertCarts.do"> <!-- post요청으로 /mvc/insertCarts.do에 데이터 전송 -->
		<table id="insertTable">
			<tr>
				<td>이름1</td>
				<td>가격1</td>
				<td>갯수1</td>
			</tr>
			<tr>
				<!-- Controller의 파라미터값과 input태그의 name값이 서로 매핑 -->
				<td><input type="text" name="name" /></td> <!-- Cart클래스의 name에 들어갈 값 -->
				<td><input type="number" name="num" /></td> <!-- Cart클래스의 price에 들어갈 값 -->
				<td><input type="number" name="count" /></td> <!-- Cart클래스의 count에 들어갈 값 -->
			</tr>
		</table>
		<input type="submit" value="카트담기"/> <!-- 버튼 클릭 시 데이터 전송 -->
	</form>
	
	<h2>카트에 담겨있는 물건</h2>
	<table id="selectTable">
		<tr>
			<td>이름2</td>
			<td>가격2</td>
			<td>갯수2</td>
		</tr>
		<c:forEach items="${carts}" var="cart"> <!-- Controller에서 Model에 carts라는 이름으로 넣어둔 값을 jstl을 이용하여 반복문 시행 -->
			<tr>
				<td>${cart.name }</td>
				<td>${cart.num }</td>
				<td>${cart.count }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>