<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${path}/jquery-easyui-1.3.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${path}/jquery-easyui-1.3.3/themes/icon.css">
<link href="${path}/css/main.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${path}/all/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${path}/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${path}/js/consumer.js"></script>
<title>用户信息</title>
</head>
<body style="margin: 5px">
	<table id="dg" title="用户信息" class="easyui-datagrid" fitColumns="false" pagination="true" rownumbers="true" fit="true" url="consumer_showConsumer" toolbar="#tb">
		<!-- fitColumns 自适应 pagination 分页 rownumbers 行号 fit 向外撑  url 请求地址 发送请求有page 页码 rows 每页显示条数 toolbar工具-->
		<thead>
			<tr>
				<th align="center" width="50px" field="cb" checkbox="true"></th>
				<th align="center" width="50px" field="id" >编号</th>
				<th align="center" width="100px" field="name">用户名</th>
				<th align="center" width="100px" field="sex">性别</th>
				<th align="center" width="100px" field="birthday">生日</th>
				<th align="center" width="200px" field="email" >Email</th>
				<th align="center" width="100px" field="photourl" data-options="formatter:function(v){return '<img src='+v+' style=width:30px;height:30px; alt=无头像>'}">头像</th>
				<th align="center" width="100px" field="download" data-options="formatter:function(v){return '<a href=javascript:download();>点击下载</a>'}">下载头像</th>
			</tr>
		</thead>
	</table>
	<div id="tb">
		<div>
			<a href="javascript:addConsumer()" class="easyui-linkbutton" iconCls="icon-add" plain="true">添加</a>
			<a href="javascript:deleteConsumer()" class="easyui-linkbutton" iconCls="icon-remove" plain="true">删除</a>
			<a href="javascript:updateConsumer()" class="easyui-linkbutton" iconCls="icon-edit" plain="true">修改</a>
		</div>
		<div>&nbsp;用户名:&nbsp;<input type="text" name="c_name" id="c_name"/>
		<!-- &nbsp;性别：&nbsp;<input class="easyui-combobox" id="c_sex" name="c_sex" size="10" data-options="panelHeight:'auto',editable:false,valueField:'xbid',textField:'sex',url:'../listSex'"/>valueField:值为什么字段,textField:内容为什么字段 -->
		&nbsp;性别：&nbsp;<select class="easyui-combobox" id="c_sex" name="s_sex" editable="false" panelHeight="auto">
		    <option value="">请选择...</option>
			<option value="男">男</option>
			<option value="女">女</option>
		</select>
		<!-- &nbsp;年龄：&nbsp;<input id="c_age" name="c_age" size="10"/> -->
		<a href="javascript:searchName()" class="easyui-linkbutton" iconCls="icon-search" plain="true">搜索</a></div>
	</div>
	<!-- 对话框 -->
	<!-- easyui-validatebox 表单验证 -->
	<div id="dlg" class="easyui-dialog" style="width:500px; height:400px;padding:10px 20px;top:50px;left:300px" closed="true" buttons="#dlg-buttons" collapsible="true" minimizable="true">
		<form id="fm" action="add" method="post">
			<table>
				<tr>
				<td>用户名:</td>
				<td><input type="text" name="name" id="name" class="easyui-validatebox" required="true"/></td>
				</tr>
				<tr>
				<td>性别:</td>
				<td><select class="easyui-combobox" name="sex" id="sex" required="true" editable="false" panelHeight="auto">
					<option>请选择...</option>
					<option selected="selected">男</option>
					<option>女</option>
				</select>
				</td>
				</tr>
				<tr>
				<td>生日:</td>
				<td><input class="easyui-datebox" name="birthday" id="birthday" required="true" editable="false"/></td>
				</tr>
				<!-- <tr>
				<td>年龄:</td>
				<td><input type="text" name="age" id="age" class="easyui-numberbox" required="true" readonly="readonly" onfocus="setAge()"/></td>
				</tr> -->
				<tr>
				<td>Email:</td>
				<td><input type="text" name="email" validtype="email" id="email" class="easyui-validatebox" required="true"/></td>
				</tr>
			</table>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="javascript:save()" class="easyui-linkbutton" iconCls="icon-ok">保存</a>
		<a href="javascript:close()" class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
	</div>
</body>
</html>
