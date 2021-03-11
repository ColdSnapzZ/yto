package cn.net.yto.service;

import cn.net.yto.entity.Expresspath;
import org.apache.ibatis.annotations.Param;

/**
 * (Expresspath)表服务接口
 *
 * @author zht
 * @since 2021-03-05 11:04:28
 */
public interface ExpresspathService {

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

    /**
     * 获取路线下一站地址
     * @param expresspath
     * @return
     */
    String nextAddress(Expresspath expresspath);

}