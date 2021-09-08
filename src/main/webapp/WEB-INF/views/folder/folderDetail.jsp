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
				<div id="source" align="center">
					<table id="source_table" border="1" style="width:700px;">
						<tr>
							<th colspan="5">SOURCE</th>
						</tr>
						<c:forEach items="${folderList}" var="folder">
							<tr>
								<td colspan="5"><a href="folderDetail?folderseq=${folder.folderseq}">${folder.title}</a></td>
							</tr>
						</c:forEach>
						<c:forEach items="${fileList}" var="file">
							<tr>
								<td>${file.filetype}</td>
								<td><a href="fileDetail?fileseq=${file.fileseq}">${file.title}</a></td>
								<td>${file.author}</td>
								<td>${file.modDate}</td>
								<td>${file.likeCount}</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
<%@ include file="../common/footer.jsp" %>
		</div>
	</body>
</html>