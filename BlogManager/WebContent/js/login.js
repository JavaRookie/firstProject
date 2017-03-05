window.onload = function() {
		var check = document.getElementById("check");
		var name = document.getElementsByName("userName")[0];
		if (name.value != null && name.value != "") {
			check.checked = true;
		} else {
			check.checked = false;
		}
	}
/*function changeYzm() {
		document.getElementById("yzm").src = "yzm?notime="
				+ new Date().getMilliseconds();
	}
	function xz() {
		$("#yzm").val("1");
	}*/
/*$(function(){
	if($(".username[name='userName']").val()!=null&&$(".username[name='userName']").val()!=""){
		alert("1");
		$("#check").attr("checked","false");
	}else{
		alert("2");
		alert($("#check").attr("checked"))
		$("#check").attr("checked","false");
		alert($("#check").attr("checked"))
	}
})*/

function xz(){
	$("#text").val("");
}
function changeYzm() {
		document.getElementById("yzm").src = "yzm?notime="
				+ new Date().getMilliseconds();
	}
	
	