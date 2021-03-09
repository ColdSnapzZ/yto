package cn.net.yto.service;

import cn.net.yto.entity.LogisticsInfo;
import java.util.List;

/**
 * (LogisticsInfo)表服务接口
 *
 * @author makejava
 * @since 2021-03-04 15:08:49
 */
public interface LogisticsInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param liid 主键
     * @return 实例对象
     */
    LogisticsInfo queryById(Integer liid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LogisticsInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param logisticsInfo 实例对象
     * @return 实例对象
     */
    LogisticsInfo insert(LogisticsInfo logisticsInfo);

    /**
     * 修改数据
     *
     * @param logisticsInfo 实例对象
     * @return 实例对象
     */
    LogisticsInfo update(LogisticsInfo logisticsInfo);

    /**
     * 通过主键删除数据
     *
     * @param liid 主键
     * @return 是否成功
     */
    //根据liid删除
    boolean deleteById(Integer liid);
//根据wnumber新增
    List<LogisticsInfo> LogisticsInfo(String wnumber);

}