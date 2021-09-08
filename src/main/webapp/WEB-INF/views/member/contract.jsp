<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
		<link rel="stylesheet" href="css/contract.css"/>
		<script type="text/javascript" src="js/contract.js"></script>
	</head>
	<body>
<%@ include file="../common/header.jsp" %>
		<article>
			<div class="clear">
			</div>
			<form id="join" action="join_form" method="post">
				<h2>회원 가입 약관</h2>
				<textarea rows="15" cols="100"><%--여기에 회원 약관 파일 include --%>회원가입 약관 설명</textarea>
				<br><br>
				<div id="contract_agree">
					<input type="checkbox" name="agree" class="agree">
					위 약관을 모두 읽었으며, 약관에 모두 동의합니다. 
				</div>
				<div id="proceed">
					<input type="button" value="다음" onclick="proceedToJoin()">
					<input type="button" value="취소" onclick="history.go(-1)">
				</div>			
			</form>
		</article>
<%@ include file="../common/footer.jsp" %>
	</body>
</html>