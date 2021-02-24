package cn.net.yto.service.impl;

import cn.net.yto.entity.OrderSender;
import cn.net.yto.dao.OrderSenderDao;
import cn.net.yto.service.OrderSenderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (OrderSender)表服务实现类
 *
 * @author makejava
 * @since 2021-01-07 13:52:01
 */
@Service("orderSenderService")
public class OrderSenderServiceImpl implements OrderSenderService {
    @Resource
    private OrderSenderDao orderSenderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param osid 主键
     * @return 实例对象
     */
    @Override
    public OrderSender queryById(Integer osid) {
        return this.orderSenderDao.queryById(osid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderSender> queryAllByLimit(int offset, int limit) {
        return this.orderSenderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderSender 实例对象
     * @return 实例对象
     */
    @Override
    public OrderSender insert(OrderSender orderSender) {
        this.orderSenderDao.insert(orderSender);
        return orderSender;
    }

    /**
     * 修改数据
     *
     * @param orderSender 实例对象
     * @return 实例对象
     */
    @Override
    public OrderSender update(OrderSender orderSender) {
        this.orderSenderDao.update(orderSender);
        return this.queryById(orderSender.getOsid());
    }

    /**
     * 通过主键删除数据
     *
     * @param osid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer osid) {
        return this.orderSenderDao.deleteById(osid) > 0;
    }
}