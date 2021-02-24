package cn.net.yto.service;

import cn.net.yto.entity.Myorder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Myorder)表服务接口
 *
 * @author zht
 * @since 2021-01-05 15:10:43
 */
public interface MyorderService {

    /**
     * 通过ID查询单条数据
     *
     * @param oid 主键
     * @return 实例对象
     */
    Myorder queryById(Integer oid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Myorder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param myorder 实例对象
     * @return 实例对象
     */
    Myorder insert(Myorder myorder);

    /**
     * 修改数据
     *
     * @param myorder 实例对象
     * @return 实例对象
     */
    Myorder update(Myorder myorder);

    /**
     * 通过主键删除数据
     *
     * @param oid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer oid);

    /**
     * 根据订单状态和地区查询订单
     * @param status
     * @param area
     * @return
     */
    List<Myorder> selectByStatusAndArea(@Param("status") int status, @Param("area") String area,int offset,int limit);

    /**
     * zht
     * @param status
     * @param area
     * @return
     */
    int countByStatusAndArea(@Param("status") int status,@Param("area") String area);

    /**
     * 根据订单号修改订单状态
     * @param onumber
     * @param status
     * @return
     */
    int updateStatus(@Param("onumber") String onumber,@Param("status") int status);
}