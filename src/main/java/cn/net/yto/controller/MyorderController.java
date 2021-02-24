package cn.net.yto.controller;

import cn.net.yto.entity.Myorder;
import cn.net.yto.service.MyorderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
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

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ResponseBody
    @GetMapping("selectOne")
    public Myorder selectOne(Integer id) {
        return this.myorderService.queryById(id);
    }
    @ResponseBody
    @GetMapping(value = "selectAll",produces = {"application/json;charset=UTF-8"})
    public Map<String,Object> selectAll(int page, int  limit){
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("mag", "");
        map.put("count",myorderService.count());
        map.put("data",myorderService.queryAllByLimit((page-1)*limit, limit));
        return map;
    }
    @ResponseBody
    @GetMapping("delete")
    public boolean delete(Integer oid) {
        return this.myorderService.deleteById(oid);
    }

    @ResponseBody
   @PostMapping("insert")
   public Myorder insert(Myorder myorder){
        return this.myorderService.insert(myorder);

   }
    @ResponseBody
   @PostMapping("update")
    public Myorder update(Myorder myorder){
       System.out.println("myorder = " + myorder);
        return this.myorderService.update(myorder);

   }

    @RequestMapping("seletuid")
    public ModelAndView selectuid(){
        ModelAndView n=new ModelAndView();
        n.addObject("uid",myorderService.selectuid(12345));
        n.setViewName("/front/payOrder.jsp");
        return n;

    }
    @ResponseBody
    @RequestMapping("selectByOid")
    public Myorder selectByOid(int oid){
        return myorderService.selectByOid(oid);
    }



}