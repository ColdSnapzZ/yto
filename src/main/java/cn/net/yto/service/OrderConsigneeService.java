package cn.net.yto.service;

import cn.net.yto.entity.OrderConsignee;
import java.util.List;

/**
 * (OrderConsignee)表服务接口
 *
 * @author makejava
 * @since 2021-01-07 13:52:31
 */
public interface OrderConsigneeService {

    /**
     * 通过ID查询单条数据
     *
     * @param ocid 主键
     * @return 实例对象
     */
    OrderConsignee queryById(Integer ocid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderConsignee> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orderConsignee 实例对象
     * @return 实例对象
     */
    OrderConsignee insert(OrderConsignee orderConsignee);

    /**
     * 修改数据
     *
     * @param orderConsignee 实例对象
     * @return 实例对象
     */
    OrderConsignee update(OrderConsignee orderConsignee);

    /**
     * 通过主键删除数据
     *
     * @param ocid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer ocid);

}