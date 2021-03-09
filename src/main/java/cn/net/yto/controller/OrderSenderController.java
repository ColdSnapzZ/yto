package cn.net.yto.controller;

import cn.net.yto.entity.Myorder;
import cn.net.yto.entity.OrderConsignee;
import cn.net.yto.entity.OrderSender;
import cn.net.yto.service.MyorderService;
import cn.net.yto.service.OrderConsigneeService;
import cn.net.yto.service.OrderSenderService;
import cn.net.yto.util.IdUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OrderSender)表控制层
 *
 * @author makejava
 * @since 2021-01-07 13:52:01
 */
@RestController
@RequestMapping("orderSender")
public class OrderSenderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderSenderService orderSenderService;

    @Resource
    private OrderConsigneeService orderConsigneeService;
    @Resource
    private MyorderService myorderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OrderSender selectOne(Integer id) {
        return this.orderSenderService.queryById(id);
    }



//新增用户信息，并生成订单号
    @PostMapping("add")
    public boolean add(Myorder myorder, OrderSender orderSender, OrderConsignee orderConsignee){
//调用生成工具
        String id = IdUtil.createId("EC", 21);
        //将id存入订单表的订单号
        myorder.setOnumber(id);
        //将id存入寄件人表的订单号
        orderSender.setOnumber(id);
        //将id存入收件人表的订单号
        orderConsignee.setOnumber(id);
//获取地址信息，截取并替换
        //得到寄件人标表
        String sdistrict = orderSender.getSdistrict();
        //替换地址字符
        String replace = sdistrict.replace(" ", "").replace("-", "");
       //得到收件人表
        String cdistrict = orderConsignee.getCdistrict();
        //替换地址字符
        String replace1=cdistrict.replace(" ","").replace("-","");
        //将设置存入寄件人表
        orderSender.setSdistrict(replace);
        //将地址存入收件人表
        orderConsignee.setCdistrict(replace1);
       //默认用户id
        myorder.setUid("1");
        //默认订单状态
        myorder.setYstatus(2);
        //新增至订单寄件人表
        orderSenderService.insert(orderSender);
        //新增至订单收件人表
         orderConsigneeService.insert(orderConsignee);
         //新增至订单表
         myorderService.insert(myorder);
         //返回值
         return true;


    }

}