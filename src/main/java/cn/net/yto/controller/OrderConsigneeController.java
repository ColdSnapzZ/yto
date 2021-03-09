package cn.net.yto.controller;

import cn.net.yto.entity.OrderConsignee;
import cn.net.yto.service.OrderConsigneeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OrderConsignee)表控制层
 *
 * @author makejava
 * @since 2021-01-07 13:52:31
 */
@RestController
@RequestMapping("orderConsignee")
public class OrderConsigneeController {
    /**
     * 服务对象
     */
    @Resource
    private OrderConsigneeService orderConsigneeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    //根据id查询
    @GetMapping("selectOne")
    public OrderConsignee selectOne(Integer id) {
        return this.orderConsigneeService.queryById(id);
    }

    
}