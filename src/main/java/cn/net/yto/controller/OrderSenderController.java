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




    @PostMapping("add")
    public boolean add(Myorder myorder, OrderSender orderSender, OrderConsignee orderConsignee){

        String id = IdUtil.createId("EC", 21);
        myorder.setOnumber(id);
        orderSender.setOnumber(id);
        orderConsignee.setOnumber(id);




        String sdistrict = orderSender.getSdistrict();
        String replace = sdistrict.replace(" ", "").replace("/", "-");
        String cdistrict = orderConsignee.getCdistrict();
        String replace1=cdistrict.replace(" ","").replace("/","-");
        orderSender.setSdistrict(replace);
        orderConsignee.setCdistrict(replace1);



        myorder.setUid("1");
        myorder.setYstatus(1);


        orderSenderService.insert(orderSender);
         orderConsigneeService.insert(orderConsignee);
         myorderService.insert(myorder);

         return true;


    }

}