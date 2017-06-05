package com.bignipple.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * User: huangken
 * Date: 4/6/17
 * Time: 下午11:45
 */
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;

    private String cupSize;

    @Min(value = 18, message = "未成年少女禁止入内")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public Girl setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getCupSize() {
        return cupSize;
    }

    public Girl setCupSize(String cupSize) {
        this.cupSize = cupSize;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Girl setAge(Integer age) {
        this.age = age;
        return this;
    }
}
