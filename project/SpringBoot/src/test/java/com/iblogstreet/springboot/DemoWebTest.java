package com.iblogstreet.springboot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoWebTest {
    //mock api模拟http请求
    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        //独立安装测试
//        MockMvcBuilders.standaloneSetup(new DemoController()).build();
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void getHello() throws Exception {
        //perform执行一个请求，post构造一个请求,andDo添加一个结果处理器
        mockMvc.perform(MockMvcRequestBuilders.post("/hello?name=jetty").accept(MediaType.APPLICATION_JSON_UTF8))
                .andDo(print());
    }
}
