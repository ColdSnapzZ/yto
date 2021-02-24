package cn.net.yto.service.impl;

import cn.net.yto.dao.EmployeeDao;
import cn.net.yto.dao.LogisticsInfoDao;
import cn.net.yto.dao.MyorderDao;
import cn.net.yto.dao.PickupworkorderDao;
import cn.net.yto.entity.Pickupworkorder;
import cn.net.yto.service.PickupworkorderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Pickupworkorder)表服务实现类
 *
 * @author zht
 * @since 2021-02-23 09:45:14
 */
@Service("pickupworkorderService")
public class PickupworkorderServiceImpl implements PickupworkorderService {
    @Resource
    private PickupworkorderDao pickupworkorderDao;
    @Resource
    private MyorderDao myorderDao;
    @Resource
    private EmployeeDao employeeDao;
    @Resource
    private LogisticsInfoDao logisticsInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param puid 主键
     * @return 实例对象
     */
    @Override
    public Pickupworkorder queryById(Integer puid) {
        return this.pickupworkorderDao.queryById(puid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Pickupworkorder> queryAllByLimit(int offset, int limit) {
        return this.pickupworkorderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pickupworkorder 实例对象
     * @return 实例对象
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean insert(Pickupworkorder pickupworkorder) {
        if(this.pickupworkorderDao.insert(pickupworkorder)>0){
            return myorderDao.updateStatus(pickupworkorder.getOnumber(), 2)>0;
        }
        return false;
    }

    /**
     * 修改数据
     *
     * @param pickupworkorder 实例对象
     * @return 实例对象
     */
    @Override
    public Pickupworkorder update(Pickupworkorder pickupworkorder) {
        this.pickupworkorderDao.update(pickupworkorder);
        return this.queryById(pickupworkorder.getPuid());
    }

    /**
     * 通过主键删除数据
     *
     * @param puid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer puid) {
        return this.pickupworkorderDao.deleteById(puid) > 0;
    }

    @Override
    public int countByEmpId(String empid,Integer status) {
        return pickupworkorderDao.countByEmpId(empid,status);
    }

    @Override
    public int updateStatusBynumber(String number, int status) {
        return pickupworkorderDao.updateStatusBynumber(number, status);
    }

    /*@Override
    @Scheduled()
    public boolean autoInsert(String siteId) {
        List<Employee> employees = employeeDao.selectBySiteIdAndJob(siteId, 1);
        //myorderDao.selectByStatusAndArea(1, , , )
        for (Employee employee : employees) {

        }
        return false;
    }*/
}