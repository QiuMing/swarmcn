package com.swarmcn.user.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by Ming on 2016/5/1.
 */
@RestController
public class HelloController {
    @RequestMapping(method=RequestMethod.GET,value="saurzcode/hello")
    @ApiOperation(httpMethod = "GET", value = "Say Hello To World using Swagger")
    public String sayHello() {
        return "Greetings from SaurzCode! ";
    }



}