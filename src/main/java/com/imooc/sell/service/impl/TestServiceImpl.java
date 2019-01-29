package com.imooc.sell.service.impl;

import com.imooc.sell.service.TestService;
import org.springframework.stereotype.Service;

/**
 * 描述:
 * 测试服务类实现
 *
 * @author liuzhanlin
 * @create 2019-01-29 12:38
 */
@Service("testService")
public class TestServiceImpl implements TestService {
    @Override
    public String getIdByName(String id) {
        if(id.equals("12")){
            return "admin";
        }
        return "guest";
    }
}
