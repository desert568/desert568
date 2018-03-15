<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/12 0012
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



<form action="/upload.action" method="post" enctype="multipart/form-data">
    <input type="file" name="image" />   <br/>

    <input type="submit" value="提交" />
</form>
<img src="images/h.jpg">

</body>
</html>
