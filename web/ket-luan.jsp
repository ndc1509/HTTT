<%-- 
    Document   : ket-luan
    Created on : Dec 20, 2021, 2:37:03 PM
    Author     : Cuong
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kết luận</title>
    </head>
    <body>
        <c:if test="${data != null}">
            <div>${data}</div>
        </c:if>
    </body>
</html>
