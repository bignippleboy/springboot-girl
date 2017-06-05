package com.bignipple.exception;

import com.bignipple.enums.ResultEnum;

/**
 * User: huangken
 * Date: 5/6/17
 * Time: AM10:59
 */
public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public GirlException setCode(Integer code) {
        this.code = code;
        return this;
    }
}
