<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1> sns form !</h1>

<form action="/spring/sns/snsPro.do"  method="post" enctype="multipart/form-data">

작성자  : <input type="text"  name="writer" /> <br />
내용   :  <textarea rows="5"  cols="20" name="content"></textarea> <br/>
사진 1 : <input type="file"  name="save"/><br />
사진 2 : <input type="file"  name="save"/><br />
사진 3 : <input type="file"  name="save"/><br />

여러장 올리기 : <input type="file" multiple="multiple"  name="save"/><br />
   <input type="submit"  value="등록" />
</form>