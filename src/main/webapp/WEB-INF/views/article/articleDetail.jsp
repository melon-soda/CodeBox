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
			<div id="main">
				<div id="article" align="center">
					<table id="article_table" border="1" style="width:700px;">
						<tr>
							<th colspan="4">${article.title}</th>
						</tr>
						<tr>
							<td>${article.likeCount}</td>
							<td>${article.author}</td>
							<td>${article.writeDate}</td>
							<td>${article.viewCount}</td>
						</tr>
						<tr>
							<td colspan="4">${article.content}</td>
						</tr>
					</table>
				</div>
			</div>
<%@ include file="../common/footer.jsp" %>
		</div>
	</body>
</html>