package cn.net.yto.controller;

import cn.net.yto.entity.Location;
import cn.net.yto.util.RoutePlan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author zht
 * @Date 2021/3/3 16:05
 * @Description
 */
@RestController
@RequestMapping("route")
public class RouteController {
    @Resource
    private RoutePlan routePlan;

    @GetMapping(value = "getLocation",produces="application/json; utf-8")
    public Location getLocation(String address){
        return routePlan.getLocation(address);
    }
}
