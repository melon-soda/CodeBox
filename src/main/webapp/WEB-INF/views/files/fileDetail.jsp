<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
		<link rel="stylesheet" href="css/fileDetail.css"/>
	</head>
	<body>
		<div id="wrap">
<%@ include file="../common/header.jsp" %>
			<div class="clear">
			</div>
			<div id="side_menu" align="center">
			
			</div>
			<div id="main">
				<div id="source" align="center">
					<table id="source_table" border="1" style="width:700px;">
						<tr>
							<th colspan="5">FILE</th>
						</tr>
						<tr>
							<td>${file.filetype}</td>
							<td>${file.title}</td>
							<td>${file.author}</td>
							<td>${file.modDate}</td>
							<td>${file.likeCount}</td>
						</tr>
						<tr>
							<td colspan="5">${file.content}</td>
						</tr>
					</table>
				</div>
			</div>
			<div id="file_info" align="center">
			
			</div>
<%@ include file="../common/footer.jsp" %>
		</div>
	</body>
</html>