package cn.net.yto.service.impl;

import cn.net.yto.dao.SiteDao;
import cn.net.yto.entity.Site;
import cn.net.yto.service.SiteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Site)表服务实现类
 *
 * @author zht
 * @since 2021-02-22 10:09:52
 */
@Service("siteService")
public class SiteServiceImpl implements SiteService {
    @Resource
    private SiteDao siteDao;


    @Override
    public Site selectByArea(String area) {
        return siteDao.selectIdByArea(area);
    }
}