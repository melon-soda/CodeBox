<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
		<link rel="stylesheet" href="css/mypage.css"/>
		<link rel="stylesheet" href="css/unregisterPwdCheck.css"/>
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
					<li>회원 탈퇴</li>
				</ul>
			</div>
			<div id="main">
				<form id="unregister" action="unregister_check" method="post">
					<fieldset>
						<label>Password</label>
						<input type="password" id="pwd" name="pwd">
					</fieldset>
					<div id="buttons">
						<input type="submit" value="확인">
						<input type="button" value="취소" onclick="history.go(-1)">
					</div>
				</form>
			</div>
<%@ include file="../common/footer.jsp" %>
		</div>
	</body>
</html>