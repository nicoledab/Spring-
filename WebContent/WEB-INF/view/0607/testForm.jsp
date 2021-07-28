<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1> testForm </h1>

<form action="/spring/mybatis/testPro.do" method="post">
  id : <input type="text" name="id" /> <br />
  age : <input type="text" name="age" /> <br />
  name : <input type="text" name="name" /> <br />
      <input type="submit" value="전송" />
      
</form>