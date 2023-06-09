<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Title</title>
    
</head>
<body>
<table>
<!-- 在页面中遍历users数据 -->
<c:forEach items="${users}" var="user">
  <tr>
    <td>${user.user_id}</td>
    <td>${user.user_name}</td>
    <td>${user.user_pwd}</td>
    <td>${user.userClass.class_name}</td>
  </tr>
</c:forEach>
</table>

        
</body>
</html>
