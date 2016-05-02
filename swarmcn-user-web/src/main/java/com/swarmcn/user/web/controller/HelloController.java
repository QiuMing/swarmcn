package com.swarmcn.user.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.swarmcn.user.api.bean.Role;
import com.swarmcn.user.api.mapper.RoleMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Ming on 2016/5/1.
 */
@RestController
public class HelloController {

    @Autowired
    RoleMapper roleMapper;

    @RequestMapping(method=RequestMethod.GET,value="/hello")
    @ApiOperation(httpMethod = "GET", value = "Say Hello To World using Swagger")
    public PageInfo<Role> sayHello() {
        PageHelper.startPage(1,1);
        List<Role> roles = roleMapper.selectAll();
        PageInfo<Role> page = new PageInfo<Role>(roles);
        return page;
    }
}