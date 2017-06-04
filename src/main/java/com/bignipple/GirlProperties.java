package com.bignipple;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * User: huangken
 * Date: 4/6/17
 * Time: PM10:43
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private String cupSize;

    private Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public GirlProperties setCupSize(String cupSize) {
        this.cupSize = cupSize;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public GirlProperties setAge(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "GirlProperties{" +
                "cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }
}
