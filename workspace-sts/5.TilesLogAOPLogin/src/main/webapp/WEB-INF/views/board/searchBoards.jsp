<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%
	request.setCharacterEncoding("utf-8");
%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시판 검색 결과</title>
	<style type="text/css">
		.class1 {text-decoration: none;}
		.class2 {text-align: center; font-size: 30px;}
		.no-line {text-decoration: none;}
		.sel-page {text-decoration: none; color: red;}
	</style>
		
</head>
<body>
	<hgroup>
		<h1>게시판 검색 결과</h1>
	</hgroup>
	<table align="center" border="1" width="80%">
		<tr height="10" align="center" bgcolor="lightgreen">
			<th>글번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>작성일</th>
		</tr>
		
		<c:choose>
			<c:when test="${empty boardsList }">
				<tr height="10">
					<td colspan="4">
						<p align="center">
							<b><span style="font-size: 9pt;">등록된 글이 없습니다.</span></b>
						</p>
					</td>
				</tr>
			</c:when>
			
			<c:when test="${!empty boardsList  }">
				<c:forEach var="article" items="${boardsList }" varStatus="articleNum">			<!--varStatus :반복상태변수이름 --속성들 index, count, first, last  -->
					<tr align="center">
						<td width="5%">${article.articleNo }</td>
						<td width="10%">${article.id }</td>
						<td width="35%" align="left">
							<span style="padding-right: 30px;"></span>
							<c:choose>
								<c:when test="${article.level > 1 }">
									<c:forEach begin="1" end="${article.level }" step="1">
										<span style="padding-left: 20px;"></span>
									</c:forEach>
									<span style="font-size: 12px; color: red">[답변]</span><a class="class1" href="${contextPath}/board/viewActicle.do?articleNo=${article.articleNo}">${article.title}</a>
								</c:when>
								<c:otherwise>
									<a class="class1" href="${contextPath}/board/viewActicle.do?articleNo=${article.articleNo}">${article.title}</a>
								</c:otherwise>
							</c:choose>
						</td>
						<td width="10%"><fmt:formatDate value="${article.writeDate }"/></td>
					</tr>
				</c:forEach>
			
			</c:when>
		</c:choose>		
	</table>
</body>
</html>



























