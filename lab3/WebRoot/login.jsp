<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>login</title>
  </head>
  
  <body>
    <s:property value="tip" />
    <s:form action="login" namespace="/lab3">
    <s:textfield name="username" label="ÓÃ»§Ãû"/>
    <s:password name="password" label="ÃÜÂë"/>
     <s:submit value="µÇÂ¼"/>
    </s:form>
  </body>
</html>


