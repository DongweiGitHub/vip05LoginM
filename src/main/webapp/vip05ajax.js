/**
 * 
 */

function AjaxLogin(){
	$.ajax(
			//通过json,也就是javascript对象来进行操作
		{
			//使用ajax向服务器发送请求
			//接口请求四大要素  url  http方法   请求体   请求头  ，完成向服务器的请求之后
			//ajax会自动获取服务器的返回，作为result来进行使用
			//URL信息，用于指定ajax提交请求的地址
			url:"./Login",
			//http方法
			type:"post",
			//请求头，设置预期的返回数据类型
			dataType:"json",
			//请求体，提交的参数，找到from表单将里面的信息序列化成为一个ajax可以提交的数据
			data:$("#formData").serialize(),
			success:function(result){
//				alert("接口请求调用成功")
				$("#msg")[0].innerText="接口返回信息是："+result["msg"];
			},
			error:function(result){
				alert("接口请求调用失败，请检查")
				
			}
		}	
	
	
	)
}