<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1>loginPro</h1>

<c:if test="${count == 1 }">
   <c:redirect url="/member2/main.do" /> 
</c:if>

<c:if test="${count != 1 }">
  <script>
    alert("id/pw 확인하세요");
     history.go(-1);
  </script>
</c:if>