package com.juju.smart.unittest;

import com.juju.smart.entity.YmlConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class YmlConfigTest {
    @Autowired
    YmlConfig ymlConfig;

    @Test
    public void ymlContextLoads(){
        System.out.println(ymlConfig.getName());
        System.out.println(ymlConfig.getAge());
        System.out.println(ymlConfig.getCharacter());
    }
}
