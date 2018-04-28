/*
 * Translated default messages for the jQuery validation plugin.
 * Language: CN
 * Author: Fayland Lam <fayland at gmail dot com>
 */
jQuery.extend(jQuery.validator.messages, {
        required: "必填字段",
		remote: "请修正该字段",
		email: "请输入正确格式的电子邮件",
		url: "请输入合法的网址",
		date: "请输入合法的日期",
		dateISO: "请输入合法的日期 (ISO).",
		number: "请输入合法的数字",
		digits: "只能输入整数",
		creditcard: "请输入合法的信用卡号",
		equalTo: "请再次输入相同的值",
		accept: "请输入拥有合法后缀名的字符串",
		maxlength: jQuery.format("请输入一个长度最多是 {0} 的字符串"),
		minlength: jQuery.format("请输入一个长度最少是 {0} 的字符串"),
		rangelength: jQuery.format("请输入一个长度介于 {0} 和 {1} 之间的字符串"),
		range: jQuery.format("请输入一个介于 {0} 和 {1} 之间的值"),
		max: jQuery.format("请输入小于等于 {0} 的值"),
		min: jQuery.format("请输入大于等于 {0} 的值")
});

jQuery.validator.addMethod("mobile", function(value, element) {
		return /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})+$/.test(value);
}, "请输入有效的手机号码");

jQuery.validator.addMethod("stringCheck", function(value, element) {
	var begin=value.charAt(0);
	if((begin>='a' && begin<='z')||(begin>='A' && begin<='Z')){
		return this.optional(element) || /^[a-zA-Z0-9_]+$/.test(value);
	}else {
		return false;
	}

}, "只能包括英文字母、数字和下划线,且开头为字母");

jQuery.validator.addMethod("YYYY-MM", function(value, element) {
		return  /^([1-9][0-9]{3})-(0[1-9]|1[0-2])+$/.test(value);
}, "请输入YYYY-MM格式的时间类型");


jQuery.validator.addMethod("statTime3", function(value, element) {
	if(value.length==4){
		return /^([1-9][0-9]{3})+$/.test(value);
	}else{
		return false;
	}
}, "请输入YYYY格式的时间类型");

jQuery.validator.addMethod("statTime2", function(value, element) {
	if(value.length==9){
		return /^(([0-9]{4})-([0-9]{4}))+$/.test(value)&&(value.substring(5)-value.substring(0,4))==1;
	}else{
		return false;
	}
}, "请输入YYYY-YYYY格式的时间类型");

jQuery.validator.addMethod("statTime1", function(value, element) {
	if(value.length==10){
		return /^((([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29))+$/.test(value);
	}else{
		return false;
	}
}, "请输入YYYY-MM-DD格式的时间类型");

jQuery.validator.addMethod("idCard", function(value, element) {
		return /^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$|^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/;
}, "请输入正确格式的身份证号");

