package com.bignipple.enums;

/**
 * User: huangken
 * Date: 5/6/17
 * Time: AM11:10
 */
public enum ResultEnum {
    UNKNOW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    PRIMARY_SCHOLL(100, "你可能还在上小学"),
    MIDDILE_SCHOOL(101, "你可能在上初中")
    ;
    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
