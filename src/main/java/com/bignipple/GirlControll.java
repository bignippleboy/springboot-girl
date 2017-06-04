package com.bignipple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User: huangken
 * Date: 4/6/17
 * Time: 下午11:57
 */
@RestController
public class GirlControll {

    @Autowired
    private GirlRepository girlRepository;

    @GetMapping(value = "/girls")
    public List<Girl> girlList() {

        return girlRepository.findAll();
    }

    @PostMapping(value = "/add")
    public Girl addGirl(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);

        return girlRepository.save(girl);
    }

    @GetMapping(value = "/findByAge/{age}")
    public List<Girl> findGirlByAge(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }

}
