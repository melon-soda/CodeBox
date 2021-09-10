<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
		<script type="text/javascript" src="js/board.js"></script>
	</head>
	<body>
		<form id="board_form" name="form" method="post">
			<div id="wrap">
<%@ include file="../common/header.jsp" %>
				<div class="clear">
				</div>
				<div id="main">
					<div id="board_menu" align="center">
						<div id="board_menu_buttons" style="width:700px;" align="right">
							<input type="button" value="New article" onclick="articleWriteForm()">
						</div>
					</div>
					<div id="article_list" align="center">
						<input type="hidden" name="boardseq" value="${board.boardseq}">
						${board.title}
						<table id="article_table" border="1" style="width:90%;">
							<tr>
								<th>번호</th>
								<th>좋아요 수 </th>
								<th>제목</th>
								<th>작성자</th>
								<th>작성 일자</th>
								<th>조회수</th>
							</tr>
							<c:forEach items="${articleList}" var="article">
								<tr>
									<td>${article.articleseq}</td>
									<td>${article.likeCount}</td>
									<td><a href="articleDetail?articleseq=${article.articleseq}">${article.title}</a></td>
									<td>${article.author}</td>
									<td>${article.writeDate}</td>
									<td>${article.viewCount}</td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>
			</div>
		</form>
	</body>
</html>