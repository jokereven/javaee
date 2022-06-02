<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()
            +":"+request.getServerPort()+path+"/";
    //将path放到页作用域中,方便使用el表达式调用
    pageContext.setAttribute("app_path",path);
%>

<html>
<head>
    <title>all</title>
    <script type="text/javascript"
            src="${app_path}/js/jquery-3.2.1.js">
    </script>
    <link
            href="${app_path}/static/css/bootstrap.min.css"
            rel="stylesheet">
    <script
            src="${app_path}/static/js/bootstrap.min.js">
    </script>
</head>
<body>
    <table class="table table-hover">
        <thead>
        <button type="button" class="btn btn-success pull-right">新增</button>
        <button type="button" class="btn btn-danger pull-right">删除</button>
        <tr>
            <th><input type="checkbox"/></th>
            <th>项目编号(#)</th>
            <th>项目名称</th>
            <th>开始日期</th>
            <th>结束日期</th>
            <th>申报状态</th>
            <th>申报人</th>
            <th>性别</th>
            <th>工作年限</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
<script>
    (function get_all_page() {
        to_page(1)
    })()

    function to_page(page) {
        var xhr;
        if (window.XMLHttpRequest) {
            xhr = new XMLHttpRequest();
        } else {
            xhr = new ActiveXObject("Microsoft.XMLHTTP");
        }
        // 请求方式一共分为两种
        // get   post
        // get请求把参数包含在URL中
        // get相比较post来说，安全性差一点，包含一些机密信息的话，建议大家去使用post
        // 在做数据查询的时候，没必要进行加密，建议使用get
        // 创建请求，需要调用open这个方法   open(请求方式get/post，请求地址url)
        xhr.open("get", "${app_path}/projectInfos");
        xhr.send();
        // ajax接收服务器返回信息
        // 发送信息由ajax负责发送，接收的时候，需要ajax接收信息，可以接收json格式，本质字符串的数据
        // ajax属性       readyState：表示读取返回的状态
        // 0 1 2 3 4
        // 0：刚刚创建了ajax对象
        // 1：已经调用了open方法，创建http请求
        // 2.已经调用了send方法，发送了请求
        // 3.正在返回数据，但是不完整，已经有了一小部分
        // 4.ajax请求完成，数据返回完整
        // 监听         onreadystatechange
        // 接收的数据是        XML对象.responseText
        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4) {
                // console.log(xhr.reponseText);
                // 判断状态码    status
                if (xhr.status == 200) {
                    // console.log(xhr.responseText);
                    var data = JSON.parse(xhr.responseText);
                    console.log(data);
                    console.log(data.extend.pageInfo.list);
                    d = data.extend.pageInfo.list;
                    // create dom element
                    render_list_dom(d);
                }
            }
        }
    }

    function render_list_dom(d) {
        // <tr>
        //     <th><input type="checkbox"/></th>
        //     <td>1</td>
        //     <td>jokereven</td>
        //     <td>2005-11-01</td>
        //     <td>2025-11-01</td>
        //     <td>2</td>
        //     <td>jack</td>
        //     <td>男</td>
        //     <td>4</td>
        //     <td>
        //         <button type="button" class="btn btn-primary">编辑</button>
        //         <button type="button" class="btn btn-danger">删除</button>
        //     </td>
        // </tr>

        for(var i = 0;i<d.length;i++){
            var tbody = document.getElementsByTagName("tbody")[0];
            var father = document.createElement("tr");
            tbody.appendChild(father);

            var thch = document.createElement("th")
            var checkbox = document.createElement("input")
            // set input type === checkbox
            checkbox.setAttribute("type","checkbox");
            father.appendChild(thch).appendChild(checkbox);

            var tdpageNum = document.createElement("td");
            var pageNumtxt = document.createTextNode(d[i].piId);
            father.appendChild(tdpageNum).appendChild(pageNumtxt);

            var tdpiProjectname = document.createElement("td");
            var pageSizetxt = document.createTextNode(d[i].piProjectname);
            father.appendChild(tdpiProjectname).appendChild(pageSizetxt);

            var tdpiStartdate = document.createElement("td");
            var piStartdatetxt = document.createTextNode(d[i].piStartdate);
            father.appendChild(tdpiStartdate).appendChild(piStartdatetxt);

            var tdpiEnddate = document.createElement("td");
            var piEnddatetxt = document.createTextNode(d[i].piEnddate);
            father.appendChild(tdpiEnddate).appendChild(piEnddatetxt);

            var tdpiStatus = document.createElement("td");
            var piStatustxt = document.createTextNode(d[i].piStatus);
            father.appendChild(tdpiStatus).appendChild(piStatustxt);

            // 申报人
            var tdacName = document.createElement("td");
            var acNametxt = document.createTextNode(d[i].applicant.acName);
            father.appendChild(tdacName).appendChild(acNametxt)

            var tdacSex = document.createElement("td");
            var acSextxt = document.createTextNode(d[i].applicant.acSex);
            father.appendChild(tdacSex).appendChild(acSextxt)

            // workinglife
            var tdworkinglife = document.createElement("td");
            var workinglifetxt = document.createTextNode(d[i].applicant.workinglife);
            father.appendChild(tdworkinglife).appendChild(workinglifetxt)

            // 操作 编辑 and 删除
            var btnf = document.createElement("td");
            var editbutton = document.createElement("button");
            editbutton.className = "btn btn-primary";
            var edittxt = document.createTextNode("编辑")
            var delbutton = document.createElement("button");
            delbutton.className = "btn btn-danger";
            var deltxt = document.createTextNode("删除")
            delbutton.value="删除";
            father.appendChild(btnf);
            btnf.appendChild(editbutton).appendChild(edittxt);
            btnf.appendChild(delbutton).appendChild(deltxt);
        }
    }
</script>
</body>
</html>