<%--
  Created by IntelliJ IDEA.
  User: govlmo91
  Date: 2019/11/06
  Time: 8:35 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="includes/header.jsp" %>
<div class="container">
    <form:form modelAttribute="member" method="post" action="/loginProcess">
        아이디 : <form:input path="username"/>
        비밀번호 : <form:input path="password"/>
    </form:form>
</div>


<%@ include file="includes/footer.jsp" %>