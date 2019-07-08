package com.juju.smart.biz;

import com.juju.smart.entity.User;

/**
 * @author juju
 * @date 2019/06/27
 */
public interface UserBiz {
    User findById(Long id);
}
