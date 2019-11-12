<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name=alipayment action=alipay.trade.page.pay.jsp method=post
		target="_blank">

		<dt>商户订单号 ：</dt>
		<dd>
			<input id="WIDout_trade_no" name="WIDout_trade_no" />
		</dd>
		<hr class="one_line">
		<dt>订单名称 ：</dt>
		<dd>
			<input id="WIDsubject" name="WIDsubject" />
		</dd>
		<hr class="one_line">
		<dt>付款金额 ：</dt>
		<dd>
			<input id="WIDtotal_amount" name="WIDtotal_amount" />
		</dd>
		<hr class="one_line">
		<dt>商品描述：</dt>
		<dd>
			<input id="WIDbody" name="WIDbody" />
		</dd>
		<button class="new-btn-login" type="submit"
			style="text-align: center;">付 款</button>

	</form>
</body>
</html>