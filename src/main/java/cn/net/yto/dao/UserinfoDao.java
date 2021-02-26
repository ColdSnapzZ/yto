package cn.net.yto.dao;

import cn.net.yto.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Userinfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-06 14:34:30
 */
@Mapper
public interface UserinfoDao {
    /**
     * 新增数据
     *
     * @param userinfo 实例对象
     * @return 影响行数
     */
    int insert(Userinfo userinfo);

    /**
     *
     * @return
     */
    Userinfo queryByUsernameAndPassword(String username,String password);


}