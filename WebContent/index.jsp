<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
<style type="text/css">
	div{
	margin: 10px;
	}
	input{
		width: 200px;
	}
</style>
</head>
<body>
	<form action="${pageContext.request.contextPath }/login.action" method="post">
		<div>
			<div>
				username:<input type="text" name="username" placeholder="Please enter your username">
			</div>
			<div>
				password:<input type="password" name="password" placeholder="Please enter your password">
			</div>
			<div>
				<input type="submit" value="login in">
			</div>
		</div>
	</form>
	
	<hr>
	<h1>百度翻译API java接口练习</h1>
	<form action="${pageContext.request.contextPath }/trans.action" method="post">
		<div>
			<div>
				from:<select name=from style="width: 100px">
					<option value="auto">自动检测</option>
					<option value="zh">中文</option>
					<option value="en">英文</option>
					<option value="jp">日文</option>
				</select>
			</div>
			<div>
				from:<select name=to style="width: 100px">
					<option value="zh">中文</option>
					<option value="en">英文</option>
					<option value="jp">日文</option>
				</select>
			</div>
			<h1>翻译内容：</h1>
			<div>
				<textarea placeholder="请输入要翻译的内容" name="trans_form"></textarea>
			</div>
			<h1>翻译结果：</h1>
			<div id="trans_to" style="border: 1px solid black">
				<div style="color: red">
					原文：${trans_origin}
				</div>
				<div style="color: red">
					译文：${trans_result }
				</div>
			</div>
			<div>
				<input type="submit" value="翻译">
			</div>
		</div>
	</form>
</body>
</html>