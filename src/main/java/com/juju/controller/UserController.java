package com.juju.controller;

import com.juju.biz.UserBiz;
import com.juju.entity.User;
import com.juju.service.UserService;
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
