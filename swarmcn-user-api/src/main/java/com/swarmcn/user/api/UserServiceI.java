package com.swarmcn.user.api;

import com.swarmcn.user.api.bean.User;

/**
 * Created by Ming on 2016/4/30.
 */
public interface UserServiceI {
    public User findById(Long id);
}
