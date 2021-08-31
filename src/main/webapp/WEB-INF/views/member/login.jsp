<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
	</head>
	<body>
		<h2>Login</h2>
		<form action="login" method="post">
			<fieldset>
				<legend></legend>
				<label>User ID</label>
				<input name="id" type="text"><br>
				<label>Password</label>
				<input name="pwd" type="password"><br>
			</fieldset>
			<div id="buttons">
				<input type="submit" value="로그인">
				<input type="button" value="회원가입" onclick="location.href='contract'">
			</div>
		</form>
	</body>
</html>