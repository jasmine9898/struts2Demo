<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
  <title>登录界面</title>
  </head>
  <body>
    <form action="LoginAction.action?abc=000" method="post">
       用户名：<input name="username"><br>
       密 码：<input type="password" name="userpass"><br>
      <input type="submit" value="提 交">
      <input type="reset"  value="取 消">
    </form>  
  </body>
  
  <a href ="LoginAction.action?abc=123456&username=test&userpass=1">测试</a>
  <a href ="testjson.action?abc=987654321&username=test&userpass=1">测试json</a>
    <a href ="testjson2.action?abc=987654321&username=test&userpass=1">测试error</a>
  

</html>