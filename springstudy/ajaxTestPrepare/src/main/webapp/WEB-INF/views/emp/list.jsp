<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${contextPath}/resources/js/jquery-3.6.1.min.js"></script>
<script>
	$(document).ready(function(){
	
		// 자동 완성
		$('#param').keyup(function(){
			$('#auto_complete').empty();
			if($(this).val() == ''){
				return;
			}
			$.ajax({
				/* 요청 */
				type: 'get',
				url: '${contextPath}/emp/autoComplete',
				data: 'target=' + $('#target').val() + '&param=' + $(this).val(),
				/* 응답 */
				dataType: 'json',
				success: function(resData){
					if(resData.status == 200){
						$.each(resData.list, function(i, emp){
							$('#auto_complete')
							.append($('<option>').val(emp[resData.target]));
						});
					}
				}
			});
		});
		
	});
	
</script>
</head>
<body>
	
	<h1>사원등록</h1>
	<label for="emp_no">사원번호</label>
	<input type="text" id="employeeId">
	<label for="emp_name">사원명</label>
	<input type="text" id="employeeName">
	<label for="dept_name">부서명</label>
	<input type="text" id="departmentName">
	<span>
		<input type="button" value="등록">
	</span>
	
	<hr>
	
	<h1>사원조회</h1>
	<label for="search_emp">사원번호입력</label>
	<input type="text" id="search_emp">
	<span>
		<input type="submit" value="조회">
		<input type="button" value="전체사원조회" id="btn_all">
	</span>

	<hr>
	<table>
			<thead>
				<tr>
					<td>사원번호</td>
					<td>사원명</td>
					<td>부서명</td>
					<td>연봉</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${employees}" var="emp" varStatus="vs">
					<tr>
						<td>${emp.employeeId}</td>
						<td>${emp.firstName} ${emp.lastName}</td>
						<td>${emp.deptDTO.departmentName}</td>
						<td>${emp.salary}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>