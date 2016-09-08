<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="ben"  uri="ben-taglib"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%
    String port = request.getServerPort() == 80 ? "" : (":"+request.getServerPort());
    String path = request.getContextPath().replaceAll("/$","");
    String contextPath = request.getScheme()+"://"+request.getServerName()+port+path;
    pageContext.setAttribute("contextPath",contextPath);
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="/WEB-INF/common/resource.jsp"/>

    <script type="text/javascript">
        var flag = false;

        $(document).ready(function(){
            $("#checkAllInput").next().attr("id","checkAll");
            $(".each-box").next().addClass("each-btn");

            $("#reset").click(function () {
                $("#cmdArea").val("");
            });

            $("#execute").click(function () {

                var cmd = $("#cmdArea").val();
                if (!cmd){
                    alert("请填写命令！");
                    return false;
                }

                var ids = "";
                if ($("input[type='checkbox'][name='agent']").is(':checked')){

                    $('input:checkbox[name=agent]:checked').each(function(){
                        ids+=$(this).val()+";";
                    });
                    if ("" != ids){
                        ids = ids.substring(0,ids.length-1);
                        $.ajax({
                            url:"${contextPath}/job/batchexec",
                            data:{
                                "command":cmd,
                                "agentIds":ids
                            }
                        });
                        alertMsg( "该作业已启动,正在执行中.");
                    }

                }else {
                    alert("请选择执行器！");
                }
            });

            $("#checkAll").click(function () {

                if ($("input[type='checkbox'][name='agent']").is(':checked')){

                    $("#checkAllInput").prop("checked",false);
                    $("#checkAll").parent().removeClass("checked");
                    $("#checkAll").parent().attr("aria-checked",false);

                    $(".each-box").prop("checked",false);
                    $(".each-box").parent().removeClass("checked");
                    $(".each-box").parent().attr("aria-checked",false);
                } else {

                    $("#checkAllInput").prop("checked",true);
                    $("#checkAll").parent().removeClass("checked").addClass("checked");
                    $("#checkAll").parent().attr("aria-checked",true);

                    $(".each-box").prop("checked",true);
                    $(".each-box").parent().removeClass("checked").addClass("checked");
                    $(".each-box").parent().attr("aria-checked",true);
                    flag = true;
                }

            });

            $(".each-btn").click(function () {
                if (flag){
                    $("#checkAllInput").prop("checked",false);
                    $("#checkAll").parent().removeClass("checked");
                    $("#checkAll").parent().attr("aria-checked",false);
                    flag = false;
                }
            });
        });

    </script>
</head>

<jsp:include page="/WEB-INF/common/top.jsp"/>

<section id="content" class="container">

    <!-- Messages Drawer -->
    <jsp:include page="/WEB-INF/common/message.jsp"/>

    <!-- Breadcrumb -->
    <ol class="breadcrumb hidden-xs">
        <li class="icon">&#61753;</li>
        当前位置：
        <li><a href="">RedRain</a></li>
        <li><a href="">作业管理</a></li>
        <li><a href="">现场执行</a></li>
    </ol>
    <h4 class="page-title"><i class="fa fa-play-circle" aria-hidden="true"></i>&nbsp;现场执行</h4>
    <!-- Deafult Table -->
    <div class="block-area" id="defaultStyle">
        <div>
            <textarea class="form-control m-b-10" id="cmdArea" style="resize:vertical;min-height: 250px;"></textarea>

        </div>

        <div style="float: right">
            <button class="btn btn-sm btn-alt m-r-5" id="reset">&nbsp;重&nbsp;置&nbsp;</button>
            <button class="btn btn-sm btn-alt m-r-5" id="execute">&nbsp;执&nbsp;行&nbsp;</button>
        </div>

        <h3 class="block-title">选择执行器</h3>

        <table class="table table-bordered tile" style="font-size: 12px;">
            <thead>
            <tr>
                <th><input type="checkbox" id="checkAllInput">全选</th>
                <th>执行器</th>
                <th>机器IP</th>
                <th>端口号</th>
                <th>连接状态</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="w" items="${agents}" varStatus="index">
                <tr>
                    <td>
                        <input type="checkbox" name="agent" value="${w.agentId}" class="each-box">
                    </td>
                    <td id="name_${w.agentId}">${w.name}</td>
                    <td>${w.ip}</td>
                    <td id="port_${w.agentId}">${w.port}</td>
                    <td id="agent_${d.agentId}">
                        <c:if test="${w.status eq false}">
                            <span class="label label-danger">&nbsp;&nbsp;失&nbsp;败&nbsp;&nbsp;</span>
                        </c:if>
                        <c:if test="${w.status eq true}">
                            <span class="label label-success">&nbsp;&nbsp;成&nbsp;功&nbsp;&nbsp;</span>
                        </c:if>
                    </td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>
</section>
<br/><br/>

<jsp:include page="/WEB-INF/common/footer.jsp"/>


