package cn.net.yto.service.impl;

import cn.net.yto.dao.CarsDao;
import cn.net.yto.entity.Cars;
import cn.net.yto.service.CarsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Cars)表服务实现类
 *
 * @author makejava
 * @since 2021-01-11 16:06:21
 */
@Service("carsService")
public class CarsServiceImpl implements CarsService {
    @Resource
    private CarsDao carsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    @Override
    public Cars queryById(Integer cid) {
        return this.carsDao.queryById(cid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Cars> queryAllByLimit(int offset, int limit) {
        return this.carsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param cars 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(Cars cars) {
        return this.carsDao.insert(cars)>0;
    }

    /**
     * 修改数据
     *
     * @param cars 实例对象
     * @return 实例对象
     */
    @Override
    public boolean update(Cars cars) {
        return this.carsDao.update(cars)>0;
    }

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cid) {
        return this.carsDao.deleteById(cid) > 0;
    }

    @Override
    public List<Cars> queryAll(Cars cars) {
        return carsDao.queryAll(cars);
    }

    @Override
    public int count(String id) {
        return carsDao.count(id);
    }
}