package cn.net.yto.service.impl;

import cn.net.yto.entity.LogisticsInfo;
import cn.net.yto.dao.LogisticsInfoDao;
import cn.net.yto.service.LogisticsInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LogisticsInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-03-04 15:08:49
 */
@Service("logisticsInfoService")
public class LogisticsInfoServiceImpl implements LogisticsInfoService {
    @Resource
    private LogisticsInfoDao logisticsInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param liid 主键
     * @return 实例对象
     */
    @Override
    public LogisticsInfo queryById(Integer liid) {
        return this.logisticsInfoDao.queryById(liid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<LogisticsInfo> queryAllByLimit(int offset, int limit) {
        return this.logisticsInfoDao.queryAllByLimit(offset, limit);
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

    /**
     * 修改数据
     *
     * @param logisticsInfo 实例对象
     * @return 实例对象
     */
    @Override
    public LogisticsInfo update(LogisticsInfo logisticsInfo) {
        this.logisticsInfoDao.update(logisticsInfo);
        return this.queryById(logisticsInfo.getLiid());
    }

    /**
     * 通过主键删除数据
     *
     * @param liid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer liid) {
        return this.logisticsInfoDao.deleteById(liid) > 0;
    }

    @Override
    public List<LogisticsInfo> LogisticsInfo(String wnumber) {
       return this.logisticsInfoDao.LogisticsInfo(wnumber);
    }
}