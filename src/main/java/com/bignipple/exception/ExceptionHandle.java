package com.bignipple.exception;

import com.bignipple.domain.ResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import utils.ResultUtil;


/**
 * User: huangken
 * Date: 5/6/17
 * Time: AM10:46
 * 统一异常处理
 */
@ControllerAdvice
public class ExceptionHandle {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultVO handle(Exception e) {
        if (e instanceof GirlException) {
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(), girlException.getMessage());
        } else {
            logger.error("【系统异常】：{}" + e);
            return ResultUtil.error(-1, "未知错误");
        }
    }
}
