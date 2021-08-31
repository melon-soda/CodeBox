<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
<%@ include file="../common/head.jsp" %>
	</head>
	<body>
		<div id="wrap">
<%@ include file="../common/header.jsp" %>
			<div class="clear">
			</div>
			<div id="main">
				<div id="code_details" align="center">
					<table id="code_detail" border="1" style="width:700px;">
						<tr>
							<td colspan="2">[${code.langtype}] ${code.title}.${extension}</td>
						</tr>
						<tr>
							<td>Written By ${code.author}</td>
							<td>Write Date : ${code.writeDate} | Last update : ${code.modDate}</td>
						</tr>
						<tr>
							<td colspan="2">${code.content}</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
<%@ include file="../common/footer.jsp" %>
	</body>
</html>