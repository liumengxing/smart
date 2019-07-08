package com.juju.smart.controller;

import com.juju.smart.biz.UserBiz;
import com.juju.smart.entity.User;
import com.juju.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author juju
 * @date 2019/06/27
 */
@RestController
public class UserController implements UserService {
    @Autowired
    private UserBiz userBiz;

    @Override
    public User findById(@PathVariable("id") Long id) {
        return userBiz.findById(id);
    }
}
