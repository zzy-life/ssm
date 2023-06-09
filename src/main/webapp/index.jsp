<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Title</title>
    
</head>
<body>
<!-- 在页面中遍历users数据 -->
<c:forEach items="${users}" var="user">
  <tr>
    <td>${user.userId}</td>
    <td>${user.userName}</td>
    <td>${user.userPwd}</td>
  </tr>
</c:forEach>


        
</body>
</html>
