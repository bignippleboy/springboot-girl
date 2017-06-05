package com.bignipple.service;

import com.bignipple.domain.Girl;
import com.bignipple.enums.ResultEnum;
import com.bignipple.exception.GirlException;
import com.bignipple.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: huangken
 * Date: 5/6/17
 * Time: AM10:47
 */
@Service
public class GirlService {

    @Autowired
    GirlRepository girlRepository;

    public void getAge(Integer id) {
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if (age <= 10)
            throw new GirlException(ResultEnum.PRIMARY_SCHOLL);
        else if (age > 10 && age < 16)
            throw new GirlException(ResultEnum.MIDDILE_SCHOOL);
    }

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(18);
        girlRepository.save(girlB);
    }
}
