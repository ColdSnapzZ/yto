package cn.net.yto.service;

import cn.net.yto.entity.Cars;
import cn.net.yto.entity.Stowage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Cars)表服务接口
 *
 * @author zht
 * @since 2021-01-11 16:06:21
 */
public interface CarsService {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    Cars queryById(Integer cid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Cars> queryAllByLimit(int offset, int limit,String branchId);

    /**
     * 新增数据
     *
     * @param cars 实例对象
     * @return 实例对象
     */
    boolean insert(Cars cars);

    /**
     * 修改数据
     *
     * @param cars 实例对象
     * @return 实例对象
     */
    boolean update(Cars cars);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cid);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param cars 实例对象
     * @return 对象列表
     */
    List<Cars> queryAll(Cars cars);

    /**
     * 查询行数
     * @param id 所属站点id
     * @return 行数
     */
    int count(@Param("id") String id);

    /**
     * 根据车牌号查询运输记录
     * @param cid 车牌号
     * @return
     */
    List<Stowage> selectStowageByCid(int offset,int limit,String cid);

    /**
     * 查询运输记录行数
     * @param cid 车辆车牌号
     * @return 行数
     */
    int carInfoCount(@Param("cid") String cid);

    /**
     * 修改车辆状态
     * @param cid
     * @param status
     * @return
     */
    boolean updateStatus(int cid, int status);

    /**
     * 新增Stowage
     * @param stowage
     * @return
     */
    boolean addStowage(Stowage stowage,int cid);
}