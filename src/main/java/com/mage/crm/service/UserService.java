package com.mage.crm.service;

import com.mage.crm.mapper.UserMapper;
import com.mage.crm.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

//    @Autowired
//    @Qualifier("userMapper")
    @Resource
    private UserMapper userMapper;

    public List<User> findAll() {
        List<User> users = userMapper.findAll();
        return users;
    }

    public void updateUser(String trueName,Integer userId) {
        userMapper.updateUser(trueName,userId);
//        int i = 1/0;
    }
}
