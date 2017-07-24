<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>
    
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

  </head>
  
  <body>
    <center>
    <%
        request.setCharacterEncoding("utf-8"); //解决中文乱码问题
    %>
    <h1>注册</h1><hr>
    <form name="regform" action="doRegist" method="post">
        <table>
            <tr>
                <td>账号：</td>
                <td><input type="text"  name="account" id="account"  maxLength="10"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="passFirst" id="passFirst" maxLength="12"  />
                </td>
            </tr>
            <tr>
                <td>确认密码：</td>
                <td><input type="password" name="passSecond" id="passSecond"  maxLength="12"  />
            </tr>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="username"  maxLength="9"/></td>
            </tr>
            </table>
            <table>
            <tr>
                <td colspan="1"><input type="submit" value="注册" /></td>
                <td colspan="1"><input type="reset" value="重置" /></td>
            </tr>
            </table>
    </form>
    <form name="regForm" action="toLogin">
        <table>
            <tr>
                <td colspan="2"><input type="submit" value="返回登录界面" />
                </td>
            </tr>
        </table>
    </form>
    </center>
  </body>
</html>