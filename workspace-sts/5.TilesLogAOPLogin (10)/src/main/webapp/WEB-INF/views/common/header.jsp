<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<%
	request.setCharacterEncoding("UTF-8");
%>    

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!-- Ajax(Asynchronous Javascript and Xml) 
	: 웹2.0부터 웹을 구현하는 핵심기능인 Ajax는 웹 사용자에게 좀더 도움을 주는 기술의 묶음. 
	  웹의 새로운 접근법.
	  
	: "비동기적"--서버로부터 데이터가 로드되는 동안에도 계속해서 페이지를 사용할수 있다는 뜻임.
	   서버가 데이터를 전달해 주면 Ajax이벤트가 발생하여 서버로부터 받은 데이터를 읽어 페이지의 일부를 수정하게 됨.        
-->

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>header</title>
	<script type="text/javascript">
		var loopSearch = true;
		
		function keywordSearch() {
			if(loopSearch == false)
				return;
			
			var value = document.frmSearch.searchWord.value;
			
			$.ajax({
				type: 'get',
				async: true,
				url: "${contextPath}/board/keywordSearch.do",
				data: {keyword:value},						/* 매개변수 이름 keyword로 JSON 데이터를 ajax로 전송함  */
				success: function(data, textStatus) {
					var jsonInfo = JSON.parse(data);
					displayResult(jsonInfo);
				},
				error: function(data, textStatus) {
					alert("에러가 발생했습니다." + data);
				},
				complete: function(data, textStatus) {
					
				}
			});
		}
		
		function displayResult(jsonInfo) {
		 	var count = jsonInfo.keyword.length;
		 	if(count>0) {
		 		var html = '';
		 		for(var i in jsonInfo.keyword) {
		 			html += "<a href=\"javascript:select('"+jsonInfo.keyword[i]+"')\">"+jsonInfo.keyword[i]+"</a><br/>";
		 		}
			 	var listView = document.getElementById("autocompleteList");
			 	listView.innerHTML = html;
			 	show('autocomplete');		 		
		 	}
		 	else {
		 		hide('autocomplete');
		 	}	 	
		}
			
		function select(selectedKeyword) {
			document.frmSearch.searchWord.value=selectedKeyword;
			loopSearch = false;
			hide('autocomplete');
		}
		
		function show(elementId) {
			var element = document.getElementById(elementId);
			if(element) {
				element.style.display = 'block';
			}
		}
		
		function hide(elementId) {
			var element = document.getElementById(elementId);
			if(element) {
				element.style.display = 'none';
			}			
		}
	
	</script>
</head>
<body>
	<table border="0" width="100%">
		<tr>
			<td>
				<a href="${contextPath}/main.do">
					<img alt="마스코트" src="${contextPath}/resources/image/music.png">
				</a>
			</td>
			
			<td>
				<h1><font size="30">WebStore에 오신것을 환영합니다.</font></h1>
			</td>
			
			<td>
				<c:choose>
					<c:when test="${isLogOn == true && member != null }">
						<h3>환영합니다. ${member.name }님</h3>
						<a href="${contextPath}/member/logout.do"><h3>로그아웃</h3></a>
					</c:when>
					<c:otherwise>
						<a href="${contextPath}/member/loginForm.do"><h3>로그인</h3></a>
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
		
	</table>
	
	<div id="search">
		<form action="${contextPath}/board/searchBoards.do" name="frmSearch">
			<input name="searchWord" class="" type="text" onkeyup="keywordSearch()" />
			<input name="search" class="" type="submit" value="검 색" />
		</form>
	</div>
	<br/>
	
	<div id="autocomplete">
		<div id="autocompleteList"></div>
	</div>
</body>
</html>

























