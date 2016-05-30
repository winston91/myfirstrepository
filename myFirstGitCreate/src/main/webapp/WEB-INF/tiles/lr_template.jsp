<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
    <head>
    <meta charset="UTF-8">
 
    <style type="text/css">
         .content{margin-left:0%; width:50%;}
         .menu{margin-left:50%; margin-top:-44px; width:50%;}
    </style>
    <title><tiles:insertAttribute name="title" ignore="true" /></title> <!--타이틀이 null인 경우에는 무시한다-->
</head>
<body>
    <div class="page">
        <tiles:insertAttribute name="header" />        
    </div>
    <div class="content">
            <tiles:insertAttribute name="game" />
    </div>
    <div class="menu">
        <tiles:insertAttribute name="gameMenu"/>
    </div>
</body>
</html>