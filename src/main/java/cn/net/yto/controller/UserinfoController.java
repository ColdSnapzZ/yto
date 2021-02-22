package cn.net.yto.controller;

import cn.net.yto.entity.Userinfo;
import cn.net.yto.service.UserinfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Userinfo)表控制层
 *
 * @author makejava
 * @since 2021-01-11 18:29:49
 */
@RestController
@RequestMapping("userinfo")
public class UserinfoController {
    /**
     * 服务对象
     */
    @Resource
    private UserinfoService userinfoService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public List<Userinfo> selectOne() {
        return this.userinfoService.queryAll(null);
    }

}