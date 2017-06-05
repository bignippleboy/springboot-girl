package com.bignipple.domain;

/**
 * User: huangken
 * Date: 5/6/17
 * Time: AM10:29
 */
public class ResultVO<T> {
    private Integer code;

    private String msg;

    private T data;

    public Integer getCode() {
        return code;
    }

    public ResultVO setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResultVO setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResultVO setData(T data) {
        this.data = data;
        return this;
    }
}
