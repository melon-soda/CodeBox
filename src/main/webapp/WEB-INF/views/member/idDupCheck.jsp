<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
		<script type="text/javascript" src="js/idDupCheck.js"></script>
	</head>
	<body>
		<div id="wrap">
			<h2>ID 중복 체크</h2>
			<form id="id_check_form" name="id_check_form" action="idDupCheck" method="post">
				User ID <input type="text" name="id" value="${id}">
				<input type="submit" value="중복 확인"><br>
				<c:if test="${memberAlreadyExists == 1}">
					<span style="font-weight: 800;">${id}</span>는 이미 <span style="color: red; font-weight: 800;">사용중</span>인 아이디입니다.
				</c:if>
				<c:if test="${memberAlreadyExists == -1}">
					<span style="font-weight: 800;">${id}</span>는 <span style="color: blue; font-weight: 800">사용 가능</span>한 아이디 입니다.
					<input type="button" value="사용" onclick="useId()">
				</c:if>
			</form>
		</div>
	</body>
</html>