package cn.net.yto.service;

import cn.net.yto.entity.LogisticsInfo;

import java.util.List;

/**
 * (LogisticsInfo)表服务接口
 *
 * @author zht
 * @since 2021-02-23 19:45:52
 */
public interface LogisticsInfoService {

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
     * @return 实例对象
     */
    LogisticsInfo insert(LogisticsInfo logisticsInfo);

}