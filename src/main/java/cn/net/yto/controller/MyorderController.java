package cn.net.yto.controller;

import cn.net.yto.entity.Employee;
import cn.net.yto.entity.Myorder;
import cn.net.yto.service.MyorderService;
import cn.net.yto.service.SiteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    //layui中获取值
    @ResponseBody
    public Map<String, Object> selectByStatusAndArea(HttpSession session, String area, int page, int limit){
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
    public Myorder selectByOid(int oid){
        return myorderService.selectByOid(oid);
    }

//根据状态及订单号查询
    @ResponseBody
    @RequestMapping("selectonumber")
    public List<Myorder> selectonumber(int ystatus, String onumber){
        return myorderService.selectonumber(ystatus,onumber);
    }



}