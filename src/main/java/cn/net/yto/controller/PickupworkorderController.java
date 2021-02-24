package cn.net.yto.controller;

import cn.net.yto.entity.Pickupworkorder;
import cn.net.yto.service.PickupworkorderService;
import cn.net.yto.util.IdUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * (Pickupworkorder)表控制层
 *
 * @author zht
 * @since 2021-02-23 09:45:14
 */
@RestController
@RequestMapping("pickupworkorder")
public class PickupworkorderController {
    /**
     * 服务对象
     */
    @Resource
    private PickupworkorderService pickupworkorderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Pickupworkorder selectOne(Integer id) {
        return this.pickupworkorderService.queryById(id);
    }

    @PostMapping("add")
    public boolean add(Pickupworkorder pickupworkorder){
        //调用IdUtil.createId生成取件单码
        pickupworkorder.setPuwonumber(IdUtil.createId(null, 15));
        //创建DateTimeFormatter
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        //得到ofPattern.format当前系统时间
        String format = ofPattern.format(LocalDateTime.now());
        //时间取件单生成时间
        pickupworkorder.setWotime(format);
        //设置取件单状态
        pickupworkorder.setYstatus(1);
        //调用pickupworkorderService.insert方法返回结果
        return pickupworkorderService.insert(pickupworkorder);
    }


}