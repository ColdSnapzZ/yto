package cn.net.yto.dao;

import cn.net.yto.entity.Expresspath;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * (Expresspath)表数据库访问层
 *
 * @author zht
 * @since 2021-03-05 11:04:28
 */
@Mapper
public interface ExpresspathDao {

    /**
     * 通过运单号查询单条数据
     *
     * @param number 运单号
     * @return 实例对象
     */
    Expresspath queryByNumber(@Param("wnumber") String number);

    /**
     * 新增数据
     *
     * @param expresspath 实例对象
     * @return 影响行数
     */
    int insert(Expresspath expresspath);

    /**
     * 修改数据
     *
     * @param expresspath 实例对象
     * @return 影响行数
     */
    int update(Expresspath expresspath);

}