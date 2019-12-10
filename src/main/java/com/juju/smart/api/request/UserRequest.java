package com.juju.smart.api.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.juju.common.entity.JujuRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequest implements JujuRequest, Serializable {

    @ApiModelProperty(value = "用户id", required = true)
    private Long id;
    @ApiModelProperty(value = "用户名称", required = true)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
