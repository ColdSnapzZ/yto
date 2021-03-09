package cn.net.yto.dao;

import cn.net.yto.entity.OrderConsignee;
import cn.net.yto.entity.OrderSender;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (OrderSender)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-07 13:52:00
 */
@Mapper
public interface OrderSenderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param osid 主键
     * @return 实例对象
     */
    OrderSender queryById(Integer osid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderSender> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param orderSender 实例对象
     * @return 对象列表
     */
    List<OrderSender> queryAll(OrderSender orderSender);

    /**
     * 新增数据
     *
     * @param orderSender 实例对象
     * @return 影响行数
     */
    int insert(OrderSender orderSender);

    /**
     * 修改数据
     *
     * @param orderSender 实例对象
     * @return 影响行数
     */
    int update(OrderSender orderSender);

    /**
     * 通过主键删除数据
     *
     * @param osid 主键
     * @return 影响行数
     */
    int deleteById(Integer osid);


}