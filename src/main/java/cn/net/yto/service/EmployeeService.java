package cn.net.yto.service;

import cn.net.yto.entity.Employee;

import java.util.List;

/**
 * (Employee)表服务接口
 *
 * @author zht
 * @since 2021-02-22 10:37:45
 */
public interface EmployeeService {

    /**
     * 根据站点和职位查询员工
     * @return
     */
    List<Employee> selectBySiteIdAndJob(String siteId,int jobId);

}