package cn.net.yto.service.impl;

import cn.net.yto.entity.OrderConsignee;
import cn.net.yto.dao.OrderConsigneeDao;
import cn.net.yto.service.OrderConsigneeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (OrderConsignee)表服务实现类
 *
 * @author makejava
 * @since 2021-01-07 13:52:31
 */
@Service("orderConsigneeService")
public class OrderConsigneeServiceImpl implements OrderConsigneeService {
    @Resource
    private OrderConsigneeDao orderConsigneeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ocid 主键
     * @return 实例对象
     */
    @Override
    public OrderConsignee queryById(Integer ocid) {
        return this.orderConsigneeDao.queryById(ocid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderConsignee> queryAllByLimit(int offset, int limit) {
        return this.orderConsigneeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderConsignee 实例对象
     * @return 实例对象
     */
    @Override
    public OrderConsignee insert(OrderConsignee orderConsignee) {
        this.orderConsigneeDao.insert(orderConsignee);
        return orderConsignee;
    }

    /**
     * 修改数据
     *
     * @param orderConsignee 实例对象
     * @return 实例对象
     */
    @Override
    public OrderConsignee update(OrderConsignee orderConsignee) {
        this.orderConsigneeDao.update(orderConsignee);
        return this.queryById(orderConsignee.getOcid());
    }

    /**
     * 通过主键删除数据
     *
     * @param ocid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer ocid) {
        return this.orderConsigneeDao.deleteById(ocid) > 0;
    }
}