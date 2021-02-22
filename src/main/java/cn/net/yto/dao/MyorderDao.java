package cn.net.yto.dao;

import cn.net.yto.entity.Myorder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Myorder)表数据库访问层
 *
 * @author zht
 * @since 2021-01-05 15:10:43
 */
@Mapper
public interface MyorderDao {
    public int count();
    /**
     * 通过ID查询单条数据
     *
     * @param oid 主键
     * @return 实例对象
     */
    Myorder queryById(Integer oid);


    Myorder queryById1(Myorder myorder);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Myorder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param myorder 实例对象
     * @return 对象列表
     */
    List<Myorder> queryAll(Myorder myorder);

    /**
     * 新增数据
     *
     * @param myorder 实例对象
     * @return 影响行数
     */
    int insert(Myorder myorder);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Myorder> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Myorder> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Myorder> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Myorder> entities);

    /**
     * 修改数据
     *
     * @param myorder 实例对象
     * @return 影响行数
     */
    int update(Myorder myorder);

    /**
     * 通过主键删除数据
     *
     * @param oid 主键
     * @return 影响行数
     */
    int deleteById(Integer oid);

}