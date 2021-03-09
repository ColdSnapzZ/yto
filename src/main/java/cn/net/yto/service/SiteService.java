package cn.net.yto.service;

import cn.net.yto.entity.Site;

/**
 * (Site)表服务接口
 *
 * @author zht
 * @since 2021-02-22 10:09:52
 */
public interface SiteService {

    /**
     * 根据地址查询站点
     * @param area
     * @return
     */
    Site selectByArea(String area);

}