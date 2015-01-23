<%@ page language='java' contentType="text/html" %>
<%@ page import = "tier2.Hello" %>

<jsp:useBean id="tier" class="tier2.Hello"  />
<jsp:getProperty name="tier" property="h" />