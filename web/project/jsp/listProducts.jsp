<%--
  Created by IntelliJ IDEA.
  User: pleiyang
  Date: 2016/12/8
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1px">
        <tr>
            <td>商品编号</td>
            <td>供应商编号</td>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>商品描述</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${products}" var="products">
            <tr>
                <td>${products.prodId}</td>
                <td>${products.vendId}</td>
                <td>${products.prodName}</td>
                <td>${products.prodPrice}</td>
                <td>${products.prodDesc}</td>
                <td>
                    <a href="javascript:edit('${products.prodId}');">修改</a>
                </td>
            </tr>
        </c:forEach>

    </table>
</body>
<script type="text/javascript">
    function edit(id) {
        window.location.href='/products/edit.do?proId='+id;
    }
</script>
</html>
