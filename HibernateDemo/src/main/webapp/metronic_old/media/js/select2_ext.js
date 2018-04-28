/**
 * Created by Plan_B on 2017/8/14.
 */
;(function ($) {
    
    var select2 = $.fn.select2;
    var methods = {
        addItem: addItem
    };
    
    $.fn.select2 = function (opts) {
        if (typeof opts === 'string') {
            if (methods[opts] != undefined) {
                methods[opts].call(this, arguments[1]);
            } else {
                select2.apply(this, arguments);
            }
            return this;
        }
        $.extend(true, $.fn.select2, select2);
        
        var r = select2.apply(this, arguments);
        
        if (opts.onAdd != undefined && typeof opts.onAdd == 'function') {
            this.each(function () {
                var _this = this;
                var $drop = $(this).prev().children('.select2-drop');
    
                var $ch = $('<div class="select2-add"><a href="javascript:;">+添加分类</a><input type="text" placeholder="请输入分类名称"><button type="button" class="btn blue">确定</button></div>');
                $drop.prepend($ch);
    
    
    
                $drop.on('click', '.select2-add a', function () {
                    $ch.children('a').hide();
                    $ch.children('input,button').show();
                    $ch.children('input').focus();
                    return false;
                });
    
                $drop.on('click', '.select2-add button', function () {
                    opts.onAdd.call(_this, $ch.children('input').val());
                    $ch.children('a').show();
                    $ch.children('input,button').hide();
                    $ch.children('input').val('');
                });
    
    
                $drop.find('.select2-search input.select2-input').unbind('blur');
    
                $(document).on('click', function () {
                    $ch.children('a').show();
                    $ch.children('input,button').hide();
                });
            });
        }
        
    
        //$.fn.select2 = select2;
        return r;
    }
    
    //$.fn.select2 = select2;
    
    function addItem(item) {
        var $drop = this.data('select2').dropdown;
        
        var option = '<option value="' + item.valueField + '">' + item.textField + '</option>';
        
        this.append(option);
        
        var $li = $(''
            +  '<li class="select2-results-dept-0 select2-result select2-result-selectable">'
            +  '<div class="select2-result-label">'
            +  '<span class="select2-match"></span>' + (item.textField ? item.textField:undefined)
            + '</div>'
            +  '</li>');
        
        $li.data('select2Data', {
            css: undefined,
            disabled: false,
            element: option,
            id: item.valueField ? item.valueField:undefined,
            text: item.textField ? item.textField:undefined
        });
        $drop.children('.select2-results').append($li);
    }
    
})(jQuery);