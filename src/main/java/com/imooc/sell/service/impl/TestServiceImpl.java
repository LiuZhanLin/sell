package com.imooc.sell.service.impl;

import com.imooc.sell.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
    public String getRolebyId(String id) {
        if(id.equals("12")){
            return "admin";
        }
        return "guest";
    }

    @Override
    public String getAccess(String role) {
        if(!StringUtils.isEmpty(role)&&role.equals("admin")){
            return "001；002；003";
        }
        return "error role";
    }
}
