package com.juju.smart.api.response;

import com.google.common.base.Converter;
import com.juju.common.entity.JujuResponse;
import com.juju.smart.entity.User;
import org.springframework.beans.BeanUtils;

public class UserResponse extends JujuResponse {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
