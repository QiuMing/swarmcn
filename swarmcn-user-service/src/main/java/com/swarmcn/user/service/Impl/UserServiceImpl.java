package com.swarmcn.user.service.Impl;

import com.alibaba.dubbo.config.annotation.DubboService;
import com.swarmcn.user.api.UserServiceI;
import com.swarmcn.user.api.bean.User;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Ming on 2016/4/30.
 */
@Component
@DubboService(interfaceClass = UserServiceI.class)
public class UserServiceImpl implements UserServiceI {
    public User findById(Long id) {
        User user = new User();
        user.setId(id);
        user.setNick("nick:" + id);
        user.setCreatedAt(new Date());
        return user;
    }
}
