<%--
  Created by IntelliJ IDEA.
  User: v_yunylei
  Date: 2020/10/13
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
success<br/>
page:${pageScope.msg} <br/>
request:${requestScope.msg} <br/>
session:${sessionScope.msg} <br/>
application:${applicationScope.msg} <br/>
<hr/>
request:${requestScope.username}<br/>
session:${sessionScope.username}<br/>
</body>
</html>
