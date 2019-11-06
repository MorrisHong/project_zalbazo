<%--
  Created by IntelliJ IDEA.
  User: govlmo91
  Date: 2019/11/06
  Time: 12:49 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@include file="includes/header.jsp" %>

<div class="row">
    <form action="/joinProcess" method="post">
        아이디 : <input type="text" name="login_id"/>
        폰번호 : <input type="text" name="phone_number"/>
        닉네임 : <input type="text" name="username"/>
        비밀번호 : <input type="password" name="password"/>
        이메일 : <input type="text" name="email"/>
        주소 : <input type="text" name="address"/>

        <input type="submit" value="전송"/>
    </form>
</div>

<script>
    $.ajax({

    })
</script>

<%@ include file="includes/footer.jsp" %>
