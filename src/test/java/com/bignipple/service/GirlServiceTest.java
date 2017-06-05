package com.bignipple.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * User: huangken
 * Date: 5/6/17
 * Time: PM12:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void getAge() {
        int id = 2;
        try {
            girlService.getAge(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}