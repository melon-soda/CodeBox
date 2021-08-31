<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
	</head>
	<body>
		<div id="wrap">
<%@ include file="../common/header.jsp" %>
			<div class="clear">
			</div>
			<form id="code_form" method="post">
				<fieldset>
					<label>Title</label>
					<input type="text" name="title" id="title"><br>
					<label>Content</label>
					<textarea name="content" id="content" placeholder="Write your code here..."></textarea><br>
				</fieldset>
				<div id="buttons">
					<input type="button" value="코드 등록" onclick="writeCode()">
					<input type="button" value="취소" onclick="history.go(-1)">
				</div>
			</form>
<%@ include file="../common/footer.jsp" %>
		</div>
	</body>
</html>