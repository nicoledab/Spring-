<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--jquery 사이트 --%>
<script src="//code.jquery.com/jquery-3.6.0.min.js"> </script>

<script type="text/javascript">
	 $(document).ready(function(){   
		 window.setInterval("callAjax()" ,1000); // "함수명", 지정된 시간마다 해당 함수를 호출한다. 1000 = 1초 
	 });
	 
	 function callAjax(){
		 $.ajax({
			 url:"/spring/ajax/time.do",
			 data : {name:'java', age:'20'},
			 success:function(data){
				 $("#result").html(data);
			 }
		 });
	 }
</script>


<h1> 0614 main 페이지 ..! </h1>

<h1 id="result" class="a"></h1>
