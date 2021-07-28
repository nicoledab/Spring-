<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1> loginForm</h1>
<h2>uri==> ${uri}</h2>

<form method="post" action="/spring/member2/loginPro.do">
  id : <input type="text" name="id" />          <br /> 
  pw : <input type="password"  name="pw" /> <br /> 
        <input type="submit"  value="로그인" />   <br /> 
</form>