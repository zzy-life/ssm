<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html
            PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
        <html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core"
            xmlns:h="http://java.sun.com/jsf/html">

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
            <title>Insert title here</title>
        </head>

        <body>

            <form action="add" method="post">
                姓名:<input type="text" name="user_name">
                <br/>
                 密码:<input type="text" name="user_pwd">
                 <br/>
                
                <input type="submit" value="添加">
            </form>
       

        </body>
 

        </html>