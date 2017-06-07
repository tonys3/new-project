<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script
  		src="https://code.jquery.com/jquery-1.12.4.min.js"
  		integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
  		crossorigin="anonymous">
	</script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>  
</head>
<body>
	<div class="container">
		<div class="row header">
			<div class="col-md-12">
				<h1>한빛교육센터</h1>
			</div>
		</div>
		<div class="row content">
		<!-- content시작 -->
			<div class="jumbotron">
  				<h1>환영합니다</h1>
  				<p>한빛교육센터 홈페이지입니다</p>
  				<p><a class="btn btn-primary btn-lg" href="list.do" role="button">리스트</a></p>
			</div>
			<div class="page-header">
				<h1>입력 <small>입력폼을 채워주세요</small></h1>
			</div>
			<form action="insert.do" method="post" class="form-horizontal">
  				<div class="form-group">
    				<label for="sabun" class="col-sm-2 control-label">사번</label>
    				<div class="col-sm-10">
    					<input type="text" name="sabun" class="sabun" id="sabun" placeholder="사번입력">
  					</div>
  				</div>
  				<div class="form-group">
    				<label for="name" class="col-sm-2 control-label">이름</label>
    				<div class="col-sm-10">
    					<input type="text" name="name" class="name" id="name" placeholder="이름입력">
  					</div>
  				</div>
  				<div class="form-group">
    				<label for="pay" class="col-sm-2 control-label">금액</label>
    				<div class="col-sm-10">
    					<input type="text" name="pay" class="pay" id="pay" placeholder="금액입력">
  					</div>
  				</div>
  				<button type="submit" class="btn btn-default">입력</button>
			</form>
		</div>
		<!-- content끝 -->
		<div class="row footer">
			<div class="col-md-12">
				(주)한빛이엔아이 ｜ 사업자등록번호 : 220-85-43667 ｜ 통신판매신고 : 마포 제 0358호
				한빛ENI : 02-707-1480 / (121-854) 서울시 마포구 신수동 63-14 구프라자 3층 / 대표이사 : 염기호
				개인정보보호관리책임자 : 허윤
				Copyright (c) 2017 한빛교육센터 All rights reserved.
			</div>
		</div>
	</div>
</body>
</html>