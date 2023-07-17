<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BBM은행</title>
</head>
<body>
	<header>
		<jsp:include page="/jsp/include/topMenu.jsp"/>
	</header>
<section class="container">
  <div class="row justify-content-center">
    <div class="col-md-12">
      <h1 class="text-center">문의게시판</h1>
      <table class="table table-striped table-hover">
        <thead>
          <tr>
            <th>글번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성일시</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="post" items="${board}">
            <tr>
              <td>${post.nc_no}</td>
              <td><a href="post?nc_no=${post.nc_no}">${post.nc_title}</a></td>
              <td>${post.nc_id}</td>
              <td>${post.nc_date}</td>
              <td><form action="deletepost" method="post">
               <input type="hidden" name="postNo" value="${post.nc_no}">
              <button type="submit" class="btn btn-outline-primary me-2">삭제</button>
              </form>
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
      <form action="posting" method="post" class="text-center">
      
        <button type="submit" class="btn btn-primary">글쓰기</button>
      </form>
    </div>
  </div>
</section>


<style>
  .container {
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
  }
</style>

	
	<footer>
		<%@ include file="/jsp/include/bottom.jsp" %>
	</footer>
</body>
</html>