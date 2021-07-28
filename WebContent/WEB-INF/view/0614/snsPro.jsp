<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1> 업로드 사진 확인 !</h1>

<c:forEach var="img" items="${imgList}">
  <img src="/spring/save/${img}" /> <br />
</c:forEach>

