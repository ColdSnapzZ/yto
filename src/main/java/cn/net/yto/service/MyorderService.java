package cn.net.yto.service;

import cn.net.yto.entity.Myorder;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * (Myorder)表服务接口
 *
 * @author zht
 * @since 2021-01-05 15:10:43
 */
public interface MyorderService {

    /**
     * 通过ID查询单条数据
     *
     * @param oid 主键
     * @return 实例对象
     */
    Myorder queryById(Integer oid);

    Myorder queryById1(Myorder myorder);
    Myorder select(Integer uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Myorder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param myorder 实例对象
     * @return 实例对象
     */
    Myorder insert(Myorder myorder);

    /**
     * 修改数据
     *
     * @param myorder 实例对象
     * @return 实例对象
     */
    Myorder update(Myorder myorder);

    /**
     * 通过主键删除数据
     *
     * @param oid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer oid);
    public int count();

    List<Myorder> selectuid(int uid);

    Myorder selectByOid(int oid);
    Myorder selectonumber(int ystatus,int onumber);

}