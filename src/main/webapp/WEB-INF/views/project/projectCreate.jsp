<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
		<script type="text/javascript" src="js/project.js"></script>
	</head>
	<body>
		<div id="wrap">
<%@ include file="../common/header.jsp" %>
			<div class="clear">
			</div>
			<form id="project_form" method="post">
				<fieldset>
					<label>Title</label>
					<input type="text" name="title" id="title"><br>
				</fieldset>
				<div id="buttons">
					<input type="button" value="프로젝트 생성" onclick="projectCreate()">
					<input type="button" value="취소" onclick="location.href='project'">
				</div>
			</form>
<%@ include file="../common/footer.jsp" %>
		</div>
	</body>
</html>