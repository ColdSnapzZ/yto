package cn.net.yto.dao;

import cn.net.yto.entity.Site;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Site)表数据库访问层
 *
 * @author zht
 * @since 2021-02-22 10:09:51
 */
@Mapper
public interface SiteDao {

    /**
     * 根据地址查询站点
     * @param area
     * @return
     */
    Site selectIdByArea(String area);

}