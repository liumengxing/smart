package com.juju.smart.api.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.juju.common.entity.JujuRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

import java.io.Serializable;

@ApiModel
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequest implements JujuRequest, Serializable {

    @ApiModelProperty(value = "用户id", required = true)
    @Getter
    private Long id;
    @ApiModelProperty(value = "用户名称", required = true)
    @Getter
    private String name;
}
