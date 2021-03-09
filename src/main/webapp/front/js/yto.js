function select(eq) {
	var sheng = $(".serve-cont-2 .select-box-wrapper:eq(0) .select-box-input").attr("sheng");
	$(".input-select-box.active").attr("style", "display: none;");
	$(".serve-cont-2 .select-box-wrapper:eq(0) .select-box-input").val(sheng + "-" + $(eq).text());
}

function selects(eq) {
	var shengs = $(".serve-cont-2 .select-box-wrapper:eq(1) .select-box-input").attr("shengs");
	$(".input-select-box.active").attr("style", "display: none;");
	$(".serve-cont-2 .select-box-wrapper:eq(1) .select-box-input").val(shengs + "-" + $(eq).text());
}

time = setInterval("showAuto()", 5000);
var result = 0;
var index = 0;
var lunbowidth = -1230;

function showAuto() {
	if(result != lunbowidth) {
		result = result - 615;
		$(".nav-item-2460").animate({
			left: result + "px"
		}, 300);
		$(".nav-item-3075").animate({
			left: result + "px"
		}, 300);
	} else {
		result = 0;
		$(".nav-item-2460").animate({
			left: result + "px"
		}, 300);
		$(".nav-item-3075").animate({
			left: result + "px"
		}, 300);
	}

}

$(function() {
	$('body').click(function(e) {
		if(!$(e.target).closest('.select-box-input,.input-select-box.active').length) {
			$(".input-select-box.active").hide();
		}
	});

	var index = 0;
	var shiqu = [
		["密云区", "东城区", "西城区", "朝阳区", "丰台区", "石景山区", "海淀区", "门头沟区", "房山区", "通州区", "顺义区", "昌平区", "大兴区", "怀柔区", "平谷区", "延庆区"],
		["黄浦区", "徐汇区", "长宁区", "静安区", "普陀区", "虹口区", "杨浦区", "闵行区", "宝山区", "嘉定区", "浦东新区", "金山区", "松江区", "青浦区", "奉贤区", "崇明区"],
		["宝坻区", "宁河区", "静海区", "蓟州区", "滨海新区", "和平区", "河东区", "河西区", "南开区", "河北区", "红桥区", "东丽区", "东丽区", "津南区", "北辰区", "武清区"],
		["南京市", "无锡市", "徐州市", "常州市", "苏州市", "南通市", "连云港市", "淮安市", "盐城市", "扬州市", "镇江市", "泰州市", "宿迁市"],
		["杭州市", "宁波市", "温州市", "嘉兴市", "湖州市", "绍兴市", "金华市", "衢州市", "舟山市", "台州市", "丽水市"],
		["东莞市", "中山市", "肇庆市", "惠州市", "梅州市", "汕尾市", "河源市", "阳江市", "清远市", "潮州市", "揭阳市", "云浮市", "广州市", "韶关市", "深圳市", "珠海市", "汕头市", "佛山市", "江门市", "湛江市", "茂名市"]
	];

	var shiqus = [
		["密云区", "东城区", "西城区", "朝阳区", "丰台区", "石景山区", "海淀区", "门头沟区", "房山区", "通州区", "顺义区", "昌平区", "大兴区", "怀柔区", "平谷区", "延庆区"],
		["黄浦区", "徐汇区", "长宁区", "静安区", "普陀区", "虹口区", "杨浦区", "闵行区", "宝山区", "嘉定区", "浦东新区", "金山区", "松江区", "青浦区", "奉贤区", "崇明区"],
		["宝坻区", "宁河区", "静海区", "蓟州区", "滨海新区", "和平区", "河东区", "河西区", "南开区", "河北区", "红桥区", "东丽区", "东丽区", "津南区", "北辰区", "武清区"],
		["江津区", "綦江区", "永川区", "大足区", "渝北区", "巴南区", "长寿区", "石柱土家族自治县", "秀山土家族苗族自治县", "酉阳土家族苗族自治县", "彭水苗族土家族自治县", "云阳县", "奉节县",
			"巫山县", "巫溪县", "铜梁区", "万州区", "涪陵区", "渝中区", "南川区", "城口县", "丰都县", "垫江县", "忠县", "开州区", "武隆区", "荣昌区", "梁平区", "潼南区", "黔江区", "璧山区",
			"大渡口区", "江北区", "沙坪坝区", "九龙坡区", "南岸区", "北碚区", "合川区"
		],
		["石家庄市", "唐山市", "秦皇岛市", "邯郸市", "邢台市", "保定市", "张家口市", "承德市", "沧州市", "廊坊市", "衡水市"],
		["忻州市", "临汾市", "吕梁市", "太原市", "大同市", "阳泉市", "长治市", "晋城市", "朔州市", "晋中市", "运城市"],
		["呼和浩特市", "鄂尔多斯市", "呼伦贝尔市", "巴彦淖尔市", "乌兰察布市", "兴安盟", "锡林郭勒盟", "阿拉善盟", "包头市", "乌海市", "赤峰市", "通辽市"],
		["沈阳市", "大连市", "鞍山市", "抚顺市", "本溪市", "丹东市", "锦州市", "营口市", "辽阳市", "盘锦市", "铁岭市", "朝阳市", "葫芦岛市"],
		["长春市", "吉林市", "四平市", "辽源市", "通化市", "白山市", "松原市", "白城市", "延边朝鲜族自治州"],
		["鹤岗市", "双鸭山市", "大庆市", "伊春市", "佳木斯市", "七台河市", "牡丹江市", "黑河市", "绥化市", "大兴安岭地区", "哈尔滨市", "齐齐哈尔市", "鸡西市"],
		["南京市", "无锡市", "徐州市", "常州市", "苏州市", "南通市", "连云港市", "淮安市", "盐城市", "扬州市", "镇江市", "泰州市", "宿迁市"],
		["杭州市", "宁波市", "温州市", "嘉兴市", "湖州市", "绍兴市", "金华市", "衢州市", "舟山市", "台州市", "丽水市"],
		["亳州市", "池州市", "宣城市", "合肥市", "芜湖市", "蚌埠市", "淮南市", "马鞍山市", "淮北市", "铜陵市", "安庆市", "黄山市", "滁州市", "阜阳市", "宿州市", "六安市"],
		["福州市", "厦门市", "莆田市", "三明市", "泉州市", "漳州市", "南平市", "龙岩市", "宁德市"],
		["上饶市", "南昌市", "景德镇市", "萍乡市", "九江市", "新余市", "鹰潭市", "赣州市", "吉安市", "宜春市", "抚州市"],
		["济南市", "青岛市", "淄博市", "枣庄市", "东营市", "烟台市", "潍坊市", "济宁市", "滨州市", "菏泽市", "泰安市", "威海市", "日照市", "临沂市", "德州市", "聊城市"],
		["信阳市", "周口市", "驻马店市", "省直辖县级行政区划", "郑州市", "开封市", "洛阳市", "平顶山市", "安阳市", "鹤壁市", "新乡市", "焦作市", "濮阳市", "许昌市", "漯河市", "三门峡市", "南阳市", "商丘市"],
		["武汉市", "黄石市", "十堰市", "宜昌市", "襄阳市", "鄂州市", "咸宁市", "随州市", "恩施土家族苗族自治州", "省直辖县级行政区划", "荆门市", "孝感市", "荆州市", "黄冈市"],
		["邵阳市", "岳阳市", "常德市", "张家界市", "郴州市", "永州市", "怀化市", "娄底市", "湘西土家族苗族自治州", "长沙市", "衡阳市", "益阳市", "株洲市", "湘潭市"],
		["东莞市", "中山市", "肇庆市", "惠州市", "梅州市", "汕尾市", "河源市", "阳江市", "清远市", "潮州市", "揭阳市", "云浮市", "广州市", "韶关市", "深圳市", "珠海市", "汕头市", "佛山市",
			"江门市", "湛江市", "茂名市"
		],
		["南宁市", "柳州市", "桂林市", "梧州市", "北海市", "防城港市", "钦州市", "贵港市", "玉林市", "百色市", "贺州市", "河池市", "来宾市", "崇左市"],
		["三亚市", "三沙市", "海口市", "省直辖县级行政区划", "儋州市"],
		["成都市", "自贡市", "攀枝花市", "泸州市", "德阳市", "绵阳市", "广元市", "遂宁市", "内江市", "乐山市", "南充市", "眉山市", "宜宾市", "广安市", "达州市", "雅安市", "巴中市", "资阳市",
			"阿坝藏族羌族自治州", "甘孜藏族自治州", "凉山彝族自治州"
		],
		["贵阳市", "六盘水市", "遵义市", "安顺市", "铜仁市", "黔西南布依族苗族自治州", "毕节市", "黔东南苗族侗族自治州", "黔南布依族苗族自治州"],
		["西双版纳傣族自治州", "大理白族自治州", "德宏傣族景颇族自治州", "怒江傈僳族自治州", "迪庆藏族自治州", "玉溪市", "保山市", "昭通市", "丽江市", "普洱市", "临沧市",
			"楚雄彝族自治州", "红河哈尼族彝族自治州", "文山壮族苗族自治州", "昆明市", "曲靖市"
		],
		["拉萨市", "昌都市", "山南市", "日喀则市", "阿里地区", "林芝市", "那曲市"],
		["西安市", "铜川市", "宝鸡市", "咸阳市", "渭南市", "延安市", "汉中市", "榆林市", "安康市", "商洛市"],
		["嘉峪关市", "兰州市", "金昌市", "庆阳市", "定西市", "陇南市", "临夏回族自治州", "甘南藏族自治州", "白银市", "天水市", "武威市", "张掖市", "平凉市", "酒泉市"],
		["西宁市", "海东市", "海北藏族自治州", "黄南藏族自治州", "海南藏族自治州", "果洛藏族自治州", "玉树藏族自治州", "海西蒙古族藏族自治州"],
		["银川市", "石嘴山市", "吴忠市", "固原市", "中卫市"],
		["喀什地区", "和田地区", "伊犁哈萨克自治州", "塔城地区", "阿勒泰地区", "省直辖县级行政区划", "克孜勒苏柯尔克孜自治州", "克拉玛依市", "吐鲁番市", "哈密市",
			"昌吉回族自治州", "博尔塔拉蒙古自治州", "巴音郭楞蒙古自治州", "阿克苏地区", "乌鲁木齐市"
		]
	];

	//始发地
	$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(0) li").click(function() {
		$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(2)").text("");

		$(this).siblings().attr("class", "");
		$(this).attr("class", "active");
		$(".input-select-box.active .input-select-content .select-nav li:eq(2)").siblings().attr("class", "");
		$(".input-select-box.active .input-select-content .select-nav li:eq(2)").attr("class", "active");
		$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(0)").attr("style", "display: none;");
		$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(2)").attr("style", "display: block;");

		index = parseInt($(this).attr("index"));
		for(var j = 0; j < shiqu[index].length; j++) {
			$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(2)").append("<li onclick='select(this)' class='' title=" + shiqu[index][j] + ">" + shiqu[index][j] + "</li>");
		}

		$(".serve-cont-2 .select-box-wrapper:eq(0) .select-box-input").attr("sheng", $(this).text());

	})

	$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(1) li").click(function() {
		$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(2)").text("");
		$(this).siblings().attr("class", "");
		$(this).attr("class", "active");
		$(".input-select-box.active .input-select-content .select-nav li:eq(2)").siblings().attr("class", "");
		$(".input-select-box.active .input-select-content .select-nav li:eq(2)").attr("class", "active");
		$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(1)").attr("style", "display: none;");
		$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(2)").attr("style", "display: block;");

		index = parseInt($(this).attr("indexs"));
		for(var t = 0; t < shiqus[index].length; t++) {
			$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(2)").append("<li onclick='select(this)' class='' title=" + shiqus[index][t] + ">" + shiqus[index][t] + "</li>");
		}

		$(".serve-cont-2 .select-box-wrapper:eq(0) .select-box-input").attr("sheng", $(this).text());
	})

	$(".input-select-box.active .input-select-content .select-nav li:eq(0)").click(function() {
		$(this).siblings().attr("class", "");
		$(this).attr("class", "active");
		$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(0)").attr("style", "display: block;");
		$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(1)").attr("style", "display: none;");
		$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(2)").attr("style", "display: none;");
		$(".serve-cont-2 .select-box-wrapper:eq(0) .select-box-input").val($(this).text());
	})

	$(".input-select-box.active .input-select-content .select-nav li:eq(1)").click(function() {
		$(this).siblings().attr("class", "");
		$(this).attr("class", "active");
		$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(0)").attr("style", "display: none;");
		$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(1)").attr("style", "display: block;");
		$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(2)").attr("style", "display: none;");
		$(".serve-cont-2 .select-box-wrapper:eq(0) .select-box-input").val($(this).text());
	})

	$(".input-select-box.active .input-select-content .select-nav li:eq(2)").click(function() {
		$(this).siblings().attr("class", "");
		$(this).attr("class", "active");
		$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(0)").attr("style", "display: none;");
		$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(1)").attr("style", "display: none;");
		$(".input-select-box.active .input-select-content .select-content .select-content-item:eq(2)").attr("style", "display: block;");
		$(".serve-cont-2 .select-box-wrapper:eq(0) .select-box-input").val($(this).text());
	})

	//目的地
	$(".input-select-box.active:eq(1) .input-select-content .select-content .select-content-item:eq(0) li").click(function() {
		$(".input-select-box.active:eq(1) .input-select-content .select-content .select-content-item:eq(2)").text("");
		$(this).siblings().attr("class", "");
		$(this).attr("class", "active");
		$(".input-select-box.active:eq(1) .input-select-content .select-nav li:eq(2)").siblings().attr("class", "");
		$(".input-select-box.active:eq(1) .input-select-content .select-nav li:eq(2)").attr("class", "active");
		$(".input-select-box.active:eq(1) .input-select-content .select-content .select-content-item:eq(0)").attr("style", "display: none;");
		$(".input-select-box.active:eq(1) .input-select-content .select-content .select-content-item:eq(2)").attr("style", "display: block;")

		index = parseInt($(this).attr("index"));
		for(var i = 0; i < shiqu[index].length; i++) {
			$(".input-select-box.active:eq(1) .input-select-content .select-content .select-content-item:eq(2)").append("<li onclick='selects(this)' class='' title=" + shiqu[index][i] + ">" + shiqu[index][i] + "</li>");
		}

		$(".serve-cont-2 .select-box-wrapper:eq(1) .select-box-input").attr("shengs", $(this).text());
	})

	$(".input-select-box.active:eq(1) .input-select-content .select-content .select-content-item:eq(1) li").click(function() {
		$(".input-select-box.active:eq(1) .input-select-content .select-content .select-content-item:eq(2)").text("");
		$(this).siblings().attr("class", "");
		$(this).attr("class", "active");
		$(".input-select-box.active:eq(1) .input-select-content .select-nav li:eq(2)").siblings().attr("class", "");
		$(".input-select-box.active:eq(1) .input-select-content .select-nav li:eq(2)").attr("class", "active");
		$(".input-select-box.active:eq(1) .input-select-content .select-content .select-content-item:eq(1)").attr("style", "display: none;");
		$(".input-select-box.active:eq(1) .input-select-content .select-content .select-content-item:eq(2)").attr("style", "display: block;");

		index = parseInt($(this).attr("indexs"));
		for(var r = 0; r < shiqus[index].length; r++) {
			$(".input-select-box.active:eq(1) .input-select-content .select-content .select-content-item:eq(2)").append("<li onclick='selects(this)' class='' title=" + shiqus[index][r] + ">" + shiqus[index][r] + "</li>");
		}

		$(".serve-cont-2 .select-box-wrapper:eq(1) .select-box-input").attr("shengs", $(this).text());
	})

	$(".input-select-box.active:eq(1) .input-select-content .select-nav li:eq(0)").click(function() {
		$(this).siblings().attr("class", "");
		$(this).attr("class", "active");
		$(this).parent().siblings("div").find("ul:eq(0)").attr("style", "display: block;");
		$(this).parent().siblings("div").find("ul:eq(1)").attr("style", "display: none;");
		$(this).parent().siblings("div").find("ul:eq(2)").attr("style", "display: none;");
		$(".serve-cont-2 .select-box-wrapper:eq(1) .select-box-input").val($(this).text());
	})

	$(".input-select-box.active:eq(1) .input-select-content .select-nav li:eq(1)").click(function() {
		$(this).siblings().attr("class", "");
		$(this).attr("class", "active");
		$(this).parent().siblings("div").find("ul:eq(0)").attr("style", "display: none;");
		$(this).parent().siblings("div").find("ul:eq(1)").attr("style", "display: block;");
		$(this).parent().siblings("div").find("ul:eq(2)").attr("style", "display: none;");
		$(".serve-cont-2 .select-box-wrapper:eq(1) .select-box-input").val($(this).text());
	})

	$(".input-select-box.active:eq(1) .input-select-content .select-nav li:eq(2)").click(function() {
		$(this).siblings().attr("class", "");
		$(this).attr("class", "active");
		$(this).parent().siblings("div").find("ul:eq(0)").attr("style", "display: none;");
		$(this).parent().siblings("div").find("ul:eq(1)").attr("style", "display: none;");
		$(this).parent().siblings("div").find("ul:eq(2)").attr("style", "display: block;");
		$(".serve-cont-2 .select-box-wrapper:eq(1) .select-box-input").val($(this).text());
	})

	$(".serve-cont-2 .select-box-wrapper:eq(0) .select-box-input").click(function() {
		$(".serve-cont-2 .select-box-wrapper .input-select-box.active:eq(0)").show();
		$(".serve-cont-2 .select-box-wrapper .input-select-box.active:eq(1)").hide();
	});

	$(".serve-cont-2 .select-box-wrapper:eq(1) .select-box-input").click(function() {
		$(".serve-cont-2 .select-box-wrapper .input-select-box.active:eq(1)").show();
		$(".serve-cont-2 .select-box-wrapper .input-select-box.active:eq(0)").hide();
	});

	$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(0)").hover(function() {
		$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(0) .pop-modal").css("display", "block");
	}, function() {
		$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(0) .pop-modal").css("display", "none");
	})
	$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(1)").hover(function() {
		$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(1) .pop-modal").css("display", "block");
	}, function() {
		$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(1) .pop-modal").css("display", "none");
	})
	$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(2)").hover(function() {
		$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(2) .pop-modal").css("display", "block");
	}, function() {
		$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(2) .pop-modal").css("display", "none");
	})
	$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(3)").hover(function() {
		$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(3) .pop-modal").css("display", "block");
	}, function() {
		$(".foot_wrap-pc .bottom-nav .contact .qr-wrapper li:eq(3) .pop-modal").css("display", "none");
	})

	var val = 0;
	$(".swiper-btn-wrapper-3 .fr").click(function() {
		if(val != -800) {
			val = val - 400;
			$(".news-swiper.news .swiper-container .swiper-wrapper").animate({
				left: val + "px"
			}, 300);
		}
	})

	$(".swiper-btn-wrapper-3 .fl").click(function() {
		if(val != 0) {
			val = val + 400;
			$(".news-swiper.news .swiper-container .swiper-wrapper").animate({
				left: val + "px"
			}, 300);
		}
	})

	$(".news.new .w1200 .news-nav .nav-item.new").hover(function() {
		val = 0;
		$(".news-swiper.news .swiper-container .swiper-wrapper").animate({
			left: val + "px"
		}, 0);
		$(".news.new .w1200 .news-nav .nav-item.sliding").animate({
			left: "0px"
		}, 30);
		$(".news.new .w1200 .news-nav .nav-item.new .title").animate({
			left: "20px"
		}, 30);
		$(".news.new .w1200 .news-nav .nav-item.new .title").css("color", "#fff");
		$(".news.new .w1200 .news-nav .nav-item.new .more.new").css("display", "block");

		$(".news.new .w1200 .news-nav .nav-item.status .title").animate({
			left: "160px"
		}, 30);
		$(".news.new .w1200 .news-nav .nav-item.status .title").css("color", "#898989");
		$(".news.new .w1200 .news-nav .nav-item.status .more.status").css("display", "none");

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

	$(".news.new .w1200 .news-nav .nav-item.status").hover(function() {
		val = 0;
		$(".news-swiper.news .swiper-container .swiper-wrapper").animate({
			left: val + "px"
		}, 0);
		$(".news.new .w1200 .news-nav .nav-item.sliding").animate({
			left: "600px"
		}, 30);
		$(".news.new .w1200 .news-nav .nav-item.new .title").animate({
			left: "160px"
		}, 30);
		$(".news.new .w1200 .news-nav .nav-item.new .title").css("color", "#898989");
		$(".news.new .w1200 .news-nav .nav-item.new .more.new").css("display", "none");

		$(".news.new .w1200 .news-nav .nav-item.status .title").animate({
			left: "20px"
		}, 30);
		$(".news.new .w1200 .news-nav .nav-item.status .title").css("color", "#fff");
		$(".news.new .w1200 .news-nav .nav-item.status .more.status").css("display", "block");

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

	$(".swiper-btn-wrapper i.fl").click(function() {
		if(result != 0) {
			result = result + 615;
			$(".nav-item-2460").animate({
				left: result + "px"
			}, 300);
			$(".nav-item-3075").animate({
				left: result + "px"
			}, 300);
		}

		clearTimeout(time);
		time = setInterval("showAuto()", 5000);
	})

	$(".swiper-btn-wrapper i.fr").click(function() {
		if(result != lunbowidth) {
			result = result - 615;
			$(".nav-item-2460").animate({
				left: result + "px"
			}, 300);
			$(".nav-item-3075").animate({
				left: result + "px"
			}, 300);
		}

		clearTimeout(time);
		time = setInterval("showAuto()", 5000);
	})

	$(".nav-item.time").hover(function() {
		lunbowidth = -1230;
		index = 0;
		result = 0;
		$(".nav-item-2460").animate({
			left: result + "px"
		}, 300);
		$(".nav-item-3075").animate({
			left: result + "px"
		}, 300);
		$(".news.add .w1200 .news-nav .nav-item.sliding").animate({
			left: "0px"
		}, 30);
		$(this).css("color", "white");
		$(".nav-item.add").css("color", "#898989");
		$(".nav-item.special").css("color", "#898989");

		$(".nav-item-3075").prop("class", "nav-item-2460");
		$(".nav-item-2460 div:eq(4)").remove();

		$(".nav-item-615:eq(0) img").attr("src", "img/time1-1.jpg");
		$(".nav-item-615:eq(1) img").attr("src", "img/time1-2.jpg");
		$(".nav-item-615-2:eq(0) img").attr("src", "img/time1-4.jpg");
		$(".nav-item-615-2:eq(1) img").attr("src", "img/time1-3.jpg");
		$(".nav-item-615:eq(0) h3").text("即日达");
		$(".nav-item-615:eq(1) h3").text("次日达");
		$(".nav-item-615-2:eq(0) h3").text("三日达");
		$(".nav-item-615-2:eq(1) h3").text("隔日达");

		clearTimeout(time);
		time = setInterval("showAuto()", 5000);
	})

	$(".nav-item.add").hover(function() {
		lunbowidth = -1230;
		index = 1;
		result = 0;
		$(".nav-item-2460").animate({
			left: result + "px"
		}, 300);
		$(".nav-item-3075").animate({
			left: result + "px"
		}, 300);
		$(".news.add .w1200 .news-nav .nav-item.sliding").animate({
			left: "400px"
		}, 30);
		$(this).css("color", "white");
		$(".nav-item.time").css("color", "#898989");
		$(".nav-item.special").css("color", "#898989");

		$(".nav-item-3075").prop("class", "nav-item-2460");
		$(".nav-item-2460 div:eq(4)").remove();

		$(".nav-item-615:eq(0) img").attr("src", "img/time2-1.jpg");
		$(".nav-item-615:eq(1) img").attr("src", "img/time2-2.jpg");
		$(".nav-item-615-2:eq(0) img").attr("src", "img/time2-4.jpg");
		$(".nav-item-615-2:eq(1) img").attr("src", "img/time2-3.jpg");
		$(".nav-item-615:eq(0) h3").text("保价服务");
		$(".nav-item-615:eq(1) h3").text("代收货款");
		$(".nav-item-615-2:eq(0) h3").text("签单返还");
		$(".nav-item-615-2:eq(1) h3").text("代取件");

		clearTimeout(time);
		time = setInterval("showAuto()", 5000);
	})

	$(".nav-item.special").hover(function() {
		index = 2;
		result = 0;
		lunbowidth = -1845;
		$(".nav-item-2460").animate({
			left: result + "px"
		}, 300);
		$(".nav-item-3075").animate({
			left: result + "px"
		}, 300);
		$(".news.add .w1200 .news-nav .nav-item.sliding").animate({
			left: "800px"
		}, 30);
		$(this).css("color", "white");
		$(".nav-item.time").css("color", "#898989");
		$(".nav-item.add").css("color", "#898989");

		$(".nav-item-2460").prop("class", "nav-item-3075");
		$(".nav-item-3075").append("<div style='float: right; width: 615px; height: 305px;'><img src='img/time3-3.jpg' /><h3 style='font-size: 28px;color: #424242;font-weight: 300;line-height: 1;margin: 35px 0 15px;'>圆通云仓</h3></div>");
		$(".nav-item-3075 div:eq(5)").remove();

		$(".nav-item-615:eq(0) img").attr("src", "img/time3-1.jpg");
		$(".nav-item-615:eq(1) img").attr("src", "img/time3-2.jpg");
		$(".nav-item-615-2:eq(0) img").attr("src", "img/time3-5.jpg");
		$(".nav-item-615-2:eq(1) img").attr("src", "img/time3-4.jpg");
		$(".nav-item-615:eq(0) h3").text("特色经济");
		$(".nav-item-615:eq(1) h3").text("e城e品");
		$(".nav-item-615-2:eq(0) h3").text("定制服务");
		$(".nav-item-615-2:eq(1) h3").text("圆通冷运");

		clearTimeout(time);
		time = setInterval("showAuto()", 5000);
	})

	$(".serve-cont-3 .input-wrapper .select-box-input").val("湖南省长沙市");
	$(".serve-cont-3 .input-wrapper .btn-wrapper .icon-drop").click(function() {
		$(".serve-cont-3 .input-wrapper .select-box-input").val("");
		$(this).html('&#xe731;');
		$(this).css("font-size", "25px");
		$(this).css("margin-left", "-11px");
	});
	//第一个li
	$(".serve-nav .serve-li a").hover(function() {
		$(".serve-li .serve-ico").css("float", "right");
		$(".serve-li-1 .serve-ico").css("position", "relative");
		$(".serve-li-1 .serve-ico").css("left", "0px");
		$(".serve-li-2 .serve-ico").css("position", "relative");
		$(".serve-li-2 .serve-ico").css("left", "0px");
		$(".serve-li-3 .serve-ico").css("color", "#47086C");
		$(".serve-li-3 .serve-ico").css("background-color", "#F6F7F7");
		$(".serve-li .serve-ico").css("color", "#FFFFFF");
		$(".serve-li .serve-ico").css("background-color", "#47086C");
		$(".serve-li-1 .serve-ico").css("color", "#47086C");
		$(".serve-li-1 .serve-ico").css("background-color", "#F6F7F7");
		$(".serve-li-2 .serve-ico").css("color", "#47086C");
		$(".serve-li-2 .serve-ico").css("background-color", "#F6F7F7");
		$(".serve-nav .serve-li .serve-cont-1").css("visibility", "visible");
		$(".serve-nav .serve-li-1 .serve-cont-2").css("visibility", "hidden");
		$(".serve-nav .serve-li-2 .serve-cont-3").css("visibility", "hidden");
		$(".serve-nav .serve-li-3 .serve-cont-4").css("visibility", "hidden");

		$(".serve-nav .serve-li .serve-cont-1").stop().animate({
			left: "-10px"
		}, 250);
		$(".serve-nav .serve-li-1 .serve-cont-2").stop().animate({
			left: "-480px"
		}, 0);
		$(".serve-nav .serve-li-2 .serve-cont-3").stop().animate({
			left: "-480px"
		}, 0);
		$(".serve-nav .serve-li-3 .serve-cont-4").stop().animate({
			left: "-480px"
		}, 0);

		$(".serve-cont-2 .select-box-wrapper .input-select-box.active:eq(0)").hide();
		$(".serve-cont-2 .select-box-wrapper .input-select-box.active:eq(1)").hide();
	})

	//第二个li
	$(".serve-nav .serve-li-1 a").hover(function() {
		$(".serve-li .serve-ico").css("float", "left");
		$(".serve-li-1 .serve-ico").css("position", "relative");
		$(".serve-li-1 .serve-ico").css("left", "0px");
		$(".serve-li-2 .serve-ico").css("position", "relative");
		$(".serve-li-2 .serve-ico").css("left", "0px");
		$(".serve-li-3 .serve-ico").css("color", "#47086C");
		$(".serve-li-3 .serve-ico").css("background-color", "#F6F7F7");
		$(".serve-li-2 .serve-ico").css("color", "#47086C");
		$(".serve-li-2 .serve-ico").css("background-color", "#F6F7F7");
		$(".serve-li-1 .serve-ico").css("color", "#FFFFFF");
		$(".serve-li-1 .serve-ico").css("background-color", "#47086C");
		$(".serve-li .serve-ico").css("color", "#47086C");
		$(".serve-li .serve-ico").css("background-color", "#F6F7F7");
		$(".serve-nav .serve-li-1 .serve-cont-2").css("visibility", "visible");
		$(".serve-nav .serve-li .serve-cont-1").css("visibility", "hidden");
		$(".serve-nav .serve-li-2 .serve-cont-3").css("visibility", "hidden");
		$(".serve-nav .serve-li-3 .serve-cont-4").css("visibility", "hidden");

		$(".serve-nav .serve-li-1 .serve-cont-2").stop().animate({
			left: "-440px"
		}, 250);
		$(".serve-nav .serve-li .serve-cont-1").stop().animate({
			left: "-50px"
		}, 0);
		$(".serve-nav .serve-li-2 .serve-cont-3").stop().animate({
			left: "-480px"
		}, 0);
		$(".serve-nav .serve-li-3 .serve-cont-4").stop().animate({
			left: "-480px"
		}, 0);
	})

	//第三个li
	$(".serve-nav .serve-li-2 a").hover(function() {
		$(".serve-li .serve-ico").css("float", "left");
		$(".serve-li-1 .serve-ico").css("position", "relative");
		$(".serve-li-1 .serve-ico").css("left", "-425px");
		$(".serve-li-2 .serve-ico").css("position", "relative");
		$(".serve-li-2 .serve-ico").css("left", "0px");
		$(".serve-li-3 .serve-ico").css("color", "#47086C");
		$(".serve-li-3 .serve-ico").css("background-color", "#F6F7F7");
		$(".serve-li-2 .serve-ico").css("color", "#FFFFFF");
		$(".serve-li-2 .serve-ico").css("background-color", "#47086C");
		$(".serve-li-1 .serve-ico").css("color", "#47086C");
		$(".serve-li-1 .serve-ico").css("background-color", "#F6F7F7");
		$(".serve-li .serve-ico").css("color", "#47086C");
		$(".serve-li .serve-ico").css("background-color", "#F6F7F7");
		$(".serve-nav .serve-li-1 .serve-cont-2").css("visibility", "hidden");
		$(".serve-nav .serve-li .serve-cont-1").css("visibility", "hidden");
		$(".serve-nav .serve-li-3 .serve-cont-4").css("visibility", "hidden");
		$(".serve-nav .serve-li-2 .serve-cont-3").css("visibility", "visible");

		$(".serve-nav .serve-li-2 .serve-cont-3").stop().animate({
			left: "-440px"
		}, 250);
		$(".serve-nav .serve-li .serve-cont-1").stop().animate({
			left: "-50px"
		}, 0);
		$(".serve-nav .serve-li-1 .serve-cont-2").stop().animate({
			left: "-480px"
		}, 0);
		$(".serve-nav .serve-li-3 .serve-cont-4").stop().animate({
			left: "-480px"
		}, 0);

		$(".serve-cont-2 .select-box-wrapper .input-select-box.active:eq(0)").hide();
		$(".serve-cont-2 .select-box-wrapper .input-select-box.active:eq(1)").hide();
	})

	//第四个li
	$(".serve-nav .serve-li-3 a").hover(function() {
		$(".serve-li .serve-ico").css("float", "left");
		$(".serve-li-1 .serve-ico").css("position", "relative");
		$(".serve-li-1 .serve-ico").css("left", "-425px");
		$(".serve-li-2 .serve-ico").css("position", "relative");
		$(".serve-li-2 .serve-ico").css("left", "-425px");
		$(".serve-li-3 .serve-ico").css("color", "#FFFFFF");
		$(".serve-li-3 .serve-ico").css("background-color", "#47086C");
		$(".serve-li-2 .serve-ico").css("color", "#47086C");
		$(".serve-li-2 .serve-ico").css("background-color", "#F6F7F7");
		$(".serve-li-1 .serve-ico").css("color", "#47086C");
		$(".serve-li-1 .serve-ico").css("background-color", "#F6F7F7");
		$(".serve-li .serve-ico").css("color", "#47086C");
		$(".serve-li .serve-ico").css("background-color", "#F6F7F7");
		$(".serve-nav .serve-li-1 .serve-cont-2").css("visibility", "hidden");
		$(".serve-nav .serve-li .serve-cont-1").css("visibility", "hidden");
		$(".serve-nav .serve-li-2 .serve-cont-3").css("visibility", "hidden");
		$(".serve-nav .serve-li-3 .serve-cont-4").css("visibility", "visible");

		$(".serve-nav .serve-li-3 .serve-cont-4").stop().animate({
			left: "-440px"
		}, 250);
		$(".serve-nav .serve-li .serve-cont-1").stop().animate({
			left: "-50px"
		}, 0);
		$(".serve-nav .serve-li-2 .serve-cont-3").stop().animate({
			left: "-480px"
		}, 0);
		$(".serve-nav .serve-li-1 .serve-cont-2").stop().animate({
			left: "-480px"
		}, 0);

		$(".serve-cont-2 .select-box-wrapper .input-select-box.active:eq(0)").hide();
		$(".serve-cont-2 .select-box-wrapper .input-select-box.active:eq(1)").hide();
	})

	var wh = 0;
	var arrays = 0;
	var values = 0;
	//网点查询向上滑出
	$(".serve-nav").hover(function() {
		var he = $(window).height();
		var gh = $(window).scrollTop();
		wh = he + gh;
		//alert(wh)
		arrays = wh - 350;
		if(gh <= 118) {
			$(".border-nav").stop().animate({
				top: arrays
			}, 400);
		}
	}, function() {
		$(".border-nav").stop().animate({
			top: "490px"
		}, 400);
	});

	//获取下拉像素改变选项栏样式
	$(window).scroll(function() {
		if($(window).scrollTop() >= 35) {
			$(".navitation-wrap").css("position", "fixed");
			$(".navitation-wrap").css("top", "35px");
			$(".navitation-wrap").css("width", "100%");
			$(".navitation-wrap").css("border-radius", "0px");
			$(".navitation-wrap").css("left", "0px");

			$(".navitation").css("position", "fixed");
			$(".navitation").css("top", "35px");
			$(".navitation").css("width", "1200px");
			$(".navitation").css("border-radius", "0px");
		} else if($(window).scrollTop() <= 70) {
			$(".navitation-wrap").css("position", "absolute");
			$(".navitation-wrap").css("top", "70px");
			$(".navitation-wrap").css("width", "1200px");
			$(".navitation-wrap").css("border-radius", "90px");
			$(".navitation-wrap").css("left", "160px");

			$(".navitation").css("position", "absolute");
			$(".navitation").css("top", "70px");
			$(".navitation").css("width", "1200px");
			$(".navitation").css("border-radius", "90px");

		}
	})

	//在线客服滑出
	$(".service").hover(function() {
		$(this).animate({
			right: "-60"
		}, 1);
	}, function() {
		$(this).animate({
			right: "-135"
		}, 1);
	});

	//关闭扫码
	$(".floating-window-close").click(function() {
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

	$(".pop-modal-bottom").css("display", "none");
	$(".ab-one").css("display", "none");
	$(".over1").css("display", "none");
	$(".top-nav-item.mobile").hover(function() {
		$(".pop-modal-bottom").show();
		$(".ab-one").show();
		$(".over1").show();
	}, function() {
		$(".pop-modal-bottom").hide();
		$(".ab-one").hide();
		$(".over1").hide();
	})
	$(".pop-modal-bottom1").css("display", "none");
	$(".ab-two").css("display", "none");
	$(".over2").css("display", "none");
	$(".nav-item.hover-modal2").hover(function() {
		$(".pop-modal-bottom1").show();
		$(".ab-two").show();
		$(".over2").show();
	}, function() {
		$(".pop-modal-bottom1").hide();
		$(".ab-two").hide();
		$(".over2").hide();
	})
	$(".pop-modal-bottom2").css("display", "none");
	$(".ab-three").css("display", "none");
	$(".over3").css("display", "none");
	$(".nav-item.hover-modal3").hover(function() {
		$(".pop-modal-bottom2").show();
		$(".ab-three").show();
		$(".over3").show();
	}, function() {
		$(".pop-modal-bottom2").hide();
		$(".ab-three").hide();
		$(".over3").hide();
	})
	$(".pop-modal-bottom3").css("display", "none");
	$(".ab-four").css("display", "none");
	$(".over4").css("display", "none");
	$(".nav-item.hover-modal4").hover(function() {
		$(".pop-modal-bottom3").show();
		$(".ab-four").show();
		$(".over4").show();
	}, function() {
		$(".pop-modal-bottom3").hide();
		$(".ab-four").hide();
		$(".over4").hide();
	})
	$(".pop-modal-bottom4").css("display", "none");
	$(".ab-five").css("display", "none");
	$(".over5").css("display", "none");
	$(".nav-item.hover-modal5").hover(function() {
		$(".pop-modal-bottom4").show();
		$(".ab-five").show();
		$(".over5").show();
	}, function() {
		$(".pop-modal-bottom4").hide();
		$(".ab-five").hide();
		$(".over5").hide();
	})
	$(".pop-modal-bottom5").css("display", "none");
	$(".ab-six").css("display", "none");
	$(".over6").css("display", "none");
	$(".nav-item.hover-modal6").hover(function() {
		$(".pop-modal-bottom5").show();
		$(".ab-six").show();
		$(".over6").show();
	}, function() {
		$(".pop-modal-bottom5").hide();
		$(".ab-six").hide();
		$(".over6").hide();
	})
})