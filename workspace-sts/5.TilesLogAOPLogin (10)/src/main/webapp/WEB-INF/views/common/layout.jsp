<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>		<!-- 자바의 import처럼 타일즈 사용하기 위해 반드시 추가해야 함. -->
<c:set var="contextPath" value="${pageContext.request.contextPath}" />    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><tiles:insertAttribute name="title" /></title>
	<style type="text/css">
		#container {
			width: 100%;
			margin: 0px auto;
			text-align: center;
			border: 0px solid #bcbcbc;
		}
		#header {
			padding: 5px;
			margin-bottom: 5px;
			border: 0px solid #bcbcbc;
			background-color: lightgreen;
		}
		#sidebar-left {
			width: 15%;
			height: 700px;
			padding: 5px;
			margin-right: 5px;
			margin-bottom: 5px;
			float: left;
			background-color: yellow;
			border: 0px solid #bcbcbc;
			font-size: 10px;
		}
		
		#footer {
			clear: both;
			padding: 5px;
			border: 0px solid #bcbcbc;
			border-color: #E2E2E2;
		}
	</style>
	<link href="${contextPath}/resources/css/main.css" rel="stylesheet" media="screen" />
	<script type="text/javascript" src="${contextPath}/resources/jquery/jquery-3.6.0.min.js"></script>
</head>
<body>
	<div id="container">
		<div id="header">
			<tiles:insertAttribute name="header" />		<!-- tiles_member.xml의 <definition> 하위 태그의 <put-attribute> 태그의 name이 header인 JSP를 표시함. -->
		</div>
		
		<div id="sidebar-left">
			<tiles:insertAttribute name="side" />		<!-- tiles_member.xml의 <definition> 하위 태그의 <put-attribute> 태그의 name이 side인 JSP를 표시함. -->
		</div>
		
		<div id="content">
			<tiles:insertAttribute name="body" />		<!-- tiles_member.xml의 <definition> 하위 태그의 <put-attribute> 태그의 name이 body인 JSP를 표시함. -->
		</div>
		
		<div id="footer">
			<tiles:insertAttribute name="footer" />		<!-- tiles_member.xml의 <definition> 하위 태그의 <put-attribute> 태그의 name이 footer인 JSP를 표시함. -->
		</div>
	</div>
</body>
</html>






























