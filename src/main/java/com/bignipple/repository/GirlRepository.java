package com.bignipple.repository;

import com.bignipple.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * User: huangken
 * Date: 4/6/17
 * Time: 下午11:59
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    //额外通过年龄来查询
    public List<Girl> findByAge(Integer age);
}
