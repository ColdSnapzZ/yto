package cn.net.yto.dao;

import cn.net.yto.entity.LogisticsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (LogisticsInfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-04 15:08:49
 */
@Mapper
public interface LogisticsInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param liid 主键
     * @return 实例对象
     */
    LogisticsInfo queryById(Integer liid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LogisticsInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param logisticsInfo 实例对象
     * @return 对象列表
     */
    List<LogisticsInfo> queryAll(LogisticsInfo logisticsInfo);

    /**
     * 新增数据
     *
     * @param logisticsInfo 实例对象
     * @return 影响行数
     */
    int insert(LogisticsInfo logisticsInfo);

    /**
     * 修改数据
     *
     * @param logisticsInfo 实例对象
     * @return 影响行数
     */
    int update(LogisticsInfo logisticsInfo);

    /**
     * 通过主键删除数据
     *
     * @param liid 主键
     * @return 影响行数
     */
    int deleteById(Integer liid);
    //根据运单号查询
    List<LogisticsInfo> LogisticsInfo(String wnumber);

}