package com.mage.crm.controller;

import com.mage.crm.model.User;
import com.mage.crm.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("list")
    public List<User> findAll() {

        List<User> users = userService.findAll();
        return users;
    }

}
