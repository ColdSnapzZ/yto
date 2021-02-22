package cn.net.yto.controller;

import cn.net.yto.entity.Myorder;
import cn.net.yto.service.MyorderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * (Myorder)表控制层
 *
 * @author zht
 * @since 2021-01-05 15:10:44
 */
@RestController
@RequestMapping("myorder")
public class MyorderController {
    /**
     * 服务对象
     */
    @Resource
    private MyorderService myorderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Myorder selectOne(Integer id) {
        return this.myorderService.queryById(id);
    }

    @GetMapping(value = "selectAll",produces = {"application/json;charset=UTF-8"})
    public Map<String,Object> selectAll(int page, int  limit){
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("mag", "");
        map.put("count",myorderService.count());
        map.put("data",myorderService.queryAllByLimit((page-1)*limit, limit));
        return map;
    }

    @GetMapping("delete")
    public boolean delete(Integer oid) {
        return this.myorderService.deleteById(oid);
    }


   @PostMapping("insert")
   public Myorder insert(Myorder myorder){
        return this.myorderService.insert(myorder);

   }
   @PostMapping("update")
    public Myorder update(Myorder myorder){
       System.out.println("myorder = " + myorder);
        return this.myorderService.update(myorder);

   }


}