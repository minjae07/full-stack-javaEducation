<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
<%-- <% %> : 스크립트릿(scriptlet)이라고 함. JSP 파일에서 자바코드를 삽입할때 반드시 표기를 해야함. --%>	

<%
	Calendar calendar = Calendar.getInstance();
	int hour = calendar.get(Calendar.HOUR_OF_DAY);
	int minute = calendar.get(Calendar.MINUTE);
	int second = calendar.get(Calendar.SECOND);
%>
</head>
<body>
<%-- <%= %> : 스크립트릿의 일종으로 표현식(expression)이다. 단, 값을 나타내고자 할 때 사용함. ;을 붙이지 아니함을 반드시 주의해야한다. --%>
	<h1>현재 시간 : <%=hour %>시 <%=minute %>분 <%=second %>초 </h1>
</body>
</html>