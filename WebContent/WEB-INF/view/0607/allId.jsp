<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1> test 테이블 all Id</h1>

<c:forEach var="id" items="${list}">
   <h2> id=${id}</h2>
</c:forEach>

<h2> age=${obj}</h2>

<c:forEach var="dto" items="${list2}">
   <h2>${dto.id} ${dto.name} ${dto.age} ${dto.day}</h2>
</c:forEach>

  <h2>${dto.id} ${dto.name} ${dto.age} ${dto.day}</h2>
