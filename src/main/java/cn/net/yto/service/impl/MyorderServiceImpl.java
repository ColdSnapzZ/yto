package cn.net.yto.service.impl;

import cn.net.yto.dao.MyorderDao;
import cn.net.yto.entity.Myorder;
import cn.net.yto.service.MyorderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Myorder)表服务实现类
 *
 * @author makejava
 * @since 2021-01-05 15:10:43
 */
@Service("myorderService")
public class MyorderServiceImpl implements MyorderService {
    @Resource
    private MyorderDao myorderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param oid 主键
     * @return 实例对象
     */
    @Override
    public Myorder queryById(Integer oid) {
        return this.myorderDao.queryById(oid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Myorder> queryAllByLimit(int offset, int limit) {
        return this.myorderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param myorder 实例对象
     * @return 实例对象
     */
    @Override
    public Myorder insert(Myorder myorder) {
        this.myorderDao.insert(myorder);
        return myorder;
    }

    /**
     * 修改数据
     *
     * @param myorder 实例对象
     * @return 实例对象
     */
    @Override
    public Myorder update(Myorder myorder) {
        this.myorderDao.update(myorder);
        return this.queryById(myorder.getOid());
    }

    /**
     * 通过主键删除数据
     *
     * @param oid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer oid) {
        return this.myorderDao.deleteById(oid) > 0;
    }
}