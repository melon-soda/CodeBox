<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
		<link rel="stylesheet" href="css/mypage.css"/>
	</head>
	<body>
		<div id="wrap">
<%@ include file="../common/header.jsp" %>
			<div class="clear">
			</div>
			<div id="side_menu">
				<ul>
					<li>profile</li>
					<li>활동 내역</li>
					<li><a href="update_form">정보 수정</a></li>
					<li><a href="unregister_pwd_check">회원 탈퇴</a></li>
				</ul>
			</div>
			<div id="main">
			
			</div>
<%@ include file="../common/footer.jsp" %>
		</div>
	</body>
</html>