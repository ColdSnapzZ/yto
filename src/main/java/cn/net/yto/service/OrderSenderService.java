package cn.net.yto.service;

import cn.net.yto.entity.OrderSender;
import java.util.List;

/**
 * (OrderSender)表服务接口
 *
 * @author makejava
 * @since 2021-01-07 13:52:00
 */
public interface OrderSenderService {

    /**
     * 通过ID查询单条数据
     *
     * @param osid 主键
     * @return 实例对象
     */
    OrderSender queryById(Integer osid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderSender> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orderSender 实例对象
     * @return 实例对象
     */
    OrderSender insert(OrderSender orderSender);

    /**
     * 修改数据
     *
     * @param orderSender 实例对象
     * @return 实例对象
     */
    OrderSender update(OrderSender orderSender);

    /**
     * 通过主键删除数据
     *
     * @param osid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer osid);

}