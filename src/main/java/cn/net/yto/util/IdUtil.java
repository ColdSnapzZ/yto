package cn.net.yto.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * @Author zht
 * @Date 2021/1/5 22:09
 * @Description Id工具类
 */
public class IdUtil {

    /**
     * 生成随机id
     * @date 22:28 2021/1/5
     * @param head 头部字符
     * @param length id长度
     * @return java.lang.String
     */
    public static String createId(String head,int length){
        //获取时间戳
        long l = System.currentTimeMillis();
        //创建随即类对象
        Random rm=new Random();
        //创建可变字符串
        StringBuilder sb=new StringBuilder();
        //追加时间戳
        sb.append(l);
        //追加随机数
        for (int i = 0; i < 6; i++) {
            sb.append(rm.nextInt(10));
        }
        //得到字符串数组
        String[] split = sb.toString().split("");
        //创建集合
        ArrayList<String> strings =new ArrayList<>(Arrays.asList(split));
        //打乱集合
        Collections.shuffle(strings);
        //清空字符串
        sb.setLength(0);
        //循环集合追加字符串
        for (String str : strings) {
            sb.append(str);
        }
        //判断是否为空并且长度>0
        if (head!=null && head.length()>0){
            //头部追加
            sb.insert(0, head);
        }
        //返回生成id
        return sb.substring(0,length);
    }

}
