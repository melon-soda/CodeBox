<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
		<link rel="stylesheet" href="css/projectMain.css"/>
		<script type="text/javascript" src="js/project.js"></script>
	</head>
	<body>
		<form id="project_form" name="form" method="post">
			<div id="wrap">
	<%@ include file="../common/header.jsp" %>
				<div class="clear">
				</div>
				<div id="main">
					<div id="project_menu" align="center">
						<div id="project_menu_buttons" style="width:700px;" align="right">
							<input type="button" value="New Project" onclick="projectCreateForm()">
						</div>
					</div>
					<div id="project_list" align="center">
						<table id="project_table" border="1" style="width:700px;">
							<tr>
								<th bgcolor="orange">제목</th>
								<th bgcolor="orange">생성 일자</th>
								<th bgcolor="orange">최근 업데이트 일자</th>
								<th bgcolor="orange">좋아요 수</th>
							</tr>
							<c:forEach items="${projectList}" var="project">
								<tr>
									<td><a href="projectDetail?title=${project.title}">${project.title}</a></td>
									<td>${project.createDate}</td>
									<td>${project.updateDate}</td>
									<td>${project.likeCount}</td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>
	<%@ include file="../common/footer.jsp" %>
			</div>
		</form>
	</body>
</html>