package cn.net.yto.service;

import cn.net.yto.entity.Userinfo;

import java.util.List;

/**
 * (Userinfo)表服务接口
 *
 * @author makejava
 * @since 2021-01-06 14:34:30
 */
public interface UserinfoService {

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