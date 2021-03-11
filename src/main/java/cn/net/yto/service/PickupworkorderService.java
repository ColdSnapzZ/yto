package cn.net.yto.service;

import cn.net.yto.entity.Pickupworkorder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Pickupworkorder)表服务接口
 *
 * @author zht
 * @since 2021-02-23 09:45:13
 */
public interface PickupworkorderService {

    /**
     * 通过ID查询单条数据
     *
     * @param puid 主键
     * @return 实例对象
     */
    Pickupworkorder queryById(Integer puid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Pickupworkorder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pickupworkorder 实例对象
     * @return 实例对象
     */
    boolean insert(Pickupworkorder pickupworkorder);

    /**
     * 修改数据
     *
     * @param pickupworkorder 实例对象
     * @return 实例对象
     */
    Pickupworkorder update(Pickupworkorder pickupworkorder);

    /**
     * 通过主键删除数据
     *
     * @param puid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer puid);

    /**
     * 根据员工id查询总数
     * @param empid
     * @return
     */
    int countByEmpId(String empid,Integer status);

    /**
     * 根据单号修改状态
     * @param number
     * @param status
     * @return
     */
    int updateStatusBynumber(@Param("number") String number, @Param("status") int status);

    //boolean autoAllot(String siteId);
}