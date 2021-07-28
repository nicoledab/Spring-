<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1> 0611 form</h1>

<form action="/spring/dao/testInsert.do" method="post">
  id : <input type="text" name="id" />
  name : <input type="text" name="name" />
  age : <input type="text" name="age" />
        <input type="submit" value="가입" />
</form>