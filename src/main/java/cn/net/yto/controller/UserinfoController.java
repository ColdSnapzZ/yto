package cn.net.yto.controller;

import cn.net.yto.entity.Userinfo;
import cn.net.yto.service.UserinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * (Userinfo)表控制层
 *
 * @author makejava
 * @since 2021-01-06 14:34:30
 */
@Controller
@RequestMapping("userinfo")
public class UserinfoController {
    /**
     * 服务对象
     */
    @Resource
    private UserinfoService userinfoService;


    @RequestMapping("login")
    @ResponseBody
    public boolean login(HttpSession session, String username, String password){
        System.out.println(username+"----"+password);
        //调用userinfoService查询方法并得到userinfo对象
        Userinfo userinfo = userinfoService.queryByUsernameAndPassword(username, password);
        //判断userinfo是否为空
        if (userinfo!=null){
            //设置session域对象
            session.setAttribute("userinfo",userinfo);
            //返回true
            return true;
        }
        //返回false
        return false;
    }

    @RequestMapping("register")
    @ResponseBody
    public boolean register(Userinfo userinfo){
        System.out.println(userinfo.toString());
        //调用userinfoService新增方法并得到userinfo对象
        int insert = userinfoService.insert(userinfo);
        //返回结果
        return insert>0;
    }

}