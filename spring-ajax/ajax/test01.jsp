<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script>
		$(document).ready(function(){
			/* #7.
			$("#add-form").submit(function(event){
				event.preventDefault(); // 원래 적용된 이벤트 취소.
				
				// serialize는 form의 <input> 요소들의 name이 배열형태로 그 값이 인코딩되어 
				// URL query string으로 하는 메서드
				let queryString = $(this).serialize();
				console.log(queryString);
				$.ajax({
					url: "/spring/ajax/insert.do",
					type: "POST",
					dataType: "json",
					data: queryString,
					success: function(result){
							//ajax 성공시 로직 수행 
							console.log(result);
						}
				});
				
			});*/
			
			// #9.
			$("#add-form").submit( function(event){
		         event.preventDefault();
		         // JSON으로 요청
		         var data = {};
		         $.each( $(this).serializeArray(), function(index, o){
		                  data[o.name] = o.value
		         })
		         $.ajax({
		                  url: "/spring/ajax/insert2.do",
		                  type: "POST",
		                  dataType: "json",          // ajax 통신으로 받는 타입
		                  contentType: "application/json",  // ajax 통신으로 보내는 타입
		                  data: JSON.stringify(data),
		                  success: function(result){
		                           // ajax 통신 성공 시 로직 수행
		                           console.log(result);
		                  	}
		         		})
				});
			
		});
	
	</script>
</head>
<body>
	<h2> test01 </h2>
	<form action="#" id="add-form" method="post">
		이름 : <input type="text" name="name" id="input-name" />
		비번 : <input type="password" name="pw" id="input-password" />
		내용 : <textarea id="tx-content" name="content" ></textarea>
		<input id="input-submit" type="submit" value="보내기" />
	</form>
	
	
	
	
	
	
</body>
</html>