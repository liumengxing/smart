package com.juju.smart.api.response;

import com.juju.common.entity.JujuResponse;
import lombok.Getter;
import lombok.Setter;

public class UserResponse extends JujuResponse {
    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private String name;
}
