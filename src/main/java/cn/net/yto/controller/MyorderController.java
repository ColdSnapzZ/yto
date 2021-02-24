package cn.net.yto.controller;

import cn.net.yto.entity.Myorder;
import cn.net.yto.service.MyorderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * (Myorder)表控制层
 *
 * @author zht
 * @since 2021-01-05 15:10:44
 */
@Controller
@RequestMapping("myorder")
public class MyorderController {
    /**
     * 服务对象
     */
    @Resource
    private MyorderService myorderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Myorder selectOne(Integer id) {
        return this.myorderService.queryById(id);
    }

}