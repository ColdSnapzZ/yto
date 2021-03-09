<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta charset="utf-8" />
		<title>圆通速递</title>
		<link href="../front/imgs/tracesimple/favicon.ico" rel="shortcut icon" type="image/x-icon">
		<script type="text/javascript" src="../front/js/jquery-3.4.1.min.js"></script>
		<link href="../front/csss/bootstrap.min.css" rel="stylesheet">
		<script src="../front/jss/bootstrap.min.js"></script>
		<link href="../front/csss/iconfont.css" rel="stylesheet" />
		<link rel="stylesheet" href="../front/csss/yt.css" />
	</head>
	<body>
		<div class="bodyall">
			<!--导航条-->
			<div class="container-fluid top_nav">
				<!--语言选择-->
				<div class="top-nav-item language">
					<i class="iconfont icon-earth">&#xe81d;</i>
					<span>语言选择 | 简体中文</span>
					<i class="iconfont">&#xe731;</i>
				</div>
				<!--官网移动版-->
				<div class="top-nav-item mobile">
					<i class="iconfont icon-mobile">&#xe603;</i>
					<span>官网移动版</span>
					<i class="iconfont">&#xe731;</i>
					<div class="pop-modal pop-modal-bottom">
						<img src="../front/imgs/tracesimple/download.001.png" />
						<span>扫一扫</span>
					</div>
				</div>
				<!--用户-->
				<div class="top-nav-item user">
					<i class="iconfont icon-user">&#xe617;</i>
					<a targrt="_blank" class="color-orange">个人会员</a> |
					<a class="color-orange">企业会员</a>
				</div>
			</div>
			<!--选项栏-->
			<div class="navitation-wrap">
				</div>
			<div class="navitation w1200">
				<a href="/">
					<img src="../front/imgs/tracesimple/icon-logo.001.png" class="icon-logo" />
				</a>
				<ul class="fr-nav">
					<li class="nav-item hover-modal1">
						<a class="nav-item-a" href="#">首页</a>
					</li>
					<li class="nav-item hover-modal2">
						<a class="nav-item-a">圆通速递<i class="iconfont">&#xe731;</i></a>
						<div class="pop-modal pop-modal-bottom1">
							<ul class="content">
								<li class="content-item-1">
									<h3>产品服务</h3>
									<a class="hover-purple" href="javascript:;">时效产品</a>
									<a class="hover-purple" href="javascript:;">增值服务</a>
									<a class="hover-purple" href="javascript:;">特色产品</a>
								</li>
								<li class="content-item-2">
									<h3>客户专区</h3>
									<a class="hover-purple" href="javascript:;">服务支持</a>
									<a class="hover-purple" href="javascript:;">大客户专区</a>
									<a class="hover-underline" href="javascript:;">个人会员</a>
									<a class="hover-underline" href="javascript:;">企业会员</a>
								</li>
								<li class="content-item-3">
									<h3>特许经营</h3>
									<a class="hover-purple" href="javascript:;">加盟圆通</a>
									<a class="hover-underline" href="javascript:;">天下招商</a>
								</li>
							</ul>
						</div>
					</li>
					<li class="nav-item hover-modal3">
						<a class="nav-item-a">圆通国际<i class="iconfont">&#xe731;</i></a>
						<div class="pop-modal pop-modal-bottom2">
							<ul class="content">
								<li class="content-item-1">
									<h3>产品服务</h3>
									<a class="hover-purple" href="javascript:;">国际快件</a>
									<a class="hover-purple" href="javascript:;">国际空运</a>
									<a class="hover-purple" href="javascript:;">国际海运</a>
									<a class="hover-purple" href="javascript:;">国际铁路</a>
									<a class="hover-purple" href="javascript:;">国际转运</a>
									<a class="hover-purple" href="javascript:;">关务服务</a>
									<a class="hover-purple" href="javascript:;">仓储与物流</a>
									<a class="hover-purple" href="javascript:;">增值服务</a>
									<a class="hover-purple" href="javascript:;">其他</a>
								</li>
								<li class="content-item-2">
									<h3>全球合作</h3>
									<a class="hover-purple" href="javascript:;">网络加盟</a>
								</li>
								<li class="content-item-3">
									<h3>国际新闻</h3>
									<a class="hover-purple" href="javascript:;">国际新闻</a>
								</li>
								<li class="content-item-4">
									<h3>关于我们</h3>
									<a class="hover-purple" href="javascript:;">公司概况</a>
									<a class="hover-purple" href="javascript:;">加入我们</a>
									<a class="hover-purple" href="javascript:;">在线客服</a>
								</li>
							</ul>
						</div>
					</li>
					<li class="nav-item hover-modal4">
						<a class="nav-item-a">圆通航空<i class="iconfont">&#xe731;</i></a>
						<div class="pop-modal pop-modal-bottom3">
							<ul class="content">
								<li class="content-item-1">
									<h3>航空简介</h3>
									<div class="text">杭州圆通货运航空有限公司(以下简称圆通航空)基地位于浙江省杭州市萧山国际机场，是圆通速递有限公司旗下全资子公司。圆通航空的主营业务为国内(含港澳台)、国际定期和不定期航空货邮运输业务。</div>
									<a class="link-more hover-purple" href="javascript:;">更多详情！</a>
								</li>
								<li class="content-item-2">
									<h3>圆通航空</h3>
									<a class="hover-purple" href="#">机型及集装器ULD介绍</a>
									<a class="hover-purple" href="#">产品服务</a>
								</li>
							</ul>
						</div>
					</li>
					<li class="nav-item hover-modal5">
						<a class="nav-item-a">投资者关系<i class="iconfont">&#xe731;</i></a>
						<div class="pop-modal pop-modal-bottom4">
							<ul class="content">
								<li class="content-item-1">
									<h3>证券信息</h3>
									<a class="hover-purple" href="javascript:;">证券信息！</a>
								</li>
								<li class="content-item-2">
									<h3>最新公告</h3>
									<a class="hover-purple" href="#">财务信息</a>
									<a class="hover-purple" href="#">信息披露</a>
								</li>
								<li class="content-item-3">
									<h3>投资者之窗</h3>
									<a class="hover-purple" href="#">投资者之窗</a>
								</li>
							</ul>
						</div>
					</li>
					<li class="nav-item hover-modal6">
						<a class="nav-item-a">关于我们<i class="iconfont">&#xe731;</i></a>
						<div class="pop-modal pop-modal-bottom5">
							<ul class="content">
								<li class="content-item-1">
									<h3>圆通简介</h3>
									<div class="text">
										圆通速递有限公司（以下简称圆通）创立于2000年5月28日，现已成为一家集快递物流、科技、航空、金融、商贸等为一体国内国际协同发展， 为客户提供一站式服务的供应链企业。公司始终坚持“客户要求，圆通使命”的服务宗旨，以人为本，以客户体验为中心，着力打造品质圆通、科技圆通、 绿色圆通、德善圆通，构建圆通供应链网络生态命运共同体。
										<br /> 2016年10月，圆通在行业内率先上市（600233.SH）。截至2019年底，圆通全网拥有分公司4000多家，服务网点和终端门店7万多个， 各类转运中心133个，员工40万余人，快递服务网络覆盖全国31个省、自治区和直辖市，县级以上城市已基本实现全覆盖。
									</div>
								</li>
								<li class="content-item-2">
									<h3>最新公告</h3>
									<div class="link-wrapper">
										<a class="hover-purple" href="javascript:;">企业概况</a>
										<a class="hover-purple" href="javascript:;">文化理念</a>
										<a class="hover-purple" href="javascript:;">经营理念</a>
									</div>
									<h3>企业展示</h3>
									<div class="link-wrapper">
										<a class="hover-purple" href="javascript:;">圆通荣誉</a>
										<a class="hover-purple" href="javascript:;">公益慈善</a>
										<a class="hover-purple" href="javascript:;">网络框架</a>
										<a class="hover-purple" href="javascript:;">企业视频</a>
										<a class="hover-purple" href="javascript:;">圆通人物</a>
									</div>
									<h3>企业新闻</h3>
									<div class="link-wrapper">
										<a class="hover-purple" href="javascript:;">圆通新闻</a>
										<a class="hover-purple" href="javascript:;">通知公告</a>
										<a class="hover-purple" href="javascript:;">行业动态</a>
										<a class="hover-purple" href="javascript:;">圆通研究院</a>
									</div>
									<h3>人才招聘</h3>
						</div>
						</li>
						</ul>
			<!--</div>-->
			</li>
			</ul>
			</div>
			
			<!--在线客服-->
			<a class="service">
				<i class="iconfont">&#xe601;</i>
				<span class="text">在线客服</span>
			</a>
			<!-- 头部图片 -->
			<div class="head-picture">
				<img src="../front/imgs/tracesimple/sudi.jpg" />
			</div>
			<!--运单号查询-->
			<div class="border-nav">
			
			<!--网点查询-->
			<ul class="serve-nav">
				<li class="serve-li">
					<a class="serve-ico">
						<i class="iconfont">&#xe600;</i>
						<span>寄快递</span>
					</a>
					<div class="serve-cont-1">
						<a class="serve-delivery-ico">
							<i class="icon"></i>
							<span>标准快递</span>
						</a>
						<a class="serve-delivery-ico">
							<i class="icon"></i>
							<span>国际快递</span>
						</a>
					</div>
				</li>
				<li class="serve-li-1">
					<a class="serve-ico">
						<i class="iconfont">&#xe618;</i>
						<span>运费查询</span>
					</a>
					<ul class="serve-cont-2">
						<li>
							<span class="title">始  发  地</span>
							<div class="select-box-wrapper">
								<input type="text" class="select-box-input" placeholder="请选择省市区" />
								<i class="iconfont">&#xe731;</i>
							</div>
						</li>
						<li>
							<span class="title">目  的  地</span>
							<div class="select-box-wrapper">
								<input type="text" class="select-box-input" placeholder="请选择省市区" />
								<i class="iconfont">&#xe731;</i>
							</div>
						</li>
						<li>
							<span class="title">快件重量</span>
							<div class="input-weight">
								<input type="text" maxlength="4" size="6" />
								<span class="kg">kg</span>
								<span class="btn-search">查询</span>
							</div>
						</li>
					</ul>
				</li>
				<li class="serve-li-2">
					<a class="serve-ico">
						<i class="iconfont">&#xe612;</i>
						<span>网点查询</span>
					</a>
					<div class="serve-cont-3">
						<div class="title">请手动输入地址，点击查询地址附近网点</div>
						<div class="input-wrapper">
							<input class="select-box-input" type="text" placeholder="请输入" />
							<div class="btn-wrapper">
								<i class="iconfont icon-drop">&#xe788;</i>
								<i class="iconfont icon-search">&#xe608;</i>
							</div>
						</div>
					</div>
				</li>
				<li class="serve-li-3">
					<a class="serve-ico">
						<i class="iconfont">&#xe606;</i>
						<span>客服查询</span>
					</a>
					<div class="serve-cont-4">
						<div class="title">请选择需要查询省、市，点击查询按钮进行查询</div>
						<div class="input-wrapper">
							<input class="select-box-input" type="text" placeholder="请选择省市区" />
							<div class="btn-wrapper">
								<i class="iconfont icon-drop">&#xe731;</i>
								<i class="iconfont icon-search">&#xe608;</i>
							</div>
						</div>
					</div>
				</li>
			</ul>
			</div>
		</div>
		<!-- 运单查询、手机号查询 -->
		<div class="queryall">
			<div class="queryall-max">
				<div class="queryall-left">
					<!-- 查询按钮-->
					<div class="left-all">
						<div class="yundan">
							运单号查询
						</div>
						<div class="shouji">
							手机号查询
						</div>
					</div>
					<!-- 运单 -->
					<div class="el-textarea">
						<textarea class="el-textarea_tx" autocomplete="off" rows="4" placeholder="最多输入10个运单号,  用Enter,  斜杠/或空格分行" style="resize: none; min-height: 33px;outline: none;"></textarea>
						<button type="button" class="chaxun_a">
							<span>查询</span>
						</button>
					</div>
					<!-- 运单查询显示的数据 -->






					<div class="xianshi" style="margin-bottom: 18px; display: block;">

						<div class="qianshou">
							<p>
								<span class="mr-a">运单号：${logisticsInfos[0].wnumber}</span>
								<span class="mr-b">${logisticsInfos[0].wtime}</span>
								<span class="mr-c"></span>
								<span>已签收</span>
							</p>
							<p>
								<span class="mr-d">${logisticsInfos[0].wtime}</span>
								<span class="mr-e"></span>
								<span class="mr-f">客户签收人: 本人签收 已签收  感谢使用圆通速递，期待再次为您服务 如有疑问请联系：18390937580，投诉电话：0731-82563323</span>
								<span class="mr-g">收起详情</span>
							</p>
						</div>
						<table class="table_xq" style=" margin-left: 38px;">
							<tr style="width: 798px; min-height: 28px;">
								<td valign="top" style="width: 200px; min-height: 28px;">
									<span style="color: #727171; font-size: 18px;">${logisticsInfos[0].wtime}</span>
									<span style="margin-left: 8px; color: #727171; font-size: 18px;"></span>
								</td>
								<td valign="top" style="width: 585px; min-height: 28px;">
									<span style="color: #727171; font-size: 18px;">
									${logisticsInfos[0].winfo}	已发出  下一站 ${logisticsInfos[0].winfo}
									</span>
								</td>
							</tr>
							<tr style="width: 798px; min-height: 28px;">
								<td valign="top" style="width: 200px; min-height: 28px;">
									<span style="color: #727171; font-size: 18px;">${logisticsInfos[0].wtime}</span>
									<span style="margin-left: 8px; color: #727171; font-size: 18px;"></span>
								</td>
								<td valign="top" style="width: 585px; min-height: 28px;">
									<span style="color: #727171; font-size: 18px;">
									${logisticsInfos[0].winfo}	已收取   客户已签收  本人签收 已签收 感谢使用圆通速递，期待再次为您服务 如有疑问请联系：18390937580，投诉电话：0731-82563323
									</span>
								</td>
							</tr>


						</table>




					</div>

					<!-- 手机号 -->
					<div class="el-input" style="display: none;">
						<div class="input_one">
							<input type="text" style="outline: none;" maxlength="11" autocomplete="off" placeholder="请输入您的手机号" class="one_a">
						</div>
						<div class="tishi_one" style="display: none;">
						          不能为空
						</div>
						
						<div class="input_two">
							<div class="two_all">
								<input type="text" style="outline: none;" maxlength="4" autocomplete="off" placeholder="请输入图形验证码" class="two_a">
								<img class="two_b" src="../front/imgs/tracesimple/yanzheng.png" />
							</div>
						</div>
						<div class="tishi_two" style="display: none;">
						          不能为空
						</div>
						<div class="input_there">
							<div class="there_all">
								<input type="text" style="outline: none;" maxlength="6" autocomplete="off" placeholder="请输入短信验证码" class="there_a">
								<button type="button" style="outline: none;" class="there_b">
									<span>
								    获取验证码
									</span>
								</button>
							</div>
							<div class="tishi_there" style="display: none;">
							          不能为空
							</div>
							<button type="button" class="chaxun_b">
								<span id="chaxuns">查询</span>
							</button>
							<p class="tips">首次登陆默认注册为圆通会员</p>
						</div>
					</div>
				</div>
				<div class="queryall-right">
					<div class="tupian">
						<img class="imgs" src="../front/imgs/tracesimple/erweima.png" />
					</div>
				</div>
			</div>
		</div>
		<div class="foot_wrap-pc">
			<div class="bottom-nav">
				<div class="w1200">
					<div class="send fl">
						<h3>寄件须知</h3>
						<div class="fl">
							<a class="hover-purple" href="javascript:;">禁寄物品</a>
							<a class="hover-purple" href="javascript:;">面单填写</a>
							<a class="hover-purple" href="javascript:;">如何包装</a>
							<a class="hover-purple" href="javascript:;">如何签收</a>
						</div>
						<div class="fl">
							<a class="hover-purple" href="javascript:;">查询时效</a>
							<a class="hover-purple" href="javascript:;">保价服务</a>
						</div>
					</div>
					
					<div class="link fl">
						<h3>快速链接</h3>
						<div class="fl" style="width: 20%;">
							<a class="hover-purple" href="javascript:;">圆通荣誉</a>
							<a class="hover-purple" href="javascript:;">圆通国际</a>
							<a class="hover-purple" href="javascript:;">圆通航空</a>
							<a class="hover-purple" href="javascript:;">公益慈善</a>
							<a class="hover-purple" href="javascript:;">开放平台</a>
							<a class="hover-purple" href="javascript:;">客户管家</a>
						</div>
						<div class="fl" style="width: 67%;">
							<a class="hover-purple" href="javascript:;">意见反馈</a>
							<a class="hover-purple" href="javascript:;">凭证上传</a>
							<a class="hover-purple" href="javascript:;">圆通邮件系统</a>
							<a class="hover-purple" href="javascript:;">物流信息互通共享技术及应用国家工程实验室</a>
							<a class="hover-purple" href="javascript:;">17TRACK-全球物流查询平台</a>
						</div>
					</div>
					
					<div class="fl">
						<h3>股票代码</h3>
						<div class="fl" style="color: rgb(89, 87, 87);">
							<span class="fl" style="width: 130.5px; height: 48px;">
		      					圆通速递  600233.SH
		      					<br /> 
		      					圆通速递国际  06123.HK
		     	 			</span>
						</div>
					</div>
					
					<div class="contact fr">
						<h3>服务热线</h3>
						<div class="tel border-bottom-gray">
							<i class="fl iconfont">&#xe628;</i>
							<span class="number fl">
								95554
								<br />
								021-69777888
							</span>
						</div>
						<ul class="qr-wrapper">
							<li class="hover-purple1 hover-modal">
								<a class="hover-purple1 hover-modal">
									<i class="iconfont">&#xe67d;</i>
									<span class="name">微博</span>
								</a>
								<div class="pop-modal pop-modal-top">
									<img src="../front/imgs/tracesimple/qr-weibo.png" />
									<span>扫码关注</span>
								</div>
							</li>
							<li class="hover-purple1 hover-modal">
								<i class="iconfont">&#xe649;</i>
								<span class="name">微信</span>
								<div class="pop-modal pop-modal-top">
									<img src="../front/imgs/tracesimple/qr-weixin.jpg" />
									<span>扫码关注</span>
								</div>
							</li>
							<li class="hover-purple1 hover-modal">
								<i class="iconfont">&#xe62b;</i>
								<span class="name">支付宝</span>
								<div class="pop-modal pop-modal-top">
								<img src="../front/imgs/tracesimple/qr-alipay.jpg" />
								<span>扫码关注</span>
								</div>
							</li>
							<li class="hover-purple1 hover-modal">
								<i class="iconfont">&#xe602;</i>
								<span class="name" style="width: 55.56px;">QQ公众号</span>
								<div class="pop-modal pop-modal-top">
									<img src="../front/imgs/tracesimple/qr-qq.jpg" />
									<span>扫码关注</span>
								</div>
							</li>
						</ul>
					</div>
					
					<div class="police-img">
						<img class="shuidi" src="../front/imgs/tracesimple/shuidi_logo.png" />
						<img src="../front/imgs/tracesimple/police-1.png" />
						<img src="../front/imgs/tracesimple/police-2.png" />
						<img src="../front/imgs/tracesimple/police-3.png" />
					</div>
				</div>
			</div>
			
			<div class="copyright">
				<div class="w1200">
					<div class="fl">2000-2020圆通速递版权所有 All Right Reserved</div>
					<div class="fr">
						上海青浦区华新镇华徐公路3029弄28号    |    沪公网安备 31011802001021号    |    邮政编码：201705    |    
						<a href="javascript:;">沪ICP备05004632号</a>
					</div>
				</div>
			</div>
		</div>
	</body>
	<script>
		$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(0)").hover(function(){
			$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(0) .pop-modal").css("display","block");
		},function(){
			$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(0) .pop-modal").css("display","none");
		})
		$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(1)").hover(function(){
			$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(1) .pop-modal").css("display","block");
		},function(){
			$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(1) .pop-modal").css("display","none");
		})
		$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(2)").hover(function(){
			$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(2) .pop-modal").css("display","block");
		},function(){
			$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(2) .pop-modal").css("display","none");
		})
		$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(3)").hover(function(){
			$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(3) .pop-modal").css("display","block");
		},function(){
			$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(3) .pop-modal").css("display","none");
		})
	</script>
	
	<script>
		var val = 0;
		$(".swiper-btn-wrapper-3 .fr").click(function(){
			if (val!=-800) {
				val = val-400;
				$(".news-swiper.news .swiper-container .swiper-wrapper").animate({left:val+"px"},300);
			}
		})
		
		$(".swiper-btn-wrapper-3 .fl").click(function(){
			if (val!=0) {
				val = val+400;
				$(".news-swiper.news .swiper-container .swiper-wrapper").animate({left:val+"px"},300);
			}
		})
		
		$(".news.new .w1200 .news-nav .nav-item.new").hover(function(){
			val = 0;
			$(".news-swiper.news .swiper-container .swiper-wrapper").animate({left:val+"px"},0);
			$(".news.new .w1200 .news-nav .nav-item.sliding").animate({left:"0px"},30);
			$(".news.new .w1200 .news-nav .nav-item.new .title").animate({left:"20px"},30);
			$(".news.new .w1200 .news-nav .nav-item.new .title").css("color","#fff");
			$(".news.new .w1200 .news-nav .nav-item.new .more.new").css("display","block");
			
			$(".news.new .w1200 .news-nav .nav-item.status .title").animate({left:"160px"},30);
			$(".news.new .w1200 .news-nav .nav-item.status .title").css("color","#898989");
			$(".news.new .w1200 .news-nav .nav-item.status .more.status").css("display","none");
			
			$(".swiper-wrapper .swiper-slide:eq(0) .new-item .time").text("12.4");
			$(".swiper-wrapper .swiper-slide:eq(0) .new-item .title").text("圆通2个集体、1名个人分获表彰——沪浙两地举行邮政快递业抗击...");
			$(".swiper-wrapper .swiper-slide:eq(0) .new-item .text").text("12月3日下午，上海市邮政快递行业抗击新冠肺炎疫情先进表彰大会举行。圆通品牌传播部和圆通上海同济网点业务员郭浩强分获“全国交通运输系统抗击新冠肺炎疫情先进集体”、“上海市抗击新冠肺炎疫情先进个人”荣誉称号。");
		
			$(".swiper-wrapper .swiper-slide:eq(1) .new-item .time").text("11.17");
			$(".swiper-wrapper .swiper-slide:eq(1) .new-item .title").text("河南省省长尹弘率河南党政代表团一行考察圆通速递总部");
			$(".swiper-wrapper .swiper-slide:eq(1) .new-item .text").text("11月16日上午，河南省委副书记、省长尹弘率领由河南省四套班子领导及各厅局、地市主要负责人组成的河南党政代表团40多人，莅临圆通速递总部考察指导。上海市委副书记、市长龚正陪同考察。圆通速递董事长喻渭蛟率公司管理团队热情接待了代表团一行。");
			
			$(".swiper-wrapper .swiper-slide:eq(2) .new-item .time").text("11.12");
			$(".swiper-wrapper .swiper-slide:eq(2) .new-item .title").text("阿里巴巴董事局主席张勇一行到访圆通总部 期待双方合作走得更远...");
			$(".swiper-wrapper .swiper-slide:eq(2) .new-item .text").text("11月12日傍晚，阿里巴巴董事局主席兼首席执行官张勇、菜鸟网络CEO万霖一行到访圆通速递总部，感谢圆通管理团队、一线员工在双11期间的辛勤付出，对圆通全面推进的数字化转型战略给予充分肯定，并期待双方合作走得更远、更好。");
			
			$(".swiper-wrapper .swiper-slide:eq(3) .new-item .time").text("11.11");
			$(".swiper-wrapper .swiper-slide:eq(3) .new-item .title").text("双11 | 圆通速递、航空、国际全面协同，迎战旺季高峰");
			$(".swiper-wrapper .swiper-slide:eq(3) .new-item .text").text("双11第二波高峰如期而至。在当前构建“国内大循环为主体、国内国际双循环”新发展格局的背景下，今年双11成为中国经济疫后重启、回暖、全面加速的重要见证。");
			
			$(".swiper-wrapper .swiper-slide:eq(4) .new-item .time").text("11.10");
			$(".swiper-wrapper .swiper-slide:eq(4) .new-item .title").text("2020世界健康大会在杭州举行  圆通速递荣获“十大抗疫先行...");
			$(".swiper-wrapper .swiper-slide:eq(4) .new-item .text").text("11月8日，2020世界健康大会在杭州国际博览中心举行。圆通速递被评为“特别奉献 浙江骄傲——十大抗疫先行企业”。浙江省人民政府副省长高兴夫，杭州市委副书记、市长刘忻等领导出席本次大会，并为获奖企业颁奖。");
		})
		
		$(".news.new .w1200 .news-nav .nav-item.status").hover(function(){
			val = 0;
			$(".news-swiper.news .swiper-container .swiper-wrapper").animate({left:val+"px"},0);
			$(".news.new .w1200 .news-nav .nav-item.sliding").animate({left:"600px"},30);
			$(".news.new .w1200 .news-nav .nav-item.new .title").animate({left:"160px"},30);
			$(".news.new .w1200 .news-nav .nav-item.new .title").css("color","#898989");
			$(".news.new .w1200 .news-nav .nav-item.new .more.new").css("display","none");
			
			$(".news.new .w1200 .news-nav .nav-item.status .title").animate({left:"20px"},30);
			$(".news.new .w1200 .news-nav .nav-item.status .title").css("color","#fff");
			$(".news.new .w1200 .news-nav .nav-item.status .more.status").css("display","block");
			
			$(".swiper-wrapper .swiper-slide:eq(0) .new-item .time").text("11.9");
			$(".swiper-wrapper .swiper-slide:eq(0) .new-item .title").text("杨传堂调研“双11”邮政快递业务时强调了这些内容");
			$(".swiper-wrapper .swiper-slide:eq(0) .new-item .text").text("11月5日、6日，交通运输部党组书记杨传堂分别到北京西站和位于北京市丰台区、大兴区的快递园区、邮政网点、快递企业，调研“双11”邮政快递业务旺季服务保障工作，并向邮政、快递企业员工表示亲切慰问。");
		
			$(".swiper-wrapper .swiper-slide:eq(1) .new-item .time").text("10.13");
			$(".swiper-wrapper .swiper-slide:eq(1) .new-item .title").text("快递包装绿色治理被纳入上海市加强塑料污染治理实施方案");
			$(".swiper-wrapper .swiper-slide:eq(1) .new-item .text").text("近日，上海市发展改革委员会、上海市生态环境局等十部门联合印发《上海市关于进一步加强塑料污染治理的实施方案》（以下简称《方案》），将快递包装绿色治理纳入其中。");
			
			$(".swiper-wrapper .swiper-slide:eq(2) .new-item .time").text("9.25");
			$(".swiper-wrapper .swiper-slide:eq(2) .new-item .title").text("国家邮政局召开邮政业塑料污染治理工作推进会");
			$(".swiper-wrapper .swiper-slide:eq(2) .new-item .text").text("9月22日，国家邮政局在京召开邮政业塑料污染治理工作推进会，深入学习贯彻习近平总书记重要指示精神，传达学习全国塑料污染治理工作电视电话会议精神。局党组成员、副局长赵民出席会议并讲话。");
			
			$(".swiper-wrapper .swiper-slide:eq(3) .new-item .time").text("8.11");
			$(".swiper-wrapper .swiper-slide:eq(3) .new-item .title").text("八部门联合印发《关于加强快递绿色包装标准化工作的指导意见》");
			$(".swiper-wrapper .swiper-slide:eq(3) .new-item .text").text("未来三年，我国快递绿色包装标准化工作将加快推进。近日，市场监管总局、发展改革委、科技部、工业和信息化部、生态环境部、住房城乡建设部、商务部、邮政局联合印发《关于加强快递绿色包装标准化工作的指导意见》（以下简称《指导意见》），对未来三年我国快递绿色包装标准化工作作出全面部署。");
			
			$(".swiper-wrapper .swiper-slide:eq(4) .new-item .time").text("7.21");
			$(".swiper-wrapper .swiper-slide:eq(4) .new-item .title").text("国家邮政局与上海市人民政府签署合作协议");
			$(".swiper-wrapper .swiper-slide:eq(4) .new-item .text").text("7月20日，国家邮政局和上海市人民政府正式签署《关于加快推进上海邮政快递业高质量发展合作协议》，旨在通过部市紧密合作，基本建成与上海城市地位相适应的技术先进、服务优质、安全高效、绿色节能、城乡一体的现代邮政快递服务体系，助力上海打响“四大品牌”、建设“五个中心”。");
		})
	</script>
	
	<script>
		time = setInterval("showAuto()", 5000);
		var result = 0;
		var index = 0;
		var lunbowidth=-1230;
		function showAuto(){
			if(result!=lunbowidth){
				result = result-615;
				$(".nav-item-2460").animate({left:result+"px"},300);
				$(".nav-item-3075").animate({left:result+"px"},300);
			}else{
				result = 0;
				$(".nav-item-2460").animate({left:result+"px"},300);
				$(".nav-item-3075").animate({left:result+"px"},300);
			}
			
		}
		
		$(".swiper-btn-wrapper i.fl").click(function(){
			if(result!=0){
				result = result+615;
				$(".nav-item-2460").animate({left:result+"px"},300);
				$(".nav-item-3075").animate({left:result+"px"},300);
			}
			
			clearTimeout(time);
			time = setInterval("showAuto()",5000);
		})
		
		$(".swiper-btn-wrapper i.fr").click(function(){
			if (result!=lunbowidth) {
				result = result-615;
				$(".nav-item-2460").animate({left:result+"px"},300);
				$(".nav-item-3075").animate({left:result+"px"},300);
			}
			
			clearTimeout(time);
			time = setInterval("showAuto()",5000);
		})
		
		
		$(".nav-item.time").hover(function(){
			lunbowidth=-1230;
			index = 0;
			result = 0;
			$(".nav-item-2460").animate({left:result+"px"},300);
			$(".nav-item-3075").animate({left:result+"px"},300);
			$(".news.add .w1200 .news-nav .nav-item.sliding").animate({left:"0px"},30);
			$(this).css("color","white");
			$(".nav-item.add").css("color","#898989");
			$(".nav-item.special").css("color","#898989");
			
			$(".nav-item-3075").prop("class","nav-item-2460");
			$(".nav-item-2460 div:eq(4)").remove();
			
			$(".nav-item-615:eq(0) img").attr("src","../front/imgs/tracesimple/time1-1.jpg");
			$(".nav-item-615:eq(1) img").attr("src","../front/imgs/tracesimple/time1-2.jpg");
			$(".nav-item-615-2:eq(0) img").attr("src","../front/imgs/tracesimple/time1-4.jpg");
			$(".nav-item-615-2:eq(1) img").attr("src","../front/imgs/tracesimple/time1-3.jpg");
			$(".nav-item-615:eq(0) h3").text("即日达");
			$(".nav-item-615:eq(1) h3").text("次日达");
			$(".nav-item-615-2:eq(0) h3").text("三日达");
			$(".nav-item-615-2:eq(1) h3").text("隔日达");
			
			clearTimeout(time);
			time = setInterval("showAuto()",5000);
		})
		
		$(".nav-item.add").hover(function(){
			lunbowidth=-1230;
			index = 1;
			result = 0;
			$(".nav-item-2460").animate({left:result+"px"},300);
			$(".nav-item-3075").animate({left:result+"px"},300);
			$(".news.add .w1200 .news-nav .nav-item.sliding").animate({left:"400px"},30);
			$(this).css("color","white");
			$(".nav-item.time").css("color","#898989");
			$(".nav-item.special").css("color","#898989");
			
			$(".nav-item-3075").prop("class","nav-item-2460");
			$(".nav-item-2460 div:eq(4)").remove();
			
			$(".nav-item-615:eq(0) img").attr("src","../front/imgs/tracesimple/time2-1.jpg");
			$(".nav-item-615:eq(1) img").attr("src","../front/imgs/tracesimple/time2-2.jpg");
			$(".nav-item-615-2:eq(0) img").attr("src","../front/imgs/tracesimple/time2-4.jpg");
			$(".nav-item-615-2:eq(1) img").attr("src","../front/imgs/tracesimple/time2-3.jpg");
			$(".nav-item-615:eq(0) h3").text("保价服务");
			$(".nav-item-615:eq(1) h3").text("代收货款");
			$(".nav-item-615-2:eq(0) h3").text("签单返还");
			$(".nav-item-615-2:eq(1) h3").text("代取件");
			
			clearTimeout(time);
			time = setInterval("showAuto()",5000);
		})
		
		$(".nav-item.special").hover(function(){
			index = 2;
			result = 0;
			lunbowidth=-1845;
			$(".nav-item-2460").animate({left:result+"px"},300);
			$(".nav-item-3075").animate({left:result+"px"},300);
			$(".news.add .w1200 .news-nav .nav-item.sliding").animate({left:"800px"},30);
			$(this).css("color","white");
			$(".nav-item.time").css("color","#898989");
			$(".nav-item.add").css("color","#898989");
			
			$(".nav-item-2460").prop("class","nav-item-3075");
			$(".nav-item-3075").append("<div style='float: right; width: 615px; height: 305px;'><img src='imgs/tracesimple/time3-3.jpg' /><h3 style='font-size: 28px;color: #424242;font-weight: 300;line-height: 1;margin: 35px 0 15px;'>圆通云仓</h3></div>");
			$(".nav-item-3075 div:eq(5)").remove();
			
			$(".nav-item-615:eq(0) img").attr("src","../front/imgs/tracesimple/time3-1.jpg");
			$(".nav-item-615:eq(1) img").attr("src","../front/imgs/tracesimple/time3-2.jpg");
			$(".nav-item-615-2:eq(0) img").attr("src","../front/imgs/tracesimple/time3-5.jpg");
			$(".nav-item-615-2:eq(1) img").attr("src","../front/imgs/tracesimple/time3-4.jpg");
			$(".nav-item-615:eq(0) h3").text("特色经济");
			$(".nav-item-615:eq(1) h3").text("e城e品");
			$(".nav-item-615-2:eq(0) h3").text("定制服务");
			$(".nav-item-615-2:eq(1) h3").text("圆通冷运");
			
			clearTimeout(time);
			time = setInterval("showAuto()",5000);
		})
	</script>
	
	<script>
		$(".serve-cont-3 .input-wrapper .select-box-input").val("湖南省长沙市");
		$(".serve-cont-3 .input-wrapper .btn-wrapper .icon-drop").click(function(){
			$(".serve-cont-3 .input-wrapper .select-box-input").val("");
			$(this).html('&#xe731;');
			$(this).css("font-size","25px");
			$(this).css("margin-left","-11px");
		});
		//第一个li
		$(".serve-nav .serve-li a").hover(function(){
			$(".serve-li .serve-ico").css("float","right");
			$(".serve-li-1 .serve-ico").css("position","relative");
			$(".serve-li-1 .serve-ico").css("left","0px");
			$(".serve-li-2 .serve-ico").css("position","relative");
			$(".serve-li-2 .serve-ico").css("left","0px");
			$(".serve-li-3 .serve-ico").css("color","#47086C");
			$(".serve-li-3 .serve-ico").css("background-color","#F6F7F7");
			$(".serve-li .serve-ico").css("color","#FFFFFF");
			$(".serve-li .serve-ico").css("background-color","#47086C");
			$(".serve-li-1 .serve-ico").css("color","#47086C");
			$(".serve-li-1 .serve-ico").css("background-color","#F6F7F7");
			$(".serve-li-2 .serve-ico").css("color","#47086C");
			$(".serve-li-2 .serve-ico").css("background-color","#F6F7F7");
			$(".serve-nav .serve-li .serve-cont-1").css("visibility","visible");
			$(".serve-nav .serve-li-1 .serve-cont-2").css("visibility","hidden");
			$(".serve-nav .serve-li-2 .serve-cont-3").css("visibility","hidden");
			$(".serve-nav .serve-li-3 .serve-cont-4").css("visibility","hidden");
			
			$(".serve-nav .serve-li .serve-cont-1").stop().animate({left:"-10px"},250);
			$(".serve-nav .serve-li-1 .serve-cont-2").stop().animate({left:"-480px"},0);
			$(".serve-nav .serve-li-2 .serve-cont-3").stop().animate({left:"-480px"},0);
			$(".serve-nav .serve-li-3 .serve-cont-4").stop().animate({left:"-480px"},0);
		})
		
		//第二个li
		$(".serve-nav .serve-li-1 a").hover(function(){
			$(".serve-li .serve-ico").css("float","left");
			$(".serve-li-1 .serve-ico").css("position","relative");
			$(".serve-li-1 .serve-ico").css("left","0px");
			$(".serve-li-2 .serve-ico").css("position","relative");
			$(".serve-li-2 .serve-ico").css("left","0px");
			$(".serve-li-3 .serve-ico").css("color","#47086C");
			$(".serve-li-3 .serve-ico").css("background-color","#F6F7F7");
			$(".serve-li-2 .serve-ico").css("color","#47086C");
			$(".serve-li-2 .serve-ico").css("background-color","#F6F7F7");
			$(".serve-li-1 .serve-ico").css("color","#FFFFFF");
			$(".serve-li-1 .serve-ico").css("background-color","#47086C");
			$(".serve-li .serve-ico").css("color","#47086C");
			$(".serve-li .serve-ico").css("background-color","#F6F7F7");
			$(".serve-nav .serve-li-1 .serve-cont-2").css("visibility","visible");
			$(".serve-nav .serve-li .serve-cont-1").css("visibility","hidden");
			$(".serve-nav .serve-li-2 .serve-cont-3").css("visibility","hidden");
			$(".serve-nav .serve-li-3 .serve-cont-4").css("visibility","hidden");
			
			$(".serve-nav .serve-li-1 .serve-cont-2").stop().animate({left:"-440px"},250);
			$(".serve-nav .serve-li .serve-cont-1").stop().animate({left:"-50px"},0);
			$(".serve-nav .serve-li-2 .serve-cont-3").stop().animate({left:"-480px"},0);
			$(".serve-nav .serve-li-3 .serve-cont-4").stop().animate({left:"-480px"},0);
		})
		
		//第三个li
		$(".serve-nav .serve-li-2 a").hover(function(){
			$(".serve-li .serve-ico").css("float","left");
			$(".serve-li-1 .serve-ico").css("position","relative");
			$(".serve-li-1 .serve-ico").css("left","-425px");
			$(".serve-li-2 .serve-ico").css("position","relative");
			$(".serve-li-2 .serve-ico").css("left","0px");
			$(".serve-li-3 .serve-ico").css("color","#47086C");
			$(".serve-li-3 .serve-ico").css("background-color","#F6F7F7");
			$(".serve-li-2 .serve-ico").css("color","#FFFFFF");
			$(".serve-li-2 .serve-ico").css("background-color","#47086C");
			$(".serve-li-1 .serve-ico").css("color","#47086C");
			$(".serve-li-1 .serve-ico").css("background-color","#F6F7F7");
			$(".serve-li .serve-ico").css("color","#47086C");
			$(".serve-li .serve-ico").css("background-color","#F6F7F7");
			$(".serve-nav .serve-li-1 .serve-cont-2").css("visibility","hidden");
			$(".serve-nav .serve-li .serve-cont-1").css("visibility","hidden");
			$(".serve-nav .serve-li-3 .serve-cont-4").css("visibility","hidden");
			$(".serve-nav .serve-li-2 .serve-cont-3").css("visibility","visible");
			
			$(".serve-nav .serve-li-2 .serve-cont-3").stop().animate({left:"-440px"},250);
			$(".serve-nav .serve-li .serve-cont-1").stop().animate({left:"-50px"},0);
			$(".serve-nav .serve-li-1 .serve-cont-2").stop().animate({left:"-480px"},0);
			$(".serve-nav .serve-li-3 .serve-cont-4").stop().animate({left:"-480px"},0);
		})
		
		//第四个li
		$(".serve-nav .serve-li-3 a").hover(function(){
			$(".serve-li .serve-ico").css("float","left");
			$(".serve-li-1 .serve-ico").css("position","relative");
			$(".serve-li-1 .serve-ico").css("left","-425px");
			$(".serve-li-2 .serve-ico").css("position","relative");
			$(".serve-li-2 .serve-ico").css("left","-425px");
			$(".serve-li-3 .serve-ico").css("color","#FFFFFF");
			$(".serve-li-3 .serve-ico").css("background-color","#47086C");
			$(".serve-li-2 .serve-ico").css("color","#47086C");
			$(".serve-li-2 .serve-ico").css("background-color","#F6F7F7");
			$(".serve-li-1 .serve-ico").css("color","#47086C");
			$(".serve-li-1 .serve-ico").css("background-color","#F6F7F7");
			$(".serve-li .serve-ico").css("color","#47086C");
			$(".serve-li .serve-ico").css("background-color","#F6F7F7");
			$(".serve-nav .serve-li-1 .serve-cont-2").css("visibility","hidden");
			$(".serve-nav .serve-li .serve-cont-1").css("visibility","hidden");
			$(".serve-nav .serve-li-2 .serve-cont-3").css("visibility","hidden");
			$(".serve-nav .serve-li-3 .serve-cont-4").css("visibility","visible");
			
			$(".serve-nav .serve-li-3 .serve-cont-4").stop().animate({left:"-440px"},250);
			$(".serve-nav .serve-li .serve-cont-1").stop().animate({left:"-50px"},0);
			$(".serve-nav .serve-li-2 .serve-cont-3").stop().animate({left:"-480px"},0);
			$(".serve-nav .serve-li-1 .serve-cont-2").stop().animate({left:"-480px"},0);
		})
		
	</script>
	
	<script>
		var wh = 0;
		var arrays = 0;
		var values = 0;
		/* //网点查询向上滑出
		$(".serve-nav").hover(function(){
			var he = $(window).height();
			var gh = $(window).scrollTop();
			wh = he+gh;
			//alert(wh)
			arrays = wh-350;
			if (gh<=118) {
				$(".border-nav").stop().animate({top:arrays},400);
			}
		},function(){
			$(".border-nav").stop().animate({top:"490px"},400);
		}); */
		
		//获取下拉像素改变选项栏样式
		
		
		//在线客服滑出
		$(".service").hover(function(){
			$(this).animate({right:"-60"},1);
		},function(){
			$(this).animate({right:"-135"},1);
		});
		
		//关闭扫码
		$(".floating-window-close").click(function(){
			$(".floating-window").removeClass("floating-window");
		});
		
		//运单号查询或者手机号查询
		$(function() {
			$(".search-warpper .title div:eq(1)").click(function() {
				$(".search-warpper .border").css("display", "none");
				$(".search-warpper .phone-box").css("display", "block");
				$(this).css("color", "#47086c");
				$(this).css("font-weight", "700");
				$(".search-warpper .title div:eq(0)").css("color", "#212529");
				$(".search-warpper .title div:eq(0)").css("font-weight", "400");
				
			});
			$(".search-warpper .title div:eq(0)").click(function() {
				$(".search-warpper .border").css("display", "block");
				$(".search-warpper .phone-box").css("display", "none");
				$(this).css("color", "#47086c");
				$(this).css("font-weight", "700");
				$(".search-warpper .title div:eq(1)").css("color", "#212529");
				$(".search-warpper .title div:eq(1)").css("font-weight", "400");
				
			});
		})
	</script>
	<!-- 图片 -->
	<script>
		var index = 0;
		var lb = true;
		$(function() {
			$('.el-carousel__indicators li button').prop("class", "bianduan");
			$('.el-carousel__indicators li button').eq(index).prop("class", "bianchang");
			$('.el-carousel__indicators li button').hover(
				function() {
					$(this).parent().siblings().children("button").prop("class", "bianduan");
					$(this).prop("class", "bianchang");
					indexs = $(this).parent().index();
					$('.carousel').carousel(indexs);
				}
			);
			$(".carousel-control-prev").click(function() {
				lb = false;
				$('.el-carousel__indicators li button').eq(index).parent().siblings().children("button").prop("class", "bianduan");
				$('.el-carousel__indicators li button').eq(index).prop("class", "bianchang");
			})
	
			$(".carousel-control-next").click(function() {
				lb = true;
				$('.el-carousel__indicators li button').eq(index).parent().siblings().children("button").prop("class", "bianduan");
				$('.el-carousel__indicators li button').eq(index).prop("class", "bianchang");
	
			})
		});
	
		$('#carouselExampleControls').on('slide.bs.carousel', function() {
			if(lb) {
				index += 1;
			} else {
				index -= 1;
			}
	
			if(index > 3) {
				index = 0;
			}
			if(index < 0) {
				index = 3;
			}
			$('.el-carousel__indicators li button').eq(index).parent().siblings().children("button").prop("class", "bianduan");
			$('.el-carousel__indicators li button').eq(index).prop("class", "bianchang");
			lb = true;
		});
	</script>
	
	<script type="text/javascript">
		$(".pop-modal-bottom").css("display", "none");
		$(".top-nav-item.mobile").hover(function() {
			$(".pop-modal-bottom").show();
		}, function() {
			$(".pop-modal-bottom").hide();
		})
		$(".pop-modal-bottom1").css("display", "none");
		$(".nav-item.hover-modal2").hover(function() {
			$(".pop-modal-bottom1").show();
		}, function() {
			$(".pop-modal-bottom1").hide();
		})
		$(".pop-modal-bottom2").css("display", "none");
		$(".nav-item.hover-modal3").hover(function() {
			$(".pop-modal-bottom2").show();
		}, function() {
			$(".pop-modal-bottom2").hide();
		})
		$(".pop-modal-bottom3").css("display", "none");
		$(".nav-item.hover-modal4").hover(function() {
			$(".pop-modal-bottom3").show();
		}, function() {
			$(".pop-modal-bottom3").hide();
		})
		$(".pop-modal-bottom4").css("display", "none");
		$(".nav-item.hover-modal5").hover(function() {
			$(".pop-modal-bottom4").show();
		}, function() {
			$(".pop-modal-bottom4").hide();
		})
		$(".pop-modal-bottom5").css("display", "none");
		$(".nav-item.hover-modal6").hover(function() {
			$(".pop-modal-bottom5").show();
		}, function() {
			$(".pop-modal-bottom5").hide();
		})
	</script>
<!-- 运单，手机号查询 -->
	<script>
		let onumber;
		$(function(){
			$(".yundan").click(function(){
				$(".yundan").css("background","#47086c");
				$(".yundan").css("color","#fff");
				$(".shouji").css("background","#f0f1f1");
				$(".shouji").css("color","#898989");
				$(".el-textarea").show();
				$(".el-input").hide();
				var text=$(".el-textarea_tx").val();
				if(text==''){
					$('.xianshi').hide();
				}else{
					$('.xianshi').show();
				}
			})
		})
		$(function(){
			$(".shouji").click(function(){
				$(".shouji").css("background","#47086c");
				$(".shouji").css("color","#fff");
				$(".yundan").css("background","#f0f1f1");
				$(".yundan").css("color","#898989");
				$(".el-textarea").hide();
				$(".el-input").show();
				$('.xianshi').hide();
			})
		})
		/* 点击查询弹出提示框 */
		$(function(){
			$(".chaxun_a").click(function(){
				var text=$(".el-textarea_tx").val();
				if(text==''){
					alert('请在先输入运单号');
					$('.xianshi').hide();
				}else{
					$('.xianshi').show();
					$.ajax({
						url:'../logisticsInfo/selectwnumber',
						type:'get',
						data:"wnumber="+$(".el-textarea_tx").val(),
						dataType:'json',
						success:function (res) {

							$(".xianshi").text("");

							$(".xianshi").append("<div class=\"qianshou\">\n" +
									"\t\t\t\t<p>\n" +
									"\t\t\t\t<span class=\"mr-a\">运单号："+res[0].wnumber+"</span>\n" +
									"\t\t<span class=\"mr-b\">"+res[0].wtime+"</span>\n" +
									"\t\t\t\t<span class=\"mr-c\"></span>\n" +
									"\t\t<span>已签收</span>\n" +
									"\t\t</p>\n" +
									"\t\t<p>\n" +
									"\t\t<span class=\"mr-d\">"+res[0].wtime+"</span>\n" +
									"\t\t\t\t<span class=\"mr-e\"></span>\n" +
									"\t\t<span class=\"mr-f\">客户签收人: 本人签收 已签收  感谢使用圆通速递，期待再次为您服务 如有疑问请联系：18390937580，投诉电话：0731-82563323</span>\n" +
									"\t\t<span class=\"mr-g\">收起详情</span>\n" +
									"\t\t\t\t</p>\n" +
									"\t\t\t\t</div>\n" +
									"\t\t<table class=\"table_xq\" style=\" margin-left: 38px;\">\n" +
									"\t\t\t\t<tr style=\"width: 798px; min-height: 28px;\">\n" +
									"\t\t\t\t<td valign=\"top\" style=\"width: 200px; min-height: 28px;\">\n" +
									"\t\t\t\t<span style=\"color: #727171; font-size: 18px;\">"+res[0].wtime+"</span>\n" +
									"\t\t\t\t<span style=\"margin-left: 8px; color: #727171; font-size: 18px;\"></span>\n" +
									"\t\t</td>\n" +
									"\t\t<td valign=\"top\" style=\"width: 585px; min-height: 28px;\">\n" +
									"\t\t\t\t<span style=\"color: #727171; font-size: 18px;\">\n" +
									"\t\t\t\t"+res[0].winfo+" 已收入\n" +
									"\t\t</span>\n" +
									"\t\t</td>\n" +
									"\t\t</tr>\n" +
									"\t\t<tr style=\"width: 798px; min-height: 28px;\">\n" +
									"\t\t\t\t<td valign=\"top\" style=\"width: 200px; min-height: 28px;\">\n" +
									"\t\t\t\t<span style=\"color: #727171; font-size: 18px;\">"+res[0].wtime+"</span>\n" +
									"\t\t\t\t<span style=\"margin-left: 8px; color: #727171; font-size: 18px;\"></span>\n" +
									"\t\t</td>\n" +
									"\t\t<td valign=\"top\" style=\"width: 585px; min-height: 28px;\">\n" +
									"\t\t\t\t<span style=\"color: #727171; font-size: 18px;\">\n" +
									"\t\t\t\t "+res[0].winfo+" 已发出  下一站 "+res[0].winfo+"\n" +
									"\t\t</span>\n" +
									"\t\t</td>\n" +
									"\t\t</tr>\n" +
									"\t\t<tr style=\"width: 798px; min-height: 28px;\">\n" +
									"\t\t\t\t<td valign=\"top\" style=\"width: 200px; min-height: 28px;\">\n" +
									"\t\t\t\t<span style=\"color: #727171; font-size: 18px;\">"+res[0].wtime+"</span>\n" +
									"\t\t\t\t<span style=\"margin-left: 8px; color: #727171; font-size: 18px;\"></span>\n" +
									"\t\t</td>\n" +
									"\t\t<td valign=\"top\" style=\"width: 585px; min-height: 28px;\">\n" +
									"\t\t\t\t<span style=\"color: #727171; font-size: 18px;\">\n" +
									"\t\t\t\t "+res[0].winfo+"已收取   客户已签收  感谢使用圆通速递，期待再次为您服务 如有疑问请联系：18390937580，投诉电话：0731-82563323\n" +
									"\t\t</span>\n" +
									"\t\t</td>\n" +
									"\t\t</tr>")

						},
					});

				}
			})
		})











		/* 文本域 */
		$('textarea').click(function(){
			$(this).css("border","1px solid #47086c");
		});
		$('textarea').blur(function(){
			$(this).css("border-color","#dcdfe6");
		});
		
		/* 输入框 */
		$('.one_a').focus(function(){
			var name=$('.one_a').val();
			if(name.length==0){
				$('.tishi_one').show();
				$('.input_one').css("margin-bottom","0px");
				$('.one_a').css("border","1px solid #f56c6c");
				$(".tishi_one").html("不能为空");
			}else if(name.length>0&&name.length<11){
				$('.tishi_one').show();
				$('.input_one').css("margin-bottom","0px");
				$('.one_a').css("border","1px solid #f56c6c");
				$(".tishi_one").html("手机号格式不正确");
			}else if(name.length==11){
				$('.tishi_one').hide();
				$('.input_one').css("margin-bottom","22px");
				$('.one_a').css("border","1px solid #ababab");
			}
	
		});
		$('.one_a').blur(function(){
			var name=$('.one_a').val();
			var text = $(".tishi_one").html();
			if(name.length==0){
				$('.tishi_one').show();
				$('.input_one').css("margin-bottom","0px");
				$('.one_a').css("border","1px solid #f56c6c");
				$(".tishi_one").html("不能为空");
			}else if(name.length>0&&name.length<11){
				$('.tishi_one').show();
				$('.input_one').css("margin-bottom","0px");
				$('.one_a').css("border","1px solid #f56c6c");
				$(".tishi_one").html("手机号格式不正确");
			}else if(name.length==11){
				$('.tishi_one').hide();
				$('.input_one').css("margin-bottom","22px");
				$('.one_a').css("border","1px solid #ababab");
			}
		});
		/* ----- */
		$('.two_a').focus(function(){
			var name=$('.two_a').val();
			if(name.length==0){
				$('.tishi_two').show();
				$('.input_two').css("margin-bottom","0px");
				$('.two_a').css("border","1px solid #f56c6c");
			}else if(name.length>0){
				$('.tishi_two').hide();
				$('.input_two').css("margin-bottom","22px");
				$('.two_a').css("border","1px solid #ababab");
			}
			
		});
		$('.two_a').blur(function(){
			var name=$('.two_a').val();
			if(name.length==0){
				$('.tishi_two').show();
				$('.input_two').css("margin-bottom","0px");
				$('.two_a').css("border","1px solid #f56c6c");
			}else if(name.length>0){
				$('.tishi_two').hide();
				$('.input_two').css("margin-bottom","22px");
				$('.two_a').css("border","1px solid #ababab");
			}
		});
		/* ------ */
		$('.there_a').focus(function(){
			var name=$('.there_a').val();
			if(name.length==0){
				$('.tishi_there').show();
				$('.there_all').css("margin-bottom","0px");
				$('.there_a').css("border","1px solid #f56c6c");
			}else if(name.length>0){
				$('.tishi_there').hide();
				$('.there_all').css("margin-bottom","22px");
				$('.there_a').css("border","1px solid #ababab");
			}
			
		});
		$('.there_a').blur(function(){
			var name=$('.there_a').val();
			if(name.length==0){
				$('.tishi_there').show();
				$('.there_all').css("margin-bottom","0px");
				$('.there_a').css("border","1px solid #f56c6c");
			}else if(name.length>0){
				$('.tishi_there').hide();
				$('.there_all').css("margin-bottom","22px");
				$('.there_a').css("border","1px solid #ababab");
			}
		});
		/* 详情 */
		$(function(){
		       $(".mr-g").click(function(){
		           $(".table_xq").fadeToggle(250);
		       })
		   })
		$(".mr-g").on("click",function(){
			var texts = $(".mr-g").html();
			/* alert(texts); */
			    if(texts=="收起详情"){
			        $(".mr-g").html("展开详情");
			    }else if(texts=="展开详情"){
			        $(".mr-g").html("收起详情");
			    }
		});
	</script>
</html>
