package com.imooc.sell.controller;

import com.imooc.sell.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 * 测试Controller
 *
 * @author liuzhanlin
 * @create 2019-01-29 11:56
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public String Test(@RequestParam("id") String id){
        return testService.getRolebyId(id);
    }
    @RequestMapping("/get_access")
    public String getAccess(@RequestParam("role") String role){
        return testService.getAccess(role);
    }
}
