<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>사원등록</title>

    <!-- Bootstrap core CSS -->
    <link href="/resources/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/resources/signin.css" rel="stylesheet">
  </head>
	
<script>
	
</script>

  <body class="text-center">
    <form class="form-signin" method="post" action="/emp/login">
      <img class="mb-4" src="/resources/bootstrap-solid.svg" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">사원 정보 입력</h1>
      <select id="deptno" name="deptno" class="form-control">    	
      	<c:forEach items="${deptList}" var="dept">
      		<option value="${dept.DEPTNO}">${dept.DNAME}</option>
      	</c:forEach>
      </select>
      <input type="text" id="ename" class="form-control" placeholder="사원이름" required autofocus name="ename">
      <input type="text" id="job" class="form-control" placeholder="직급" required autofocus name="job">
      <input type="text" id="mgr" class="form-control" placeholder="상사" required autofocus name="mgr">
      <input type="date" id="hiredate" class="form-control" placeholder="입사일" required autofocus name="hiredate">
      <input type="text" id="sal" class="form-control" placeholder="급여" required autofocus name="sal">
      <input type="text" id="comm" class="form-control" placeholder="수수료" required autofocus name="comm">
      <input type="text" id="id" class="form-control" placeholder="아이디" required autofocus name="id">
      <input type="password" id="pwd" class="form-control" placeholder="비밀번호" required autofocus name="pwd"><br>
      <button class="btn btn-lg btn-primary btn-block" type="button" id="signinBtn">사원등록</button>
      <p class="mt-5 mb-3 text-muted">&copy; 2019</p>
    </form>
  </body>
</html>
