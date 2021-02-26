
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<%@ page contentType="text/html;charset=UTF-8" language="java" %>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

		<title>圆通会员</title>
		<script type="text/javascript" src="../front/js/jquery-3.4.1.min.js"></script>
		<link rel="icon" type="image/x-icon" href="../front/img/image/ytologo.ico" />
		<link rel="stylesheet" type="text/css" href="../front/css/payOrder.css" />
		<link rel="stylesheet" href="../front/css/iconfont.css" />
	</head>
	<body>
		<div id="head_top">
			<div class="content">
				<div class="el_a">
					<img src="../front/img/image/logo.png"/>
				</div>
				<div class="el_b">
					<dl>
						<dt>首页</dt>
						<dt>我的订单</dt>
						<dt>客服服务<i class="iconfont">&#xe731;</i>
						<div>
							<ul>
								<li>我的投诉</li>
								<li>我的催件</li>
								<li>我的理赔</li>
								<li>我的查件</li>
							</ul>
						</div>
						</dt>
						<dt>我的财富<i class="iconfont">&#xe731;</i>
							<div style="height: 127px;">
								<ul>
									<li>财富信息</li>
									<li>积分商城</li>
									<li>我的抵用券</li>
								</ul>			
							</div>
						</dt>
						<dt>账号管理<i class="iconfont">&#xe731;</i>
							<div style="height: 290px;">
									<ul>
										<li>基本信息</li>
										<li>我的消息</li>
										<li>地址管理</li>
										<li>实名认证</li>
										<li>密码修改</li>
										<li>账户安全</li>
										<li>隐私政策</li>
									</ul>
							</div>
						</dt>
					</dl>
				</div>
				<div class="el_c">
					<span>hi,15207387591<a href="javascript:;" style="color:black ;"><i class="iconfont">&#xe67f;</i></a></span>
				</div>
			</div>
		</div>
		<div class="myorder-container">
				<div class="nav_scroll">
					<dl>
						<dt>我寄的</dt>
						<dt>我收的</dt>
					</dl>
					<i class="on"></i>
				</div>
				<div class="el_input_group">
					<div class="el_input_group_a">
						<div class="group_top">
							<div class="el_input_groupr">
								<div class="el_select ">
									<input type="text" readonly="readonly" value="运单号"/>
									<i class="iconfont">&#xe731;</i>
									<ul class="el_list">
										<li>运单号</li>
										<li>订单号</li>
										<li>寄件人</li>
										<li>收件人</li>
										<li>寄件人手机</li>
										<li>收件人手机</li>
									</ul>
									<div class="sanjiao ab-one"></div>
								</div>
								<input class="el-input__inner" type="text" placeholder="请输入内容"/>
								<div class="el_form_item">
									<label class="el_lable" >下单时间</label>
									<div class="el-date-editor">
										<i class="iconfont">&#xe616;</i>
										<input class="el_input__inner" type="date" placeholder="选择日期"/>
									</div>
									<div class="item_con">
										-
									</div>
									<div class="el-date-editor">
										<i class="iconfont">&#xe616;</i>
										<input class="el_input__inner" type="date" placeholder="选择日期"/>
									</div>
									<div class="form_item">
										<label class="el_lable" >订单状态</label>
										<div class="el_input_small">
										<input class="el_input__innern" readonly="readonly" type="text" placeholder="全部订单"/>
										<i class="iconfont">&#xe731;</i>
											<ul class="el_scrollbar">
												<li>全部订单</li>
												<li>待取件</li>
												<li>运送中</li>
												<li>已签收</li>
												<li>其他</li>
											</ul>
												<div class="sanjiao ab-two"></div>
										</div>
									</div>
									<div class="btnll">
										<span >查询</span>
									</div>
								</div>
							</div>
						</div>
						
					</div>
					<div class="header_wrapper">
						<table class="table__header" style="width: 1563px" cellspacing="0" cellpadding="0" border="0" style="width: 1563px; height: 40px;">
							<thead class="has-gutter">
								<tr>
									<td style="height: 40px; width: 50px;">序号</td>
									<td style="height: 40px; width: 190px;">订单号</td>
									<td style="height: 40px; width: 190px;">运单号</td>
								 	<td style="height: 40px; width: 300px;">寄件人/收件人</td>
									<td style="height: 40px; width: 279px;">下单时间</td>
									<td style="height: 40px; width: 277px;">当前进度</td>
									<td style="height: 40px; width: 277px;">操作</td>
								</tr>
							</thead>
						</table>
					</div>
					<div class="empty_block" contenteditable="true">

						<table style="height: 52px;">
							<c:forEach items="${uid}" var="s">
						<tr class="el-table__row" style="font-size: 14px;">

							<td class="el_column_8" rowspan="1" colspan="1" style="width: 50px; height:48px; color: color: rgb(0, 0, 0);;">${s.oid}</td>
							<td class="el_column_9" rowspan="1" colspan="1" style="width: 210px; height:48px; cursor: pointer; color: #47086c; color:  #47086c;">
									${s.onumber}
							</td>
							<td class="el_column_10" rowspan="1" colspan="1"  style="width: 160px; height:48px; color: #333;">
										${s.wnumber}
							</td>
							<td class="el_column_11" rowspan="1" colspan="1"  style="width: 316px; height:48px; color: #333;">
									${s.orderSender.sdetailed}
							</td>
							<td class="el_column_12" rowspan="1" colspan="1"  style="width: 270px; height:48px; color: #333;">
									${s.otime}
							</td>
							<td class="el_column_13" rowspan="1" colspan="1"  style="width: 265px; height:48px; cursor: pointer;color: #47086c; font-size: 14px;" onclick="x(${s.oid})">
									查看详情							
							</td>
							<!--<td class="el_column_14" rowspan="1" colspan="1"  style="width: 378px; height=48px">
									<div class="btn-round" style="margin-left: 130px; margin-right: 20px;">
										投诉    
									</div>		
									<div class="btn-round">
										评论
									</div>
							</td>-->
						</tr>
							</c:forEach>
						</table>
						<script>

								function x(oid) {

									$.get("../myorder/selectByOid","oid="+oid,function (json) {
                                        $("#ydh").text(json.wnumber);
                                        $("#ddh").text(json.onumber);
										$("#jjr").text(json.orderSender.sname);
										$("#jjrdh").text(json.orderSender.sphone);
										$("#jjrdz").text(json.orderSender.sdistrict+json.orderSender.sdetailed);

										$("#sjr").text(json.orderConsignee.cname);
										$("#sjrdh").text(json.orderConsignee.cphone);
										$("#sjrdz").text(json.orderConsignee.cdistrict+json.orderConsignee.cdetailed);
										$("#wpmc").text(json.itemType);
										$("#wpzl").text(json.weight);


										$("#tsbz").text(json.remark);
										$("#xdsj").text(json.otime);
										$("#smjz").text(json.money);



									},"json");
								}

						</script>



















						<!-- 窗口定位开始 -->
															<div class="custom_dialog" btn="none">
			<div class="headern">已签收<i class="iconfont">&#xe687;</i></div>
			<div class="custom-flex-box" >
				<div class="inline-box" style="margin-left: -130px;">
					<div style="display: inline-block;">
				<img class="label-icon" src="../front/img/image/che.png" />
				<label>运单号</label>
				<span class="blue" style="font-size: 14px; color: #3482db;" id="ydh">YT5132855137322</span>
				</div>
				<div style="display: inline-block; margin-left: 20px;">
				    <img class="label-icon" src="../front/img/image/ding.png" />
					<label>订单号</label>
					<span class="blue" style="font-size: 14px; color: #3482db;" id="ddh">EC1346382656969322498</span>
					</div>
				</div>	
			</div>
			<div class="custom-flex-box">
				<div class="inline-box">
				<img class="label-icon" src="../front/img/image/ji.png"/>
				<div>
				<span class="uname" style="margin-right: 20px;" id="jjr">曼花</span>
				<span class="phone" style="margin-right: 20px;" id="jjrdh">13618476082</span>
				<span class="xq" id="jjrdz">湖北省孝感市孝南区启龙路1号依柔优品纸业（拒收顺丰、到付）请保持商品原样寄回。 请尽量使用下方官方推荐的【上门取件服务】寄回商品</span>
				</div>
				</div>
			</div>
			<div class="custom-flex-box">
				<div class="inline-box" style="color: #000000;">
				<img class="label-icon" src="../front/img/image/shou.png"/>
				<div>
				<span class="uname" style="margin-right: 20px;" id="sjr">蜡**</span>
				<span class="phone" style="margin-right: 20px;" id="sjrdh">136****6082</span>
				<span class="xq" id="sjrdz">湖南省长沙市雨花区湖南省长沙市雨花区香樟路110号一度教育软件培训学校</span>
				</div>
				</div>
			</div>
			<div class="custom-flex-box">
				<img class="label-icon" src="../front/img/image/wu.png"/>
				<div class="inline-box" style="flex-wrap: wrap;display: flex;">
						<div class="mess_box">
							<label>物品名称</label>
							<span style="color: #333333;" id="wpmc">无</span>
						</div>
						<div class="mess_box">
							<label>物品重量 </labe>
								<span id="wpzl">1</span>
						</div>
						<div class="mess_box">
							<label>时效产品</label>
							<span id="sxcp">无</span>
						</div>
						
						<div class="mess_box">
							<label>支付方式 </label>
							<span style="color: #333333;">寄付</span>
						</div>
						<div class="mess_box">
							<label>抵用券</label>
							<span id="dyj">无</span>
						</div>
						
						<div class="mess_box">
							<label>特殊备注</label>
							<span id="tsbz">1</span>
						</div>
						<div class="mess_box">
							<label>下单时间 </label>
							<span style="color: #333333;" id="xdsj">2020-12-18 21:54:30</span>
						</div>
						<div class="mess_box">
							<label>声明价值</label>
							<span id="smjz">1</span>
						</div>
				</div>
			</div>
			<div class="collapse-head" style="cursor: pointer;">
				<div class="custom-flex-box" style="border-bottom: 1px solid #ebeef5;">
					<div class="inline-box">
						<img class="label-icon" src="../front/img/image/gui.png"/>
						<label style="color: #000000;margin-left: -520px;">物流轨迹</label><i class="iconfont" style="float: right;">&#xe62a;</i>
					</div>
				</div>
			</div>
			<div class="el_collapsen">
				<div class="titles">
					纠错：
					<span class="title_yellow" style="color: #E69B23;">不是我的包裹>></span>
				</div>
				<div class="yto-x-hidden" style="margin-bottom: -17px; margin-right: -17px;">
					<div class="scrollbar__view">
						<ul>
							<li>
								<p>客户签收人: 已签收，签收人凭取货码签收。 已签收  感谢使用圆通速递，期待再次为您服务 如有疑问请联系：18374956356，投诉电话：0731-82563323</p>
								<p>2020-12-20 19:49:32</p>
							</li>
							<li>
								<p>客户签收人: 已签收，签收人凭取货码签收。 已签收  感谢使用圆通速递，期待再次为您服务 如有疑问请联系：18374956356，投诉电话：0731-82563323</p>
								<p>2020-12-20 19:49:32</p>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- 窗口定位结束111 -->
					</div>
					
					<div class="page_box">
						<span class="el_total">共 1 条</span>
						<div class="el-input_mini">
							<input type="text" value="10条/页"/ readonly="readonly">
							<i class="iconfont">&#xe731;</i>
						</div>
						<button>
						<i class="iconfont fl">&#xe63b;</i>
						</button>
							<span class="sp">
								1
							</span>
						<button>
						<i class="iconfont fr">&#xe62a;</i>
						</button>	
						<span class="el_emip">
							前往
							<input type="text" value="1"  />
							页
						</span>
					</div>
					
				</div>
				
				<div class="el_input_group_b">
					<div class="el_from">
						<div class="tt">
							<i class="iconfont fl">&#xe616;</i>
							<input class="inp fr" type="date" placeholder="选择日期" />
						</div>
						    <div class="item_con">
								-
							</div>
						<div class="tt">
							<i class="iconfont fl">&#xe616;</i>
							<input class="inp fr" type="date"   placeholder="选择日期" />
						</div>
						<div class="btn">
							<button>
								<span>查询</span>
							</button>
						</div>
					</div>
					<div class="el_wraap">
						<table class="el_table__header">
							<tr>
								<td style="width: 50px;" height="40px" >序号</td>
								<td style="width: 379px;" height="40px">运单号</td>
								<td style="width: 378px;" height="40px">寄件人/收件人</td>
								<td style="width: 378px;" height="40px">发出时间</td>
								<td style="width: 378px;" height="40px">操作</td>
							</tr>
						</table>
					</div>
					<div class="el-table__body_wrapper" contenteditable="true">
						<table style="height: 52px;">
							<c:forEach items="${uid}" var="ss">
						<tr class="el-table__row">
							<td class="el_column_8" rowspan="1" colspan="1" style="width: 50px; height:48px; color: #333;">
									${ss.oid}
							</td>
							<td class="el_column_9" rowspan="1" colspan="1" style="width: 379px; height:48px; cursor: pointer; color: #47086c;">
									${ss.wnumber}
									
									
							</td>
							<td class="el_column_10" rowspan="1" colspan="1"  style="width: 378px; height:48px: color: #333;">
									${ss.orderConsignee.cdetailed}
							</td>
							<td class="el_column_11" rowspan="1" colspan="1"  style="width: 378px; height:48px; color: #333;">
									${ss.otime}
							</td>
							<td class="el_column_12" rowspan="1" colspan="1"  style="width: 378px; height:48px; color: #333;">
									<div class="btn-round" style="margin-left: 130px; margin-right: 20px;">
										投诉    
									</div>		
									<div class="btn-round">
										评论
									</div>
							</td>
						</tr>
							</c:forEach>
						</table>
							<!-- 窗口定位开始2222 -->
															<div class="custom_dialog" btn="none">
			<div class="headern" style="margin-left: 20px;">已签收<i class="iconfont">&#xe687;</i></div>
			<div class="custom-flex-box" >
				<div class="inline-box">
					<div style="display: inline-block;">
				<img class="label-icon" src="../front/img/image/che.png" />
				<label>运单号</label>
				<span class="blue" style="font-size: 14px; color: #3482db;">YT5132855137322</span>
				</div>
				<div style="display: inline-block; margin-left: 20px;">
				    <img class="label-icon" src="../front/img/image/ding.png" />
					<label>订单号</label>
					<span class="blue" style="font-size: 14px; color: #3482db;">EC1346382656969322498</span>
					</div>
				</div>	
			</div>
			<div class="custom-flex-box">
				<div class="inline-box">
				<img class="label-icon" src="../front/img/image/ji.png"/>
				<div>
				<span class="uname" style="margin-right: 20px;">曼花</span>
				<span class="phone" style="margin-right: 20px;">13618476082</span>
				<span class="xq">湖北省孝感市孝南区启龙路1号依柔优品纸业（拒收顺丰、到付）请保持商品原样寄回。 请尽量使用下方官方推荐的【上门取件服务】寄回商品</span>
				</div>
				</div>
			</div>
			<div class="custom-flex-box">
				<div class="inline-box" style="color: #000000;">
				<img class="label-icon" src="../front/img/image/shou.png"/>
				<div>
				<span class="uname" style="margin-right: 20px;">蜡**</span>
				<span class="phone" style="margin-right: 20px;">136****6082</span>
				<span class="xq">湖南省长沙市雨花区湖南省长沙市雨花区香樟路110号一度教育软件培训学校</span>
				</div>
				</div>
			</div>
			<div class="custom-flex-box">
				<img class="label-icon" src="../front/img/image/wu.png"/>
				<div class="inline-box" style="flex-wrap: wrap;display: flex;">
						<div class="mess_box">
							<label>物品名称</label>
							<span style="color: #333333;">无</span>
						</div>
						<div class="mess_box">
							<label>物品重量 </labe>
						</div>
						<div class="mess_box">
							<label>时效产品</label>
						</div>
						
						<div class="mess_box">
							<label>支付方式 </label>
							<span style="color: #333333;">寄付</span>
						</div>
						<div class="mess_box">
							<label>抵用券</label>
						</div>
						
						<div class="mess_box">
							<label>特殊备注</label>
						</div>
						<div class="mess_box">
							<label>下单时间 </label>
							<span style="color: #333333;">2020-12-18 21:54:30</span>
						</div>
						<div class="mess_box">
							<label>声明价值</label>
						</div>
				</div>
			</div>
			<div class="collapse-head" style="cursor: pointer;">
				<div class="custom-flex-box" style="border-bottom: 1px solid #ebeef5;">
					<div class="inline-box">
						<img class="label-icon" src="../front/img/image/gui.png"/>
						<label style="color: #000000;">物流轨迹</label><i class="iconfont" style="float: right;">&#xe62a;</i>
					</div>
				</div>
			</div>
			<div class="el_collapsen">
				<div class="titles">
					纠错：
					<span class="title_yellow" style="color: #E69B23;">不是我的包裹>></span>
				</div>
				<div class="yto-x-hidden" style="margin-bottom: -17px; margin-right: -17px;">
					<div class="scrollbar__view">
						<ul>
							<li>
								<p>客户签收人: 已签收，签收人凭取货码签收。 已签收  感谢使用圆通速递，期待再次为您服务 如有疑问请联系：18374956356，投诉电话：0731-82563323</p>
								<p>2020-12-20 19:49:32</p>
							</li>
							<li>
								<p>客户签收人: 已签收，签收人凭取货码签收。 已签收  感谢使用圆通速递，期待再次为您服务 如有疑问请联系：18374956356，投诉电话：0731-82563323</p>
								<p>2020-12-20 19:49:32</p>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- 窗口定位结束2222 -->
					</div>
					<div class="pag_boy">
						<span class="px">共 1 条</span>
						<div class="el_se">
							<input class="el_inline" type="text" readonly="readonly" value="10条/页"/>
							<i class="iconfont">&#xe731;</i>
						</div>
						<button class="btn_prey" type="button" disabled="disabled">
							<i class="iconfont">&#xe63b;</i>
						</button>
						<span class="spa">
								1
							</span>
						<button class="el_iooo" type="button" disabled="disabled">
							<i class="iconfont">&#xe62a;</i>
						</button>
						<span class="el_emips">
							前往
							<input type="text" value="1"  />
							页
						</span>
					</div>
				</div>
	    </div>
	    <div class="el_dubu">
	    	<center>
			<div class="center">
				<div class="left">
					© 2018. All RIGHT RESERVED. 圆通速递有限公司 版权所有 
					<span style="color:#47086c;">沪ICP备05004632号</span>
				</div>
				<div class="right">
					<span style="color: #e69b24;">圆通官网 </span>  客服服务热线：95554，021-69777888
				</div>
			</div>
			</center>
		</div>
	</body>
	<script>
		$(".el_column_9").click(function(){
			var btn = $(".custom_dialog").attr("btn");
			if (btn=="none") {
				$(".custom_dialog").stop().animate({right:"0px"},500);
				$(".custom_dialog").attr("btn","block");
			}else{
				$(".custom_dialog").stop().animate({right:"-730px"},500);
				$(".custom_dialog").attr("btn","none");
			}
		});
	
			$(".el_column_13").click(function(){
			var btn = $(".custom_dialog").attr("btn");
			if (btn=="none") {
				$(".custom_dialog").stop().animate({right:"0px"},500);
				$(".custom_dialog").attr("btn","block");
			}else{
				$(".custom_dialog").stop().animate({right:"-730px"},500);
				$(".custom_dialog").attr("btn","none");
			}
			
		});
				
		$(".iconfont").click(function(){
			$(".custom_dialog").stop().animate({right:"-730px"},500);
			$(".custom_dialog").attr("btn","none");
		});
		
		$(".empty_block").focusout(function(){
			$(".custom_dialog").stop().animate({right:"-730px"},500);
			$(".custom_dialog").attr("btn","none");
		})
		
			$(".el-table__body_wrapper").focusout(function(){
			$(".custom_dialog").stop().animate({right:"-730px"},500);
			$(".custom_dialog").attr("btn","none");
		})
		
		
		//显示开始
		$("#head_top .content .el_b>dl>dt").hover(
			function() { //进
				$(this).find("div").stop(true).slideDown("fast");
			},
			function() { //出
				$(this).find("div").stop(true).slideUp("fast");
			});
		//点击滑动切换页面
		$(".myorder-container .nav_scroll dl dt:eq(1)").click(function(){
			$(".myorder-container .nav_scroll i").animate({left:"78px"},200);
			$(this).css("color","#47086c");
			$(".nav_scroll dl dt:eq(0)").css("color"," #303133");
			$(".myorder-container .el_input_group").hide();
			$(".el_input_group_b").show();
		});
		$(".myorder-container .nav_scroll dl dt:eq(0)").click(function(){
			$(".myorder-container .nav_scroll i").animate({left:"0px"},200);
			$(this).css("color","#47086c");
			$(".nav_scroll dl dt:eq(1)").css("color","#303133");
			$(".myorder-container .el_input_group").show();
			$(".el_input_group_b").hide();
		});
		
		$(".el_form_item .el-date-editor .el_input__inner").hover(function(){
			$(".el_form_item .el-date-editor").css("border-color","#c0c4cc");
		},function(){
			$(".el_form_item .el-date-editor").css("border-color","#dcdfe6");
		});
		
	
		/*点击滑出选项*/
		$(".el_input_group .group_top .el_input_groupr .el_select").click(function(){
			$(this).find("ul").stop(true).slideToggle("fast");
		});
		/*点击切换查询*/
		$(".el_input_group .group_top .el_input_groupr .el_select .el_list li").click(function(){
			$(".el_input_group .group_top .el_input_groupr .el_select input").val($(this).text());
			$(this).css("color","#47086c");
			$(this).siblings("li").css("color","#606266");
			$(this).css("background-color","#f5f7fa");
			$(this).siblings("li").css("background-color","white");
		});
		
		
		
		$(".el_input_group .group_top .el_input_groupr .el_select").focusout(function(){
			$(".el_input_group .group_top .el_input_groupr .el_select ul").slideUp("fast");
		});
		
		
		$(".el_input_small").click(function(){
			$(this).css("border-color","#606266");
		});
		
		$(".el_input_small").focusout(function(){
			$(this).css("border-color","#dcdfe6");
		});
		
		/*点击边框变色*/
		$(".el_input_group .group_top .el_input_groupr .el-input__inner").click(function(){
			$(this).css("border-color","#606266");
		});
		/*点击边框颜色消失*/
		$(".el_input_group .group_top .el_input_groupr .el-input__inner").focusout(function(){
			$(this).css("border-color","#dcdfe6");
		});
		
		$(".el_input_group .group_top .el_input_groupr .el_input_small").click(function(){
			$('.el_input_small').find("ul").stop(true).slideToggle("fast");
		});
		
		$(".el_input_group .group_top .el_input_groupr .el_input_small .el_scrollbar li").click(function(){
			$(".el_input_group .group_top .el_input_groupr .el_input_small .el_input__innern").val($(this).text())
		});
			
	</script>
</html>