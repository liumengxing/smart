package com.juju.smart.unittest;

import com.juju.common.entity.JujuRequest;
import com.juju.common.unittest.UnitTestTemplate;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserTest {
    private MockMvc mvc;

    @Autowired
    private WebApplicationContext context;

    @Before
    public void before() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testGet() throws Exception {
        new UnitTestTemplate<JujuRequest>() {
            @Override
            protected void prepareData() throws Exception {
                setUrl("/user/1");
            }

            @Override
            protected void executeTest() throws Exception {
                doGet(mvc);
            }

            @Override
            protected void assertResult() throws Exception {
                resultActions.andExpect(MockMvcResultMatchers.status().isOk())
                        .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8))
                        .andExpect(MockMvcResultMatchers.jsonPath("id").value("1"))
                        .andExpect(MockMvcResultMatchers.jsonPath("name").value("admin"))
                        .andDo(MockMvcResultHandlers.print());
            }
        }.run();
    }

    @After
    public void after() throws Exception{
        System.out.println("after print juju");
    }
}
