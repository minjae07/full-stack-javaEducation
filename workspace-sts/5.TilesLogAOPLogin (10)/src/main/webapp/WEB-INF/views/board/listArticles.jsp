<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<c:set var="articlesList" value="${articleMap.articlesList }" />
<c:set var="totArticles" value="${articleMap.totArticles }" />
<c:set var="section" value="${articleMap.section }" />
<c:set var="pageNum" value="${articleMap.pageNum }" />

<%
	request.setCharacterEncoding("utf-8");
%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시글 목록</title>
	<style type="text/css">
		.class1 {text-decoration: none;}
		.class2 {text-align: center; font-size: 30px;}
		.no-line {text-decoration: none;}
		.sel-page {text-decoration: none; color: red;}
	</style>
	
	<script type="text/javascript">
		function fn_articleForm(isLogOn, articleForm, loginForm) {
			if (isLogOn != '' && isLogOn != 'false') {
				/* 새 게시글 페이지 */
				location.href=articleForm;
			}
			else {
				alert("로그인 후 글쓰기가 가능합니다.");
				location.href=loginForm+'?action=/board/articleForm.do';
			}
		}
	
	</script>
</head>
<body>
	<table align="center" border="1" width="80%">
		<tr height="10" align="center" bgcolor="lightgreen">
			<th>글번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>작성일</th>
		</tr>
		
		<c:choose>
			<c:when test="${empty articlesList }">
				<tr height="10">
					<td colspan="4">
						<p align="center">
							<b><span style="font-size: 9pt;">등록된 글이 없습니다.</span></b>
						</p>
					</td>
				</tr>
			</c:when>
			
			<c:when test="${!empty articlesList  }">
				<c:forEach var="article" items="${articlesList }" varStatus="articleNum">			<!--varStatus :반복상태변수이름 --속성들 index, count, first, last  -->
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
	
	<div class="class2">
		<c:if test="${totArticles != null }">
			<c:choose>
				<c:when test="${totArticles > 100 }">			<!-- 글 개수가 100 초과인 경우 -->
					<c:forEach var="page" begin="1" end="10" step="1">
						
						<c:if test="${section > 1 && page == 1 }">
							<a class="no-line"  href="${contextPath}/board/listArticles.do?section=${section-1}&pageNum=${(section-1)*10 +1}">&nbsp; pre </a>
						</c:if>
						
						<a class="no-line" href="">${(section-1)*10 +page}</a>			<!-- 실제페이지 숫자표시 -->
						
						<c:if test="${page == 10 }">
							<a class="no-line" href="${contextPath}/board/listArticles.do?section=${section+1}&pageNum=${section*10 +1}">&nbsp; next </a>
						</c:if>						
						
					</c:forEach>
				</c:when>
				
				<c:when test="${totArticles == 100 }">			<!-- 등록된 글 개수가 100개인 경우 -->
					<c:forEach var="page" begin="1" end="10" step="1">
						<a class="no-line" href="#">${page}</a>
					</c:forEach>
				</c:when>
				
				<c:when test="${totArticles < 100 }">			<!-- 글 개수가 100 미만인 경우 -->
					<c:forEach var="page" begin="1" end="${totArticles/10 +1}" step="1">
						<c:choose >
							<c:when test="${page == pageNum}">
								<a class="sel-page" href="${contextPath}/board/listArticles.do?section=${section}&pageNum=${page}">${page}</a>
							</c:when>
							<c:otherwise>
								<a class="no-line" href="${contextPath}/board/listArticles.do?section=${section}&pageNum=${page}">${page}</a>
							</c:otherwise>
						</c:choose>
					</c:forEach>				
				</c:when>
				
			</c:choose>
		</c:if>
	</div>
	<%-- <a class="class1" href="${contextPath}/board/articleForm.do"><p class="class2">글쓰기</p></a> --%>	
	<a class="class1" href="javascript:fn_articleForm('${isLogOn}', '${contextPath}/board/articleForm.do', '${contextPath}/member/loginForm.do')" ><p class="class2">글쓰기</p></a>
	
	
	
</body>
</html>































