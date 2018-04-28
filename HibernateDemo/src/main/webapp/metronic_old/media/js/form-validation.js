var FormValidation = function () {
    return {
        init: function () {
            var form1 = $('#frm');
            var error1 = $('.alert-error', form1);
            var success1 = $('.alert-success', form1);
            form1.validate({
                errorElement: 'span', //default input error message container
                errorClass: 'help-inline', // default input error message class
                focusInvalid: true, // do not focus the last invalid input
                ignore: "",
                debug: false,
                rules: {
                    BXLX:{
                        required: true
                    },
                    XXXZ: {
                        required: true
                    },
                    JBZ: {
                        required: true
                    },
                    XXFZRDZYX: {
                        required: true,
                        email: true
                    },
                    XXWZ: {
                        maxlength: 100,
                        required: true,
                        url: true
                    },
                    systemName:{
                        required: true,
                    }







                },
                errorPlacement: function (error, element) { // render error placement for each input type
                    if (element.attr("name") == "BXLX") { // 办学类型
                        error.addClass("no-left-padding").insertAfter("#form_1_BXLX_error");
                    } else if (element.attr("name") == "XXXZ") { // 学校性质
                        error.addClass("no-left-padding").insertAfter("#form_1_XXXZ_error");
                    } else if (element.attr("name") == "JBZ") { // 举办者
                        error.addClass("no-left-padding").insertAfter("#form_1_JBZ_error");
                    } else if (element.attr("name") == "ZGBM") { // 主管部门
                        error.addClass("no-left-padding").insertAfter("#form_1_ZGBM_error");
                    } else if (element.attr("name") == "ZSPC") { // 招生批次
                        error.addClass("no-left-padding").insertAfter("#form_1_ZSPC_error");
                    } else {
                        error.insertAfter(element); // 其他
                    }
                },
                invalidHandler: function (event, validator) { // 提交校验出错执行
                    success1.hide();
                    error1.show();
                    App.scrollTo(error1, -200);
                },

                highlight: function (element) { // hightlight error inputs
                    $(element)
                        .closest('.help-inline').removeClass('ok'); // display OK icon
                    $(element)
                        .closest('.control-group').removeClass('success').addClass('error'); // set error class to the control group
                },

                unhighlight: function (element) { // revert the change dony by hightlight
                    $(element)
                        .closest('.control-group').removeClass('error'); // set error class to the control group
                },

                success: function (label) {
                    label
                        .addClass('valid').addClass('help-inline ok') // mark the current input as valid and display OK icon
                    .closest('.control-group').removeClass('error').addClass('success'); // set success class to the control group
                },

                submitHandler: function (form) {
                    success1.show();
                    error1.hide();
                    form.submit();
                }
            });
        }
    };
}();