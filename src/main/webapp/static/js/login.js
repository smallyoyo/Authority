/**
 * Created by HW520 on 2017/9/6.
 */
$(function(){

})
function sign(){
    $.ajax({
        url:"singin",
        type:"post",
        data:{
          "username":$("username").val(),
          "password":$("password").val()
        },success:function(data) {
            alert(data.msg);
        }
    })
}