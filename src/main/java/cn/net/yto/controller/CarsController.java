package cn.net.yto.controller;

import cn.net.yto.entity.Cars;
import cn.net.yto.entity.Employee;
import cn.net.yto.entity.Stowage;
import cn.net.yto.service.CarsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Cars)表控制层
 *
 * @author zht
 * @since 2021-01-11 16:06:22
 */
@Controller
@RequestMapping("cars")
public class CarsController {
    /**
     * 服务对象
     */
    @Resource
    private CarsService carsService;

    /**
     * 查询所有
     * @date 16:44 2021/1/11
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    @RequestMapping("selectAll")
    @ResponseBody
    public Map<String, Object> selectAll(Cars car){
        //调用查询所有方法
        List<Cars> cars = carsService.queryAll(car);
        //创建map集合
        HashMap<String, Object> map=new HashMap<>();
        //设置状态
        map.put("code",0);
        //设置总行数
        map.put("count", cars.size());
        //设置数据
        map.put("data", cars);
        //返回map集合
        return map;
    }

    /**
     * 分页查询
     * @param page 页码
     * @param limit 行数
     * @return 查询数据
     */
    @RequestMapping("selectAllByLimit")
    @ResponseBody
    public Map<String, Object> selectAllByLimit(HttpSession session,int page, int limit){
        //获取session域得到员工对象
        Employee emp = (Employee) session.getAttribute("emp");
        //调用分页查询方法
        List<Cars> cars = carsService.queryAllByLimit((page-1)*limit,limit,"BH20210108");
        //创建map集合
        HashMap<String, Object> map=new HashMap<>();
        //设置状态
        map.put("code",0);
        //设置总行数
        map.put("count", carsService.count("BH20210108"));
        //设置数据
        map.put("data", cars);
        //返回map集合
        return map;
    }

    /**
     * 新增车辆
     * @param car 车辆对象
     * @return 新增结果
     */
    @RequestMapping("update")
    @ResponseBody
    public boolean update(Cars car){
        //调用修改方法并返回结果
        return carsService.update(car);
    }

    /**
     * 修改车辆
     * @param car 车辆对象
     * @return 修改结果
     */
    @RequestMapping("insert")
    @ResponseBody
    public boolean insert(Cars car){
        //调用新增方法并返回结果
        return carsService.insert(car);
    }

    /**
     * 删除车辆
     * @param cid 车辆id
     * @return 删除结果
     */
    @RequestMapping("delete")
    @ResponseBody
    public boolean delete(int cid){
        //调用删除方法并返回修改结果
        return carsService.deleteById(cid);
    }

    @RequestMapping("carInfo")
    @ResponseBody
    public Map<String, Object> carInfo(int page, int limit,String cid){
        //调用分页查询selectStowageByCid方法
        List<Stowage> stowages = carsService.selectStowageByCid((page - 1) * limit, limit, cid);
        //创建map集合
        HashMap<String, Object> map=new HashMap<>();
        //设置状态
        map.put("code",0);
        //设置总行数
        map.put("count", carsService.carInfoCount(cid));
        //设置数据
        map.put("data", stowages);
        //返回map集合
        return map;
    }

    @RequestMapping("addStowage")
    @ResponseBody
    public boolean addStowage(Stowage stowage,int cid){
        //调用carsService.addStowage方法并返回结果
        return carsService.addStowage(stowage,cid);
    }

}