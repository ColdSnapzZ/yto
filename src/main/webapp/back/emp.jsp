<%--
  Created by IntelliJ IDEA.
  User: like
  Date: 2020/11/19
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
    <title>员工列表</title>
    <link rel="stylesheet" href="../layui/css/layui.css"  media="all">
  </head>
  <body>
  <div id="empDiv" style="display:none;width:320px;margin-top:10px">
    <form id=myFrom class="layui-form" lay-filter="formTest">



          <input  name="oid" type="hidden">


      <div class="layui-form-item">
        <label class="layui-form-label">联动选择框</label>
        <div class="layui-input-inline">
          <select name="uid" id="sels">
          </select>
        </div>
      </div>
      <div class="layui-form-item">
        <label class="layui-form-label">订单号</label>
        <div class="layui-input-inline">
          <input type="text" name="onumber" required lay-verify="required" placeholder="请输入员工名" autocomplete="off" class="layui-input">
        </div>
      </div>
      <div class="layui-form-item">
        <label class="layui-form-label">运单号</label>
        <div class="layui-input-inline">
          <input type="text" name="wnumber" required lay-verify="required" placeholder="请输入运单号" autocomplete="off" class="layui-input">
        </div>
      </div>
      <div class="layui-form-item">
        <label class="layui-form-label">物品类型</label>
        <div class="layui-input-inline">
          <input type="text" name="itemtype" required lay-verify="required" placeholder="请输入物品类型" autocomplete="off" class="layui-input">
        </div>
      </div>
      <div class="layui-form-item">
        <label class="layui-form-label">寄件备注</label>
        <div class="layui-input-inline">
          <input type="text" name="remark" required lay-verify="required" placeholder="请输入寄件备注" autocomplete="off" class="layui-input">
        </div>
      </div>
      <div class="layui-form-item">
        <label class="layui-form-label">物品重量</label>
        <div class="layui-input-inline">
          <input type="text" name="weight" required lay-verify="required" placeholder="请输入物品重量" autocomplete="off" class="layui-input">
        </div>
      </div>
      <div class="layui-form-item">
        <label class="layui-form-label">下单时间</label>
        <div class="layui-input-inline">
          <input type="text" name="otime" required lay-verify="required" placeholder="请输入下单时间" autocomplete="off" class="layui-input">
        </div>
      </div>
      <div class="layui-form-item">
        <label class="layui-form-label">订单状态</label>
        <div class="layui-input-inline">
          <input type="text" name="ystatus" required lay-verify="required" placeholder="请输入订单状态" autocomplete="off" class="layui-input">
        </div>
      </div>
      <div class="layui-form-item">
        <label class="layui-form-label">费用</label>
        <div class="layui-input-inline">
          <input type="text" name="money" required lay-verify="required" placeholder="请输入费用" autocomplete="off" class="layui-input">
        </div>
      </div>
      <div class="layui-form-item">
        <div class="layui-input-block">
          <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
          <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
      </div>
    </form>
  </div>



  <table class="layui-hide" id="test" lay-filter="test"></table>

  <script type="text/html" id="toolbarDemo">
    <div class="layui-btn-container">
      <button class="layui-btn layui-btn-sm" lay-event="add">新增</button>
     <%-- <button class="layui-btn layui-btn-sm" lay-event="delete">删除</button>
      <button class="layui-btn layui-btn-sm" lay-event="update">修改</button>--%>
    </div>
    员工名：
    <div class="layui-inline">
      <input class="layui-input" name="empname" id="empName" autocomplete="off" placeholder="请输入用户名">
    </div>
    <button class="layui-btn" data-type="reload" lay-event="search">搜索</button>
  </script>

  <script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
  </script>
  <script src="../layui/layui.js" charset="utf-8"></script>
<%--  <script src="../js/jquery-3.4.1.min.js" type="text/javascript"></script>--%>
  <script>
    layui.use(['table','layer','form'], function() {
      var table = layui.table;
      var layer = layui.layer;
      var form = layui.form;
      var url="";
      var $=layui.jquery;
      table.render({
        elem: '#test'
        , url: '../myorder/selectAll'
        , toolbar: '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
        , defaultToolbar: ['filter', 'exports', 'print', { //自定义头部工具栏右侧图标。如无需自定义，去除该参数即可
          title: '提示'
          , layEvent: 'LAYTABLE_TIPS'
          , icon: 'layui-icon-tips'
        }]
        , title: '用户数据表'
        , cols: [[
          {type: 'checkbox', fixed: 'left'},
          {field: 'oid', title: 'oid', fixed: 'left', unresize: true, sort: true}
          ,  {templet: '<div>{{d.userinfo.username}}</div>', title: '订单号',  edit: 'text'}

          , {field: 'onumber', title: '订单号',  edit: 'text'}
          , {field: 'wnumber', title: '运单号', edit: 'text'}
          , {field: 'itemtype', title: '物品类型',  edit: 'text', sort: true}
          , {field: 'remark', title: '寄件备注' }
          , {field: 'weight', title: '物品重量'}
          , {field: 'otime', title: '下单时间',sort: true}
          , {field: 'ystatus', title: '订单状态'}
          , {field: 'money', title: '费用'}
          , {fixed: 'right', title: '操作', toolbar: '#barDemo'}
        ]]
        , page: true
      });

      //监听提交
      form.on('submit(formDemo)', function(data){
        var json=JSON.stringify(data.field);
        alert($("#myFrom").serialize());
        $.ajax({
          type: "post",
          url: "../myorder/"+url,
          data:$("#myFrom").serialize(),
          dataType:"json",
          success: function(msg){
            table.reload('test');

            layer.closeAll();
            layer.msg("修改成功");


          }
        });
        return false;
      });
      //头工具栏事件
      table.on('toolbar(test)', function(obj){
        var checkStatus = table.checkStatus(obj.config.id);
        switch(obj.event){
          case 'add':
            url="insert";
            //清空表单
            $("#myFrom")[0].reset();
            $("#sels").text("");
            $.get("../userinfo/selectOne",null,function (json) {
              $.each(json,function (index,item) {
                $("#sels").append("<option value='"+item.uid+"'>"+item.username+"</option>");
              },'json');
            });
            layer.open({
              type:1,
              title:'新增用户',
              area: ['400px','600px'],
              content: $('#empDiv')
            });

           break;
          case 'search':
            //得到输入框的值
            var value=$("#empName").val();
            //执行重载
            table.reload('test', {
              url : "../myorder/selectAll?empname="+value
              ,page : {
                curr : 1
                //重新从第 1 页开始
              }
            });
            $("#empName").val(value);//刷新值会被消除，则需要重新设定
            break;
        };
      });
      //监听行工具事件
      table.on('tool(test)', function(obj){
        var data = obj.data;//得到当行数据
        if(obj.event === 'del'){
          layer.confirm('真的删除行么', function(index){
            obj.del();
            layer.close(index);
            $.ajax({
              type: "get",
              url: "../myorder/delete",
              data:"oid="+data.oid,
              success: function(msg){
                layer.alert("删除成功！");
              }
            });
        });
        } else if(obj.event === 'edit'){
           //alert(1);
           url="update";
          //清空表单
          $("#myFrom")[0].reset();
          $("#sels").text("");
           $.get("../userinfo/selectOne",null,function (json) {
               $.each(json,function (index,item) {
                   $("#sels").append("<option value='"+item.uid+"'>"+item.username+"</option>");
               },'json');
           });

          // //给表单赋值
          form.val("formTest", {
            "oid":data.oid

            , "onumber": data.onumber
            ,"wnumber": data.wnumber
            ,"itemtype": data.itemtype
            ,"remark": data.remark
            ,"weight": data.weight
            ,"otime": data.otime
            ,"ystatus": data.ystatus
            ,"money": data.money
            ,"will": data.will
          });
          //修改信息
          layer.open({
            type:1,
            title:'修改用户',
            area: ['400px','600px'],
            content: $('#empDiv')
          });
        }
      });
    });

  </script>
  </body>
</html>
