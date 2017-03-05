function check() {
	$.messager.confirm("系统提示", "您确定要退出么?", function(r) {
		if (r) {
			window.location.href = "user_loginout";
		}
	});

}
function setDateTime() {
	var date = new Date();
	var day = date.getDay();
	var week;
	switch (day) {
	case 0:
		week = "星期日";
		break;
	case 1:
		week = "星期一";
		break;
	case 2:
		week = "星期二";
		break;
	case 3:
		week = "星期三";
		break;
	case 4:
		week = "星期四";
		break;
	case 5:
		week = "星期五";
		break;
	case 6:
		week = "星期六";
		break;
	}
	if (date.getMinutes() < 10) {
		var Minutes = "0" + date.getMinutes();
	} else {
		Minutes = date.getMinutes();
	}
	if (date.getSeconds() < 10) {
		var Seconds = "0" + date.getSeconds();
	} else {
		Seconds = date.getSeconds();
	}
	var today = date.getFullYear() + "年" + (date.getMonth() + 1) + "月"
			+ date.getDate() + "日  " + week + " " + date.getHours() + ":"
			+ Minutes + ":" + Seconds;
	document.getElementById("today").innerHTML = today;
}
function openTab(text, url, iconCls) {
	if ($("#tabs").tabs("exists", text)) {
		$("#tabs").tabs("select", text);
	} else {
		var content = "<iframe frameborder=0 scrolling='auto' style='width:100%;height:100%' src="
				+ url + "></iframe>";
		$("#tabs").tabs("add", {
			title : text,
			iconCls : iconCls,
			closable : true,
			content : content
		});
	}
}
// 修改密码
function openPasswordModifyDialog() {
	$("#dlg").dialog("open").dialog("setTitle", "修改密码");
	url = "user_modifyPassword";
}
function modifyPassword() {
	$("#fm").form("submit", {
		url : url,
		onSubmit : function() {
			var newPassword = $("#newPassword").val();
			var newPassword2 = $("#newPassword2").val();
			if (!$(this).form("validate")) {
				return false;
			}
			if (newPassword != newPassword2) {
				$.messager.alert("系统提示", "两次密码不一致！");
				return false;
			}
			return true;
		},
		success : function(result) {
			var result = eval('(' + result + ')');
			if (result.success) {
				$.messager.alert("系统提示", "密码修改成功，下一次登录生效！");
				resetValue();
				$("#dlg").dialog("close");
			} else {
				$.messager.alert("系统提示", "密码修改失败！");
				return;
			}
		}
	});
}
function closePasswordModifyDialog(){
	resetValue();
	$("#dlg").dialog("close");
}
function resetValue(){
	$("#newPassword").val("");
	$("#newPassword2").val("");
}
window.onload = function() {
	window.setInterval("setDateTime()", 1000);
	
	/*$(function(){
		//加载数据
		var treeData=[{
			text:"菜单选项",
			children:[{
				text:"新房信息管理",
				attributes:{
					url:"show"
				}
			},{
				text:"资讯信息管理",
				attributes:{
					url:"showZx"
				}
			},{
				text:"用户信息管理",
				attributes:{
					url:"showConsumer"
				}
			},{
				text:"修改密码",
				attributes:{
					url:"updatePwd"
				}
			},{
				text:"房屋出租信息",
				attributes:{
					url:"showZufang"
				}
			}]
		}];
		//实例化树菜单
		$("#tree").tree({
			data:treeData,
			lines:true,
			onClick:function(node){
				if(node.attributes){
					openTab(node.text,node.attributes.url);
				}
			}
		});
		//新增tab
		function openTab(text,url){
			if($("#tabs").tabs('exists',text)){//判断如果开启则跳转
				$("#tabs").tabs('select',text);
			}else{
				var content="<iframe frameborder='0' scrolling='auto' style='width:100%;height:100%' src="+url+"></iframe>"
				$("#tabs").tabs('add',{
					title:text,
					closable:true,//可以关闭
					content:content
				})
			}
		}
	});*/
	 
}
