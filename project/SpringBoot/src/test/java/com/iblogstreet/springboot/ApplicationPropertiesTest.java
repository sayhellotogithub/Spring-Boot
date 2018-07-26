package com.iblogstreet.springboot;

import com.iblogstreet.springboot.utils.ApplicationProperties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Armyone
 * @date 2018/7/26 16:01
 * @desc
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationPropertiesTest {
    @Resource
    ApplicationProperties applicationProperties;

    @Test
    public void ApplicationProperties() {
        System.out.println(applicationProperties.getCopyRight());
    }

}
