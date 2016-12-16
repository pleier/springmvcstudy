<%--
  Created by IntelliJ IDEA.
  User: pleiyang
  Date: 2016/12/16
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑products</title>
</head>
<body>
    <form action="/products/update.do" id="productdForm" method="post">
        <input name="prodId" value="${product.prodId}" type="hidden">
        <input name="vendId" value="${product.vendId}" >
        <input name="prodName" value="${product.prodName}" >
        <input name="prodPrice" value="${product.prodPrice}" >
        <input name="prodDesc" value="${product.prodDesc}" >
        <input type="submit" value="提交" >
    </form>
</body>
</html>
