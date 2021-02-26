<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Hello world!</title>
    <style type="text/css">
        #container{
            /*地图(容器)显示大小*/
            width:1200px;
            height:400px;
        }
    </style>
    <!--引入Javascript API GL，参数说明参见下文-->
    <script src="https://map.qq.com/api/gljs?v=1.exp&key=OB4BZ-D4W3U-B7VVO-4PJWW-6TKDJ-WPB77"></script>
    <script>
        //地图初始化函数，本例取名为init，开发者可根据实际情况定义
        function initMap() {
            //定义地图中心点坐标
            var center = new TMap.LatLng(39.984120, 116.307484)
            //定义map变量，调用 TMap.Map() 构造函数创建地图
            var map = new TMap.Map(document.getElementById('container'), {
                center: center,//设置地图中心点坐标
                zoom: 17.2,   //设置地图缩放级别
                pitch: 43.5,  //设置俯仰角
                rotation: 45    //设置地图旋转角度
            });
        }
    </script>
</head>
<!-- 页面载入后，调用init函数 -->
<body onload="initMap()">
<!-- 定义地图显示容器 -->
<div id="container"></div>
</body>
</html>
