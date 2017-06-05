package com.bignipple.controller;

import com.bignipple.domain.Girl;
import com.bignipple.domain.ResultVO;
import com.bignipple.repository.GirlRepository;
import com.bignipple.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import utils.ResultUtil;

import javax.validation.Valid;
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

    @Autowired
    private GirlService girlService;

    @GetMapping(value = "/girls")
    public List<Girl> girlList() {

        return girlRepository.findAll();
    }

    @PostMapping(value = "/add")
//    public Girl addGirl(@RequestParam("cupSize") String cupSize,
//                        @RequestParam("age") Integer age) {
    public ResultVO<Girl> addGirl(@Valid Girl g, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }

        Girl girl = new Girl();
        girl.setAge(g.getAge());
        girl.setCupSize(g.getCupSize());

        return ResultUtil.success(girlRepository.save(girl));
    }

    @GetMapping(value = "/findByAge/{age}")
    public List<Girl> findGirlByAge(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }

    @GetMapping(value = "/girls/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception {
        girlService.getAge(id);
    }

    @PostMapping(value = "/girls/two")
    public void girlTwo() {
        girlService.insertTwo();
    }

}
