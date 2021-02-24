package cn.net.yto.service.impl;

import cn.net.yto.entity.Userinfo;
import cn.net.yto.dao.UserinfoDao;
import cn.net.yto.service.UserinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Userinfo)表服务实现类
 *
 * @author makejava
 * @since 2021-01-11 18:29:49
 */
@Service("userinfoService")
public class UserinfoServiceImpl implements UserinfoService {
    @Resource
    private UserinfoDao userinfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Userinfo queryById(Integer id) {
        return this.userinfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Userinfo> queryAllByLimit(int offset, int limit) {
        return this.userinfoDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Userinfo> queryAll(Userinfo userinfo) {
        return userinfoDao.queryAll(userinfo);
    }

    /**
     * 新增数据
     *
     * @param userinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Userinfo insert(Userinfo userinfo) {
        this.userinfoDao.insert(userinfo);
        return userinfo;
    }

    /**
     * 修改数据
     *
     * @param userinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Userinfo update(Userinfo userinfo) {
        this.userinfoDao.update(userinfo);
        return this.queryById(userinfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userinfoDao.deleteById(id) > 0;
    }
}