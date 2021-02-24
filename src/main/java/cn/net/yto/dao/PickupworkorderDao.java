package cn.net.yto.dao;

import cn.net.yto.entity.Pickupworkorder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Pickupworkorder)表数据库访问层
 *
 * @author zht
 * @since 2021-02-23 09:45:13
 */
@Mapper
public interface PickupworkorderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param puid 主键
     * @return 实例对象
     */
    Pickupworkorder queryById(Integer puid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Pickupworkorder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param pickupworkorder 实例对象
     * @return 对象列表
     */
    List<Pickupworkorder> queryAll(Pickupworkorder pickupworkorder);

    /**
     * 新增数据
     *
     * @param pickupworkorder 实例对象
     * @return 影响行数
     */
    int insert(Pickupworkorder pickupworkorder);


    /**
     * 修改数据
     *
     * @param pickupworkorder 实例对象
     * @return 影响行数
     */
    int update(Pickupworkorder pickupworkorder);

    /**
     * 通过主键删除数据
     *
     * @param puid 主键
     * @return 影响行数
     */
    int deleteById(Integer puid);

    /**
     * 根据员工id查询总数
     * @param empid
     * @return
     */
    int countByEmpId(@Param("empid") String empid,@Param("status") Integer status);

    /**
     * 根据单号修改状态
     * @param number
     * @param status
     * @return
     */
    int updateStatusBynumber(@Param("number") String number,@Param("status") int status);

}