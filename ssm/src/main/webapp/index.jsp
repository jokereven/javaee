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
    <script type="text/javascript"
            src="${app_path}/js/script.js">
    </script>
    <link
            href="${app_path}/static/css/bootstrap.min.css"
            rel="stylesheet">
    <script
            src="${app_path}/static/js/bootstrap.min.js">
    </script>
    <style>
    </style>
</head>
<body>

<div class="modal fade" id="projectInfoUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalUpdateLabel">项目申报</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <%--项目名--%>
                    <div class="form-group">
                        <label for="ProjectName_update_static" class="col-sm-2 control-label">ProjectName</label>
                        <div class="col-sm-10">
                            <p class="form-control-static" id="ProjectName_update_static"></p>
                        </div>
                    </div>

                    <%--起始时间--%>
                    <div class="form-group">
                        <label for="ProjectName_start_update_time" class="col-sm-2 control-label">ProjectName</label>
                        <div class="col-sm-10">
                            <input type="date" name="piStartdate" class="form-control"
                                   id="ProjectName_start_update_time" placeholder="起始时间">
                        </div>
                    </div>

                    <%--结束时间--%>
                    <div class="form-group">
                        <label for="ProjectName_end_update_time" class="col-sm-2 control-label">ProjectName</label>
                        <div class="col-sm-10">
                            <input type="date" name="piEnddate" class="form-control"
                                   id="ProjectName_end_update_time" placeholder="结束时间">
                        </div>
                    </div>
                    <%--  申报状态--%>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">Status</label>
                        <div class="col-sm-10">
                            <select class="form-control" name="piStatus">
                                <option value="0">已申报</option>
                                <option value="1">审核中</option>
                                <option value="2">已审核</option>
                            </select>
                        </div>
                    </div>


                    <%--申报人--%>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">Applicant</label>
                        <div class="col-sm-10">
                            <select class="form-control" name="acid">
                            </select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="project_info_update_btn">更新</button>
            </div>
        </div>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="projectInfoAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">项目申报</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                        <%--项目名--%>
                        <div class="form-group">
                            <label for="ProjectName_add_input" class="col-sm-2 control-label">ProjectName</label>
                            <div class="col-sm-10">
                                <input type="text" name="piProjectname" class="form-control"
                                       id="ProjectName_add_input" placeholder="项目名">
                                <span id="helpBlock2" class="help-block">

                                </span>
                            </div>
                        </div>

                        <%--起始时间--%>
                        <div class="form-group">
                            <label for="ProjectName_start_time" class="col-sm-2 control-label">ProjectName</label>
                            <div class="col-sm-10">
                                <input type="date" name="piStartdate" class="form-control"
                                       id="ProjectName_start_time" placeholder="起始时间">
                            </div>
                        </div>

                        <%--结束时间--%>
                        <div class="form-group">
                            <label for="ProjectName_end_time" class="col-sm-2 control-label">ProjectName</label>
                            <div class="col-sm-10">
                                <input type="date" name="piEnddate" class="form-control"
                                       id="ProjectName_end_time" placeholder="结束时间">
                            </div>
                        </div>
                    <%--  申报状态--%>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">Status</label>
                        <div class="col-sm-10">
                            <select class="form-control" name="piStatus">
                                <option value="0">已申报</option>
                                <option value="1">审核中</option>
                                <option value="2">已审核</option>
                            </select>
                        </div>
                    </div>


                            <%--申报人--%>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Applicant</label>
                                <div class="col-sm-10">
                                    <select class="form-control" name="acid">
                                    </select>
                                </div>
                            </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="project_info_save_btn">保存</button>
            </div>
        </div>
    </div>
</div>

    <table class="table table-hover">
        <thead>
        <button type="button" id="more_del" class="btn btn-danger pull-right">删除</button>
        <button type="button" class="btn btn-success pull-right" id="project_info_add_btn">新增</button>
        <tr>
            <th><input type="checkbox" id="check_all"/></th>
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
    <div class="row">
        <div class="col-md=4 col-md-offset-2" id="page_info_area"></div>
        <div class="col-md-6 col-md-offset-4" id="page_nav_area"></div>
    </div>
<script>
    (function get_all_page() {
        to_page(1)
    })()

    function to_page(pn) {
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
        xhr.open("get", "${app_path}/projectInfos?pn="+pn);
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
                    // 页尾
                    render_footer_dom(data);
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
        $("tbody").empty()
        for(var i = 0;i<d.length;i++){
            var tbody = document.getElementsByTagName("tbody")[0];
            var father = document.createElement("tr");
            tbody.appendChild(father);

            var thch = document.createElement("th")
            var checkbox = document.createElement("input")
            // set input type === checkbox
            checkbox.setAttribute("type","checkbox");
            checkbox.className = "check_item";
            checkbox.setAttribute("del_id",d[i].piId)
            father.appendChild(thch).appendChild(checkbox);

            var tdpageNum = document.createElement("td");
            var pageNumtxt = document.createTextNode(d[i].piId);
            father.appendChild(tdpageNum).appendChild(pageNumtxt);

            var tdpiProjectname = document.createElement("td");
            var pageSizetxt = document.createTextNode(d[i].piProjectname);
            father.appendChild(tdpiProjectname).appendChild(pageSizetxt);

            var tdpiStartdate = document.createElement("td");
            var piStartdatetxt = document.createTextNode(dateFarmat("yyyy-mm-dd",new Date(d[i].piStartdate)));
            father.appendChild(tdpiStartdate).appendChild(piStartdatetxt);

            var tdpiEnddate = document.createElement("td");
            var piEnddatetxt = document.createTextNode(dateFarmat("yyyy-mm-dd",new Date(d[i].piEnddate)));
            father.appendChild(tdpiEnddate).appendChild(piEnddatetxt);

            var tdpiStatus = document.createElement("td");
            // 0,1,2
            if(d[i].piStatus === 0){
                piStatustxt = document.createTextNode("已申报");
            }else if(d[i].piStatus === 1){
                piStatustxt = document.createTextNode("审核中");
            }else {
                piStatustxt = document.createTextNode("已审核");
            }
            father.appendChild(tdpiStatus).appendChild(piStatustxt);

            // 申报人
            var tdacName = document.createElement("td");
            var acNametxt = document.createTextNode(d[i].applicant.acName);
            father.appendChild(tdacName).appendChild(acNametxt)
            var tdacSex = document.createElement("td");
            d[i].applicant.acSex?acSextxt = document.createTextNode("女"):acSextxt = document.createTextNode("男");
            father.appendChild(tdacSex).appendChild(acSextxt)

            // workinglife
            var tdworkinglife = document.createElement("td");
            var workinglifetxt = document.createTextNode(d[i].applicant.workinglife);
            father.appendChild(tdworkinglife).appendChild(workinglifetxt)

            // 操作 编辑 and 删除
            var btnf = document.createElement("td");
            var editbutton = document.createElement("button");
            editbutton.className = "btn btn-primary glyphicon glyphicon-pencil edit-btn";
            editbutton.setAttribute("edit_id",d[i].piId)
            var edittxt = document.createTextNode("编辑")
            var delbutton = document.createElement("button");
            delbutton.className = "btn btn-danger glyphicon glyphicon-trash del-btn";
            delbutton.setAttribute("del_id",d[i].piId)
            var deltxt = document.createTextNode("删除")
            delbutton.value="删除";
            father.appendChild(btnf);
            btnf.appendChild(editbutton).appendChild(edittxt);
            btnf.appendChild(delbutton).appendChild(deltxt);
        }
    }
    function render_footer_dom(data){
        $("#page_info_area").empty();
        $("#page_nav_area").empty();
        var d = data.extend.pageInfo;
        var PanelFooter = document.getElementById("page_info_area");
        var PanelFootertxt = document.createTextNode("当前第"+d.pageNum+"页, 共"+d.pages+"页, "+"总共"+d.total+"数据");
        PanelFooter.appendChild(PanelFootertxt);

        // 全局参数
        totalCount = d.pages;
        currentPage = d.pageNum;

        var pagination = $("<ul></ul>").addClass("pagination");

        // first page
        var firstpage = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));

        // pre page
        var prepage = $("<li></li>").append($("<a></a>").append("&laquo;").attr("href","#"));

        // 无法操作
        if (data.extend.pageInfo.hasPreviousPage === false){
            firstpage.addClass("disabled")
            prepage.addClass("disabled")
        }else {
            firstpage.click(() =>{
                to_page(1)
            });
            prepage.click(() =>{
               to_page(data.extend.pageInfo.pageNum-1);
            });
        }

        // next page
        var nextpage = $("<li></li>").append($("<a></a>").append("&raquo;").attr("href","#"));

        // last page
        var lastpage = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));

        // 无法操作
        if (data.extend.pageInfo.hasPreviousPage === false){
            nextpage.addClass("disabled")
            lastpage.addClass("disabled")
        }else {
            nextpage.click(() =>{
                to_page(data.extend.pageInfo.pageNum+1)
            });
            lastpage.click(() =>{
                to_page(data.extend.pageInfo.pages);
            });
        }

        pagination.append(firstpage).append(prepage);

        $.each(data.extend.pageInfo.navigatepageNums,(index, item)=>{
                var numli = $("<li></li>").append($("<a></a>").append(item).attr("href","#"));
                numli.click(() =>{
                    to_page(item);
                })
            pagination.append(numli);
        })
        pagination.append(nextpage).append(lastpage);
        var navele = $("<nav></nav>").append(pagination)
        navele.attr("aria-label","Page navigation")
        navele.appendTo("#page_nav_area")
    }

    var project_info_add_btn = document.getElementById("project_info_add_btn");
    project_info_add_btn.onclick = function (){

        // 清除表单数据
        clear_add_form("#projectInfoAddModal form");

        // 发送ajax请求, 查询申报人有那些, 并展示在下拉框
        getApplicants("#projectInfoAddModal select[name=acid]")

        $('#projectInfoAddModal').modal({
            backdrop:'static'
        })
    }

    function getApplicants(ele){
        $(ele).empty();
        $.ajax({
            url:"${app_path}/applicants",
            type:"GET",
            success:function (res){
                console.log(res)
                $.each(res.extend.applicants,function (){
                    var optionele = $("<option></option>").append(this.acName).attr("value",this.acId);
                    optionele.appendTo(ele);
                })
            }
        })
    }

    function clear_add_form(ele){
        $(ele)[0].reset();
        //清空样式
        $(ele).find("*").removeClass("has-success has-error")
        //清空提示信息
        $(ele).find(".help-block").text("");
    }

    var project_info_save_btn = document.getElementById("project_info_save_btn")
    project_info_save_btn.onclick = function (){
        // 数据校验
        if (!validate_add_form()){
            return false;
        }

        if ($(this).attr("ajax_validate_projectName") === "error"){
            return false;
        }

        // 保存
        $.ajax({
            url: "${app_path}/projectInfo",
            type: "POST",
            data: $("#projectInfoAddModal form").serialize(), // 数据序列化
            success: function (res){
                if (res.code === 200){
                    // 关闭状态框
                    $("#projectInfoAddModal").modal('hide');
                    // link to last page
                    to_page(totalCount)
                }else {
                    $("#projectInfoAddModal").modal('hide');
                    alert("save failed error");
                }
            }
        })
    }

        $("#ProjectName_add_input").change(function (){
            if (!validate_add_form()) {
                return false;
            }
            // 获取输入的名字
            var pnameval = this.value;

            $.ajax({
                url:"${app_path}/checkprojectname",
                data: "projectName="+pnameval,
                type:"GET",
                success: function (res){
                    if (res.code === 200){
                        // s
                        show_validate_msg("#ProjectName_add_input","success","可用 √");
                        $("#project_info_save_btn").attr("ajax_validate_projectName","success")
                    }else{
                        // e
                        show_validate_msg("#ProjectName_add_input","error",res.extend.validate_msg);
                        $("#project_info_save_btn").attr("ajax_validate_projectName","error")
                    }
                }
            })
        })

    // 数据校验
    function validate_add_form(){
        // 校验项目名

        // 获取项目名
        var pnameval = $("#ProjectName_add_input").val();
        /*匹配以数字或者字母开头并且位数在2-5位或者2-5位的中文*/
        var regName =  /^[a-zA-Z][a-zA-Z0-9_]{4,15}$/;
            if(!regName.test(pnameval)){
                show_validate_msg("#ProjectName_add_input","error","字母开头，允许5-16字节，允许字母数字下划线 front")
                return false;
            }else{
                show_validate_msg("#ProjectName_add_input","success","输入格式正确 front")
            }
            return true;
    }
    // 项目是否正确存在
    function show_validate_msg(ele,status,msg){
        $(ele).parent().removeClass("has-error has-success")
        if (status === "success"){
            $(ele).parent().addClass("has-success")
        }else  if (status === "error"){
            $(ele).parent().addClass("has-error")
        }
        // 添加文本
        $(ele).next().text(msg)
    }

    // all check
    $("#check_all").click(function (){
        $(".check_item").prop("checked",$(this).prop("checked"));
    })

    $(document).on("click",".check_item",function (){
        var flag = $(".check_item:checked").length == $(".check_item").length
        $("#check_all").prop("checked",flag)
    })

        $(document).on("click",".del-btn",function (){
            // 单个删除
            var DelBtn = document.getElementsByClassName("del-btn")
            for (var i =0; i < DelBtn.length;i++){
                (function (n){
                    DelBtn[n].onclick = function (){
                        // 获取checkbox的状态
                        CheckObj = DelBtn[n].parentNode.parentNode.children[0].children;
                        var chesta = CheckObj[0].checked;
                        // 获取父级的第几个元素
                        DelObjVal = DelBtn[n].parentNode.parentNode.children[2].innerText
                        ObjID = DelBtn[n].getAttribute("del_id");
                        ok = confirm("删除 "+DelObjVal+" 项目")
                        if (chesta === false){
                            alert("place check the checkbox")
                        }else{
                            if (ok){
                                $.ajax({
                                    url:"${app_path}/projectInfo/"+ObjID,
                                    type:"DELETE",
                                    success: function (res){
                                        if (res.code == 200){
                                            to_page(currentPage)
                                            // 发送ajax请求成功
                                        }else{
                                            // 发送ajax请求失败
                                        }
                                    }
                                })
                            }else{
                                console.log("取消删除 "+DelObjVal+" 项目")
                            }
                        }
                    }
                })(i)
            }
        })
        // 多选删除
        var DelMoreBtn = document.getElementById("more_del")
        DelMoreBtn.onclick = function (){
            // 获取第一个checkbox的状态
            var check_status = document.getElementById("check_all").checked;
            var ok = confirm("确认删除选择的全部")
            if (ok){
                if (check_status){
                    // 获取当前页面所以id
                    var Tbody = document.getElementsByTagName("tbody")[0]
                    for (var i =0 ;i < Tbody.children.length ;i++){
                        // 获取到该tr.children[0].children checkbox 状态
                        var ids
                        if (Tbody.children[i].children[0].children[0].checked){
                           ids += "-" + Tbody.children[i].children[0].children[0].getAttribute("del_id");
                        }
                    }
                    $.ajax({
                        url:"${app_path}/projectInfo/"+ids.slice(10),
                        type:"DELETE",
                        success: function (res){
                            if (res.code == 200){
                                to_page(currentPage)
                                // 发送ajax请求成功
                            }else{
                                // 发送ajax请求失败
                            }
                        }
                    })
                    // 执行删除多个
                }else{
                    alert("place checkd the more")
                }
            }else{
                console.log("取消删除")
            }
        }

    $(document).on("click",".edit-btn",function (){
        $('#projectInfoUpdateModal').modal({
            backdrop:'static'
        })
    })
</script>
</body>
</html>