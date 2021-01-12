package cn.net.yto.dao;

import cn.net.yto.entity.Cars;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Cars)表数据库访问层
 *
 * @author zht
 * @since 2021-01-11 16:06:21
 */
@Mapper
public interface CarsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    Cars queryById(Integer cid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Cars> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param cars 实例对象
     * @return 对象列表
     */
    List<Cars> queryAll(Cars cars);

    /**
     * 新增数据
     *
     * @param cars 实例对象
     * @return 影响行数
     */
    int insert(Cars cars);

    /**
     * 修改数据
     *
     * @param cars 实例对象
     * @return 影响行数
     */
    int update(Cars cars);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 影响行数
     */

    int deleteById(Integer cid);

    /**
     * 查询行数
     * @param id 所属站点id
     * @return 行数
     */
    int count(@Param("id") String id);

}