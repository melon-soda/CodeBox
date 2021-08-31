<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
	<header>
		<div id="logo">
			<a href="index">
				<img src="images/logo.png" alt="logo"/>
			</a>
		</div>
		<div id="links">
			<nav id="member">
				<ul>
					<c:choose>
						<c:when test="${empty sessionScope.loginUser}">
							<li>
								<a href="login_form">Login</a>
							</li>
							<li>
								<a href="contract">Join</a>
							</li>
						</c:when>
						<c:otherwise>
							<li>
								${sessionScope.loginUser.id}
							</li>
							<li>
								<a href="logout">Log out</a>
							</li>
						</c:otherwise>
					</c:choose>
				</ul>
			</nav>
			<nav id="main_menu">
				<ul>
					<li>
						<a href="project">Project</a>
					</li>
					<li>
						<a href="board">Board</a>
					</li>
					<li>
						<a href="mypage">MyPage</a>
					</li>
					<li>
						<a href="test">Test</a>
					</li>
				</ul>
			</nav>
		</div>
	</header>