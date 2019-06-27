package com.juju.controller;

import com.juju.biz.UserBiz;
import com.juju.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author juju
 * @date 2019/06/27
 */
public class UserController implements UserService {
    @Autowired
    private UserBiz userBiz;

    @Override
    public List<String> getCharacters(String name) {
        return userBiz.getCharacters(name);
    }
}
