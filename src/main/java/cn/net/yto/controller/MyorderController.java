package cn.net.yto.controller;

import cn.net.yto.entity.Employee;
import cn.net.yto.entity.Myorder;
import cn.net.yto.service.MyorderService;
import cn.net.yto.service.SiteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Resource
    private SiteService siteService;

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

    /**
     * zht
     * @return
     */
    @GetMapping("selectByStatus")
    @ResponseBody
    public Map<String, Object> selectByStatusAndArea(HttpSession session,String area, int page, int limit){
        //获取员工域对象
        Employee emp = (Employee) session.getAttribute("emp");
        //调用SiteService.selectBySiteId方法
        //Site site = siteService.selectByArea(area);
        //调用myorderService的selectByStatusAndArea方法
        List<Myorder> myorders = myorderService.selectByStatusAndArea(1, "湖南省长沙市雨花区",page,limit);
        //创建map集合
        HashMap<String, Object> map=new HashMap<>();
        //设置状态
        map.put("code",0);
        //设置总行数
        map.put("count", myorderService.countByStatusAndArea(1,"湖南省长沙市雨花区"));
        //设置数据
        map.put("data", myorders);
        //返回map集合
        return map;
    }

}