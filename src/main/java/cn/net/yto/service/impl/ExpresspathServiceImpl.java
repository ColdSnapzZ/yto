package cn.net.yto.service.impl;

import cn.net.yto.dao.ExpresspathDao;
import cn.net.yto.entity.Expresspath;
import cn.net.yto.service.ExpresspathService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Expresspath)表服务实现类
 *
 * @author zht
 * @since 2021-03-05 11:04:28
 */
@Service("expresspathService")
public class ExpresspathServiceImpl implements ExpresspathService {
    @Resource
    private ExpresspathDao expresspathDao;


    @Override
    public Expresspath queryByNumber(String number) {
        return expresspathDao.queryByNumber(number);
    }

    @Override
    public int insert(Expresspath expresspath) {
        return expresspathDao.insert(expresspath);
    }

    @Override
    public int update(Expresspath expresspath) {
        return expresspathDao.update(expresspath);
    }

    @Override
    public String nextAddress(Expresspath expresspath) {
        //根据-分割path
        String[] addresses = expresspath.getPath().split("-");
        //获取下标获取下一个地址
        String address = addresses[expresspath.getMark() + 1];
        //更新下标
        expresspath.setMark(expresspath.getMark()+1);
        //调用update方法更新expresspath
        this.update(expresspath);
        //返回address
        return address;
    }

}