package cn.net.yto.service.impl;

import cn.net.yto.dao.EmployeeDao;
import cn.net.yto.entity.Employee;
import cn.net.yto.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Employee)表服务实现类
 *
 * @author zht
 * @since 2021-02-22 10:37:45
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeDao employeeDao;


    @Override
    public List<Employee> selectBySiteIdAndJob(String siteId,int jobId) {
        return employeeDao.selectBySiteIdAndJob(siteId, jobId);
    }
}