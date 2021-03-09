package cn.net.yto.controller;

import cn.net.yto.entity.LogisticsInfo;
import cn.net.yto.service.LogisticsInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LogisticsInfo)表控制层
 *
 * @author makejava
 * @since 2021-03-04 15:08:49
 */
@Controller
@RequestMapping("logisticsInfo")
public class LogisticsInfoController {
    /**
     * 服务对象
     */
    @Resource
    private LogisticsInfoService logisticsInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public LogisticsInfo selectOne(Integer id) {
        return this.logisticsInfoService.queryById(id);
    }

//根据运单号获取到集合中的值
    @ResponseBody
    @GetMapping("selectwnumber")
    public List<LogisticsInfo> LogisticsInfo(String wnumber){
        List<LogisticsInfo> logisticsInfos = this.logisticsInfoService.LogisticsInfo(wnumber);
        //返回结果
        return logisticsInfos;

    }
    //将页面获取的值派发到另一个页面
    @RequestMapping("zhuanfa")
    public ModelAndView zhaunfa(String wnumber){
        //存入集合
        ModelAndView modelAndView=new ModelAndView();
        //存入对象模型
         modelAndView.addObject("logisticsInfos",logisticsInfoService.LogisticsInfo(wnumber));
        //派发到另一个页面
        modelAndView.setViewName("/front/tracesimple.jsp");
        //返回值
        return modelAndView;
    }


}