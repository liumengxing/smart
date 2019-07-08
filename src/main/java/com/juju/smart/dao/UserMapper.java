package com.juju.smart.dao;

import com.juju.smart.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User findById(@Param(value = "id") Long id);

    Long getCount();
}
