<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
		<link rel="stylesheet" href="css/projectMain.css"/>
		<script type="text/javascript" src="js/code.js"></script>
	</head>
	<body>
		<div id="wrap">
<%@ include file="../common/header.jsp" %>
			<div class="clear">
			</div>
			<div id="main">
				<div id="project_code_menu" align="center">
					<div id="project_code_menu_buttons" style="width:700px;" align="right">
						<input type="button" value="New Source Code" onclick="writeCodeForm()">
					</div>
				</div>
				<div id="file_list" align="center">
					<table id="code_table" border="1" style="width:700px;">
						<tr>
							<th>언어</th>
							<th>코드 이름</th>
							<th>작성자</th>
							<th>작성 날짜</th>
							<th>수정 날짜</th>
							<th>좋아요 수</th>
						</tr>
						<c:forEach items="${codeList}" var="code">
							<tr>
							<td>${code.langtype}</td>
							<td><a href="codeDetail?codeseq=${code.codeseq}">${code.title}</a></td>
							<td>${code.author}</td>
							<td>${code.writeDate}</td>
							<td>${code.modDate}</td>
							<td>${code.likeCount}</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
<%@ include file="../common/footer.jsp" %>
		</div>
	</body>
</html>