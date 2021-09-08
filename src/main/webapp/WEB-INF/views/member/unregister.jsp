<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
		<link rel="stylesheet" href="css/mypage.css"/>
		<link rel="stylesheet" href="css/unregisterPwdCheck.css"/>
		<script type="text/javascript" src="js/unregister.js"></script>
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
				<form id="unregister" method="post">
					<h2>회원 탈퇴 주의 사항</h2>
					<p><span style="color: red; font-weight: 800;">탈퇴 후 모든 개인 정보는 삭제되며, 복구 되지 않습니다.</span></p>
					<br><br>
					<div id="unregistration_agree">
						<input type="checkbox" name="agree" class="agree">
						위 내용을 숙지하였으며, 회원 정보 삭제 및 탈퇴에 동의합니다.
					</div>
					<div id="buttons">
						<input type="button" value="확인" onclick="unregisterCheck()">
						<input type="button" value="취소" onclick="history.go(-2)">
					</div>
				</form>
			</div>
<%@ include file="../common/footer.jsp" %>
		</div>
	</body>
</html>