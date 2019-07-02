package com.juju.dao;

import com.juju.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User findById(@Param(value = "id") Long id);

    Long getCount();
}
