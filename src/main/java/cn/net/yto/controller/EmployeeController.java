package cn.net.yto.controller;

import cn.net.yto.entity.Employee;
import cn.net.yto.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Employee)表控制层
 *
 * @author zht
 * @since 2021-02-22 18:32:34
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeeService employeeService;

    @GetMapping("selectBySiteAndJob")
    public Map<String,Object> selectBySiteAndJob(HttpSession session){
        //获取员工域对象
        Employee emp = (Employee) session.getAttribute("emp");
        //调用employeeService.selectBySiteIdAndJob方法得到员工集合
        List<Employee> employees = employeeService.selectBySiteIdAndJob("BH20210108", 1);
        //创建map集合
        HashMap<String, Object> map=new HashMap<>();
        //设置状态
        map.put("code",0);
        //设置总行数
        map.put("count", employees.size());
        //设置数据
        map.put("data", employees);
        //返回map集合
        return map;
    }


}