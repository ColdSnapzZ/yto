package cn.net.yto.dao;

import cn.net.yto.entity.LogisticsInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (LogisticsInfo)表数据库访问层
 *
 * @author zht
 * @since 2021-02-23 17:10:15
 */
@Mapper
public interface LogisticsInfoDao {

    /**
     * 根据运单号查询
     * @param wnumber
     * @return
     */
    List<LogisticsInfo> queryByWnumber(String wnumber);

    /**
     * 新增数据
     *
     * @param logisticsInfo 实例对象
     * @return 影响行数
     */
    int insert(LogisticsInfo logisticsInfo);

}