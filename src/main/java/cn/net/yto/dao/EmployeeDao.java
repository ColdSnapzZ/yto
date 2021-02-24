package cn.net.yto.dao;

import cn.net.yto.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Employee)表数据库访问层
 *
 * @author zht
 * @since 2021-02-22 10:37:44
 */
@Mapper
public interface EmployeeDao {

    /**
     * 根据站点和职位查询员工
     * @param siteId
     * @param jobId
     * @return
     */
    List<Employee> selectBySiteIdAndJob(@Param("siteId") String siteId, @Param("jobId") int jobId);

}