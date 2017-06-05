package com.bignipple.controller;

import com.bignipple.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: huangken
 * Date: 4/6/17
 * Time: 下午5:46
 */
@RestController
public class HelloController {

    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private String age;

    @Value(("${content}"))
    private String content;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = {"/hello","/hi"}, method = RequestMethod.GET)
    public String say() {
//        return cupSize + "," + age + "," + content;
        return girlProperties.toString();
    }
}
