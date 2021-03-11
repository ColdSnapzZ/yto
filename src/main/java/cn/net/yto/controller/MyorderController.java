package cn.net.yto.controller;

import cn.net.yto.entity.Myorder;
import cn.net.yto.service.MyorderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
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
    //layui中获取值
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
    //根据oid删除
    @ResponseBody
    @GetMapping("delete")
    public boolean delete(Integer oid) {
        return this.myorderService.deleteById(oid);
    }
//根据订单对象新增
    @ResponseBody
   @PostMapping("insert")
   public Myorder insert(Myorder myorder){
        return this.myorderService.insert(myorder);

   }
   //根据订单对象修改值
    @ResponseBody
   @PostMapping("update")
    public Myorder update(Myorder myorder){
       System.out.println("myorder = " + myorder);
        return this.myorderService.update(myorder);

   }
    @RequestMapping("seletuid")
    public ModelAndView selectuid(){
        //创建集合
        ModelAndView n=new ModelAndView();
        //存入到模型对象中
        n.addObject("uid",myorderService.selectuid(12345));
        //派发到payOrder.jsp页面
        n.setViewName("/front/payOrder.jsp");
        return n;

    }
    //根据oid查询
    @ResponseBody
    @RequestMapping("selectByOid")
    public List<Map<String,Object>> selectByOid(int oid,String wnumber){
        return myorderService.selectByOid(oid,wnumber);
    }

//根据状态及订单号查询
    @ResponseBody
    @RequestMapping("selectonumber")
    public List<Myorder> selectonumber(int ystatus, String onumber){
        return myorderService.selectonumber(ystatus,onumber);
    }



}