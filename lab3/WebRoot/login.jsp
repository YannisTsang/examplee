<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>login</title>
  </head>
  
  <body>
    <s:property value="tip" />
    <s:form action="login" namespace="/lab3">
    <s:textfield name="username" label="�û���"/>
    <s:password name="password" label="����"/>
     <s:submit value="��¼"/>
    </s:form>
  </body>
</html>


