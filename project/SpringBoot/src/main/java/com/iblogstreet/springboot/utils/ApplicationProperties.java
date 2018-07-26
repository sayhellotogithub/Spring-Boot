package com.iblogstreet.springboot.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Armyone
 * @date 2018/7/26 15:58
 * @desc
 */
@Component
public class ApplicationProperties {
    @Value("${com.iblogstreet.copyright}")
    private String copyRight;

    public String getCopyRight() {
        return copyRight;
    }

    public void setCopyRight(String copyRight) {
        this.copyRight = copyRight;
    }
}
