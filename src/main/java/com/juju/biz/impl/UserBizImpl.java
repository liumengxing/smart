package com.juju.biz.impl;

import com.juju.biz.UserBiz;
import com.juju.dao.UserMapper;
import com.juju.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author juju
 * @date 2019/06/27
 */
@Component
public class UserBizImpl implements UserBiz {
    @Autowired
    UserMapper userMapper;

    @Override
    public User findById(Long id) {
        Long count =userMapper.getCount();
        return userMapper.findById(id);
    }
}
