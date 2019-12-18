package com.juju.smart.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "juju")
public class YmlConfig {

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String age;
    @Getter
    @Setter
    private String character;
}
