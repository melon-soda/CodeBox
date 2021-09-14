<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
		<script type="text/javascript" src="js/article.js"></script>
	</head>
	<body>
		<div id="wrap">
<%@ include file="../common/header.jsp" %>
			<div class="clear">
			</div>
			<form id="article_form" method="post">
				<fieldset>
					<label>제목</label>
					<input type="text" name="title" id="title"><br>
					<label>게시판</label>
					<select name="boardseq">
						<c:forEach items="${boardList}" var="board">
							<c:choose>
								<c:when test='${board.boardseq==article.boardseq}'>
									<option value="${board.boardseq}" selected>${board.title}</option>
								</c:when>
								<c:otherwise>
									<option value="${board.boardseq}">${board.title}</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</select>
					<br>
					<label>내용</label>
					<textarea name="content" id="content" rows="8" cols="70"></textarea>
				</fieldset>
				<div id="buttons">
					<input type="button" value="글 작성" onclick="articleWrite()">
					<input type="button" value="취소" onclick="history.go(-1)">
				</div>
			</form>
<%@ include file="../common/footer.jsp" %>
		</div>
	</body>
</html>