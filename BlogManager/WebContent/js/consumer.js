	var url;
	function searchName(){
		$('#dg').datagrid('load',{
			name:$('#c_name').val(),
			sex:$('#c_sex').combobox("getValue"),
			/*age:$('#c_age').val(),*/
		})
	}
	function deleteConsumer(){
		//获取选中的 getSelections
		var selectedRows=$('#dg').datagrid('getSelections');
		if(selectedRows.length==0){
			$.messager.alert("系统提示","请选择要删除的数据!");
			return;
		}
		var arrids=[];
		for(var i=0;i<selectedRows.length;i++){
			arrids.push(selectedRows[i].id);
		}
		var ids=arrids.join(",");
		$.messager.confirm("系统提示","是否确认删除这<font color=red>"+selectedRows.length+"</font>条数据?",function(r){
			if(r){
				$.post("consumer_deleteConsumer",{delIds:ids},function(result){
					if(result.success){
						$.messager.alert("系统提示","您已成功删除第<font color=red>"+result.delNums+"</font>的数据!");
						$("#dg").datagrid("reload");
					}else{
						$.messager.alert("系统提示",result.errorMessage);
					}	
				},"json");
			}
		});
	}
	function addConsumer(){
		reset();
		$("#dlg").dialog("open").dialog("setTitle","添加新用户信息");
		url="consumer_addConsumer";
	}
	function close(){
		$("#dlg").dialog("close");
		reset();
	}
	function reset(){
		$("#name").val("");
		$("#sex").val("");
		//$("#age").val("");
		$("#birthday").val("");
		$("#email").val("");
	}
	function save(){
		$("#fm").form("submit",{
			url:url,
			onSubmit:function(){
				return $(this).form("validate");
			},
			success:function(result){
				if(result.errorMessage){
					$.messager.alert("系统提示",result.errorMessage);
					return;
				}else{
					$.messager.alert("系统提示","保存成功");
					close();
					$("#dg").datagrid("reload");
				}
			}
		});
	}
	function updateConsumer(){
		var selectedRows=$('#dg').datagrid('getSelections');
		if(selectedRows.length!=1){
			$.messager.alert("系统提示","请选择要一条修改的数据!");
			return;
		}
		var row=selectedRows[0];
		$("#dlg").dialog("open").dialog("setTitle","修改用户信息");
		$("#fm").form("load",row);
		url="consumer_addConsumer?id="+row.id;
	}
	function download(){
		var selectedRows=$('#dg').datagrid('getSelections');
		var row=selectedRows[0];
		var url=row.photourl.substring(row.photourl.lastIndexOf("/")+1);
		//alert(url);
		window.location.href="down?fileName="+url;
		$('#dg').datagrid('clearSelections');
		
	}
	function formatterdate(val, row) {
        var date = new Date(val);
        return date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate();
}
	/*function setAge(){
		if($("#birthday").datebox('getValue')==null||$("#birthday").datebox('getValue')==""){
			$.messager.alert("系统提式","请先选择出生日期");
		}else{
			var nowYear=new Date().getFullYear();
			var nowMonth = new Date().getMonth() + 1;
			var nowDay = new Date().getDate();
			var reldate=($("#birthday").datebox('getValue').split("-"));
			var relyear=reldate[0];
			var relmonth=reldate[1];
			var relday=reldate[2];
			if(nowYear==relyear){
				$("#age").first().val("0");
				$.messager.alert("系统提式","年龄已通过");
			}else if(nowYear<relyear){
				$("#age").first().val("");
				$.messager.alert("系统提式","出生日期选择错误");
			}else{
				var age=nowYear - relyear;
				if(nowMonth==relmonth){
					var day=nowDay-relday;
					if(day<0){
						age=age-1;
						$("#age").first().val(""+age+"");
					}else{
						$("#age").first().val(""+age+"");
					}
				}else{
					var month=nowMonth-relmonth;
					if(month<0){
						age=age-1;
						$("#age").first().val(""+age+"");
					}else{
						$("#age").first().val(""+age+"");
					}
				}
				$.messager.alert("系统提式","年龄已通过");
			}
			
		}
	}*/
	
	/*$.extend($.fn.validatebox.defaults.rules, {
        必须和某个字段相等
        equalTo: { validator: function (value, param) { return $(param[0]).val() == value; }, message: '密码不一致' }
       });*/
	