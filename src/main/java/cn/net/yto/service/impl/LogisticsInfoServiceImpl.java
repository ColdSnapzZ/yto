package cn.net.yto.service.impl;

import cn.net.yto.dao.LogisticsInfoDao;
import cn.net.yto.entity.LogisticsInfo;
import cn.net.yto.service.LogisticsInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LogisticsInfo)表服务实现类
 *
 * @author zht
 * @since 2021-02-23 19:45:52
 */
@Service("logisticsInfoService")
public class LogisticsInfoServiceImpl implements LogisticsInfoService {
    @Resource
    private LogisticsInfoDao logisticsInfoDao;

    @Override
    public List<LogisticsInfo> LogisticsInfo(String wnumber) {
        return this.logisticsInfoDao.LogisticsInfo(wnumber);
    }

    @Override
    public List<LogisticsInfo> queryByWnumber(String wnumber) {
        return logisticsInfoDao.queryByWnumber(wnumber);
    }

    /**
     * 新增数据
     *
     * @param logisticsInfo 实例对象
     * @return 实例对象
     */
    @Override
    public LogisticsInfo insert(LogisticsInfo logisticsInfo) {
        this.logisticsInfoDao.insert(logisticsInfo);
        return logisticsInfo;
    }

}