package com.swarmcn.user.web.controller;

import com.alibaba.dubbo.config.annotation.DubboConsumer;
import com.swarmcn.user.api.UserServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ming on 2016/4/30.
 */
@Controller
public class UserController {


    @DubboConsumer
    private UserServiceI uicTemplate;

    @RequestMapping("/")
    public String index(Model model) {

        model.addAttribute("user", uicTemplate.findById(1L));
        return "index";
    }
}
