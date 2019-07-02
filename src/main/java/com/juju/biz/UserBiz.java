package com.juju.biz;

import com.juju.entity.User;

/**
 * @author juju
 * @date 2019/06/27
 */
public interface UserBiz {
    User findById(Long id);
}
