<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%
	request.setCharacterEncoding("UTF-8");
%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인</title>
	<c:choose>
		<c:when test="${result == 'loginFailed' }">				<!-- 로그인 실패시 리다이렉트되면서 로그인 실패 메시지 표시 -->
			<script type="text/javascript">
				window.onload=function() {
					alert('아이디나 비밀번호가 틀립니다. 다시 로그인 하세요!');
				}
			</script>
		</c:when>
	</c:choose>
</head>
<body>
	<form action="${contextPath}/member/login.do" method="post" name="frmLogin">
		<table>
			<tbody>
				<tr class="dot_line">
					<td class="dot_line">아이디</td>
					<td><input name="id" type="text" size="20" /></td>
				</tr>
				<tr class="dot_line">
					<td class="dot_line">비밀번호</td>
					<td><input name="pwd" type="password" size="20" /></td>
				</tr>				
			</tbody>
		</table>
		<br/><br/>
		<input type="submit" value="로그인" />
		<input type="reset" value="초기화" />
	</form>
</body>
</html>







































