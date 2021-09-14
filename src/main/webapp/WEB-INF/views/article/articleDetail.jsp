<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
		<script type="text/javascript" src="js/article.js"></script>
	</head>
	<body>
		<form id="article_form" name="form" method="post">
			<div id="wrap">
<%@ include file="../common/header.jsp" %>
				<div class="clear">
				</div>
				<div id="main">
					<div id="article" align="center">
						<input type="hidden" name="articleseq" value="${article.articleseq}">
						<input type="hidden" name="boardseq" value="${article.boardseq}">
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
					<c:choose>
						<c:when test="${sessionScope.loginUser.id == article.author}">
							<div id="article_menu" align="center">
								<input type="button" name="btn_modify" value="수정" onClick="articleUpdateForm()">
								<input type="button" name="btn_delete" value="삭제" onClick="articleDeleteConfirm()">
							</div>
						</c:when>
						<c:when test="${sessionScope.loginUser.id == 'admin'}">
							<div id="article_menu" align="center">
								<input type="button" name="btn_delete" value="삭제" onClick="articleDeleteConfirm()"> 
							</div>
						</c:when>
					</c:choose>
				</div>
<%@ include file="../common/footer.jsp" %>
			</div>
		</form>
	</body>
</html>