package cn.net.yto.util;

import cn.net.yto.entity.Location;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Author zht
 * @Date 2021/3/3 15:36
 * @Description 路线生成
 */
@Component
public class RoutePlan {

    /**
     * 地图key
     */
    private final String key = "5QTBZ-NUXOV-CHOPH-UP3NG-2LWEJ-W5FGN";

    private RestTemplate restTemplate=new RestTemplate();

    /**
     * @Author zht
     * 根据地址获取经纬度坐标
     * @param address
     * @return
     */
    public Location getLocation(String address){
        //restTemplate.getForObject远程调用https://apis.map.qq.com/ws/geocoder/v1/
        String json=restTemplate.getForObject("https://apis.map.qq.com/ws/geocoder/v1/?key="+key+"&address="+address, String.class);
        //替换json中的空格""
        String replace = json.replace(" ", "");
        //获取replace中lng字符出现的下标
        int lng = replace.indexOf("lng");
        //获取}出现的下标从指定下标lng开始
        int lat = replace.indexOf("}", lng);
        //截取replace字符串从lng - 3, lat + 1开始
        String substring = replace.substring(lng - 3, lat + 1);
        //JSON.parseObject解析substring字符为Location对象并返回
        return JSON.parseObject(substring, Location.class);
    }

    /**
     * @Author zht
     * 生成快递路线
     * @param from 出发地
     * @param to 目的地
     * @return
     */
    public String createRoute(String from,String to){
        //创建StringBuilder对象
        StringBuilder route=new StringBuilder();
        //获取from'省'出现的下标
        int sheng1 = from.indexOf("省");
        //获取to'省'出现的下标
        int sheng2 = to.indexOf("省");
        //截取from字符串0, sheng1
        String formsheng = from.substring(0, sheng1);
        //截取to字符串0, sheng2
        String tosheng = to.substring(0, sheng2);
        //追加from
        route.append(from);
        //追加->
        route.append("->");

        //判断是否不是同一省
        if (!formsheng.equals(tosheng)) {
            //追加fromsheng
            route.append(formsheng);
            //追加分拨中心->
            route.append("分拨中心->");
            //追加tosheng
            route.append(tosheng);
            //追加分拨中心->
            route.append("分拨中心->");
        }
        //追加to
        route.append(to);
        //返回route.toString();
        return route.toString();
    }

    /**
     * @Author zht
     * 判断是否为同一省
     * @param from
     * @param to
     * @return
     */
    public boolean isSameProvince(String from,String to){
        //获取from'省'出现的下标
        int sheng1 = from.indexOf("省");
        //获取to'省'出现的下标
        int sheng2 = to.indexOf("省");
        //截取from字符串
        String formsheng = from.substring(0, sheng1);
        //截取to字符串
        String tosheng = to.substring(0, sheng2);
        //判断是否是同一省并返回结果
        return formsheng.equals(tosheng);
    }

    /**
     * @Author zht
     * 判断是否为同一城市和区域
     * @param from
     * @param to
     * @return
     */
    public boolean isSameCityAndArea(String from,String to){
        //获取from'市'出现的下标
        int shi1 = from.indexOf("市");
        //获取to'市'出现的下标
        int shi2 = to.indexOf("市");
        //截取from0, shi1获取城市名
        String fromshi = from.substring(0, shi1);
        //截取to
        String toshi = to.substring(0, shi2);
        //判断fromshi和toshi是否相等
        if (fromshi.equals(toshi)){
            //截取from.substring(shi1+1);
            String qu1 = from.substring(shi1+1);
            //截取to.substring(shi2+1);
            String qu2 = to.substring(shi2+1);
            //判断qu1和qu2是否相等并返回结果
            return qu1.equals(qu2);
        }
        return false;
    }


}
