package cn.net.yto.controller;

import cn.net.yto.entity.Userinfo;
import cn.net.yto.service.UserinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
    public String login(HttpServletRequest request,String username, String password){
        Userinfo userinfo = userinfoService.queryByUsernameAndPassword(username, password);
        if (userinfo!=null){
            request.getSession().setAttribute("userinfo",userinfo);
            return "success";
        }
        return "failure";
    }

    @RequestMapping("register")
    @ResponseBody
    public String register(Userinfo userinfo){
        int insert = userinfoService.insert(userinfo);
        if (insert>0){
            return "success";
        }
        return "failure";
    }

}