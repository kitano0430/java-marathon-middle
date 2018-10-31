<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>一覧画面</title>
</head>
<body>
<h2>プロ野球</h2>
<h2>セントラルリーグ一覧</h2>
<c:forEach var="team" items="${teamList}" >
<c:out value = "${team.teamName}"/><br>
</c:forEach>
</body>
</html>