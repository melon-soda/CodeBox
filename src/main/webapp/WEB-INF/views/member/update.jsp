<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
		<script type="text/javascript" src="js/join.js"></script>
	</head>
	<body>
		<article>
			<div class="clear">
			</div>
			<h2>회원 정보 입력</h2>
			<form id="join_form" method="post" enctype="multipart/form-data">
				<fieldset>
					<legend>Required</legend>
					
					<label>User ID</label>
					<input type="text" name="id" id="id" value="${member.id}" readonly><br>
					
					<label>Password</label>
					<input type="password" name="pwd" id="pwd" value="${member.pwd}"><br>
					
					<label>Password 재입력</label>
					<input type="password" name="pwdCheck" id="pwdCheck" value="${member.pwd}"><br>
					
					<label>E-mail</label>
					<input type="text" name="email" id="email" value="${member.email}"><br>
				</fieldset>
				<fieldset>
					<legend>Optional</legend>
					
					<label>Address</label>
					<input type="text" name="address" id="address" value="${member.address}">
					
					<label>phone</label>
					<input type="text" name="phone" id="phone" value="${member.phone}"><br>
					
					<label>Profile pic</label>
					<img src="images/profilePic/${member.profilePic}"/>
					<input type="file" name="profile_Pic" id="profile_Pic"><br>
				</fieldset>
				<div class="clear">
				</div>
				<div id="proceed">
					<input type="button" value="저장" onclick="update()">
					<input type="button" value="나가기" onclick="location.href='mypage'">
				</div>
			</form>
		</article>
<%@ include file="../common/footer.jsp" %>
	</body>
</html>