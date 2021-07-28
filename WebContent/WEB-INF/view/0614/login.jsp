<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>
<script src="//code.jquery.com/jquery-3.6.0.min.js"> </script>

<script type="text/javascript"> 
	 $(document).ready(function(){   
		 $("#btn").click(function(){
			// alert("id==="+$("#id").val());
			$.ajax({
				url : "/spring/ajax/check.do",
				data : {id:$("#id").val(), pw:$("#pw").val()},
					    success:function(aa){
					    	if(aa=='ok'){
					    	$("#result").html("<font color='green'>사용가능</font>");
					    	}else{
					    		$("#result").html('불가능');
					    	}
					    }
			});
		 });
	 });
 </script>


<h1> login </h1>

<%-- id는 고유의 이름/ class는 공통의 이름  --%>
<form>
  id : <input type="text" name="id" id="id" class="a" /> 
    <input type="button" value="id중복확인" id="btn"  /><label id="result"> </label><br />
 
  pw : <input type="text" name="pw" id="pw" class="a"  /> <br />
    
</form>





