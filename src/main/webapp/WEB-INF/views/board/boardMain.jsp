<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
		<link rel="stylesheet" href="css/boardMain.css"/>
		<script type="text/javascript" src="js/board.js"></script>
	</head>
	<body>
		<form id="board_form" name="form" method="post">
			<div id="wrap">
<%@ include file="../common/header.jsp" %>
				<div class="clear">
				</div>
				<div id="side_menu">
					<ul>
						<c:forEach items="${boardList}" var="board">
							<li><a href="boardDetail?boardseq=${board.boardseq}">${board.title}</a></li>
						</c:forEach>
					</ul>
				</div>
				<div id="main">
					<div id="board_1" align="center">
						<a href="boardDetail?boardseq=${board1.boardseq}">${board1.title}</a>
						<table id="article_table_1" border="1" style="width:90%;">
							<tr>
								<th>번호</th>
								<th>좋아요 수</th>
								<th>제목</th>
								<th>작성자</th>
								<th>작성 일자</th>
								<th>조회수</th>
							</tr>
							<c:forEach items="${articleList1}" var="article">
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
					<div id="board_2" align="center">
						<a href="boardDetail?boardseq=${board2.boardseq}">${board2.title}</a>
						<table id="article_table_2" border="1" style="width:90%;">
							<tr>
								<th>번호</th>
								<th>좋아요 수</th>
								<th>제목</th>
								<th>작성자</th>
								<th>작성 일자</th>
								<th>조회수</th>
							</tr>
							<c:forEach items="${articleList2}" var="article">
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
					<div id="board_3">
					
					</div>
					<div id="board_4">
					
					</div>
					<div id="search_area" align="center">
						<select name="searchCondition">
							<c:forEach items="${searchConditionMap}" var="option">
								<option value="${option.value}">${option.key}
							</c:forEach>
						</select>
						<input type="text" name="searchKeyword"/>
						<input type="button" value="검색" onClick="articleSearch()"/>
					</div>
				</div>
<%@ include file="../common/footer.jsp" %>
			</div>
		</form>
	</body>
</html>