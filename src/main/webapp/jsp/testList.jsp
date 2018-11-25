<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
    <style type="text/css">
        #testBox{
            margin-left: 23%;
            margin-top: 80px;
            text-align: center;
            font-family: "思源黑体 Bold";
            font-size: 20px;
            border: black 3px solid;
            width: 1000px;
        }
        #testBox tr td{
            border: black 3px solid;
        }
    </style>
</head>
<body>
<div id="testBox">
    <table>
        <tr>
            <td>编号</td>
            <td>试题</td>
            <td>是否单选</td>
        </tr>
        <tr>
            <td>${oneTest.test_id}</td>
            <td>
                <c:if test="${oneTest==null}">
                    <c:out value="无此题"></c:out>
                </c:if>
                <c:if test="${oneTest!=null}">
                    <img src="/images/${oneTest.test_id}.jpg" width="900" height="600"/>
                </c:if>
            </td>
            <td>
                <c:if test="${oneTest.tb_type==false}">
                    <c:out value="是"></c:out>
                </c:if>
                <c:if test="${oneTest.tb_type!=false}">
                    <c:out value="否"></c:out>
                </c:if>
            </td>
        </tr>

        <tr>
            <td>答题</td>
            <td>
                <form action="/test/getOneTestById?" method="get">
                    <input type="text" name="test_id" value="${oneTest.test_id+1}" hidden="hidden"/>
                    <input type="text" name="preAnswer" value="${oneTest.answer}" hidden="hidden">
                    <c:if test="${oneTest.tb_type==false}">
                        <select name="answer">
                            <option value="A">A</option>
                            <option value="B">B</option>
                            <option value="C">C</option>
                            <option value="D">D</option>
                        </select>
                    </c:if>
                    <c:if test="${oneTest.tb_type!=false}">
                            <label><input name="answer" type="checkbox" value="A" />A</label>
                            <label><input name="answer" type="checkbox" value="B" />B</label>
                            <label><input name="answer" type="checkbox" value="C" />C</label>
                            <label><input name="answer" type="checkbox" value="D" />D</label>
                    </c:if>
                    <input type="submit" value="下一题">
                </form>
            </td>
        </tr>
    </table>
</div>

</body>
</html>