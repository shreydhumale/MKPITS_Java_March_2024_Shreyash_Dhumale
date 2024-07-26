<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" %>

<!--loading bean-->
<jsp:useBean id="s" class="stud.student" scope="request">

    <!--    setting property to bean-->
    <jsp:setProperty name="s" property="name" param="nm"/>
    <jsp:setProperty name="s" property="marks" param="mk"/>

    <!--    getting property of bean-->
    <jsp:getProperty name="s" property="name"/>
    <jsp:getProperty name="s" property="marks"/>
    
    <% 
        String r=s.getResults();
        out.println(r);
    %>

</jsp:useBean>

