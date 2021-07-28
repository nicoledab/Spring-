<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>





<h1>uploadForm</h1>

<form action="/spring/file/uploadPro.do" method="post"
                                    enctype="multipart/form-data">
   name : <input type="text" name="name" /> <br />
   file : <input type="file" name="save" /> <br />
		<input type="submit" name="업로드" />

</form>