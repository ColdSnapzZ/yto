package cn.net.yto.dao;

import cn.net.yto.entity.OrderConsignee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (OrderConsignee)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-07 13:52:31
 */
@Mapper
public interface OrderConsigneeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ocid 主键
     * @return 实例对象
     */
    OrderConsignee queryById(Integer ocid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderConsignee> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param orderConsignee 实例对象
     * @return 对象列表
     */
    List<OrderConsignee> queryAll(OrderConsignee orderConsignee);

    /**
     * 新增数据
     *
     * @param orderConsignee 实例对象
     * @return 影响行数
     */
    int insert(OrderConsignee orderConsignee);

    /**
     * 修改数据
     *
     * @param orderConsignee 实例对象
     * @return 影响行数
     */
    int update(OrderConsignee orderConsignee);

    /**
     * 通过主键删除数据
     *
     * @param ocid 主键
     * @return 影响行数
     */
    //根据ocid删除
    int deleteById(Integer ocid);

}