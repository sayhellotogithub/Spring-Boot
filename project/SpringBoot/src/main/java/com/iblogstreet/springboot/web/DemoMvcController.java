package com.iblogstreet.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Armyone
 * @date 2018/7/26 16:13
 * @desc
 */
@RestController
public class DemoMvcController {
    @RequestMapping(value = {"/demomvcindex", "demomvcindex1"}, method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> demoMvcIndex() {
        Map<String, String> map = new HashMap<>();
        map.put("river", "is clear");
        map.put("road", "is hard");
        return map;
    }
}
