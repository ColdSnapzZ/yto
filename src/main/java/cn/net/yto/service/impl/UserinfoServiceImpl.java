package cn.net.yto.service.impl;

import cn.net.yto.dao.UserinfoDao;
import cn.net.yto.entity.Userinfo;
import cn.net.yto.service.UserinfoService;
import cn.net.yto.util.IdUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Userinfo)表服务实现类
 *
 * @author makejava
 * @since 2021-01-06 14:34:30
 */
@Service("userinfoService")
public class UserinfoServiceImpl implements UserinfoService {
    @Resource
    private UserinfoDao userinfoDao;

    @Override
    public int insert(Userinfo userinfo) {
        userinfo.setUsername(userinfo.getPhone());
        userinfo.setUid(IdUtil.createId(null, 12));
        return userinfoDao.insert(userinfo);
    }

    @Override
    public Userinfo queryByUsernameAndPassword(String username,String password) {
        return userinfoDao.queryByUsernameAndPassword(username,password);
    }
}