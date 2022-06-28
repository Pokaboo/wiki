package com.pokaboo.wiki.util;

import com.pokaboo.wiki.resp.CommonResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 统一异常处理类
 *
 * @author pokab
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 指定出现什么异常执行此方法
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonResp error(Exception e) {
        CommonResp commonResp = new CommonResp();
        commonResp.setSuccess(false);
        commonResp.setMessage("执行了全局异常处理");
        log.error(ExceptionUtil.getMessage(e));
        e.printStackTrace();
        return commonResp;
    }

    /**
     * 自定义异常处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(MyException.class)
    @ResponseBody
    public CommonResp error(MyException e) {
        CommonResp commonResp = new CommonResp();
        commonResp.setSuccess(false);
        commonResp.setMessage(e.getMessage());
        e.printStackTrace();
        log.error(ExceptionUtil.getMessage(e));
        return commonResp;
    }

    /**
     * NullPointerException
     *
     * @param e
     * @return
     */
    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public CommonResp error(NullPointerException e) {
        CommonResp commonResp = new CommonResp();
        commonResp.setSuccess(false);
        commonResp.setMessage("执行了NullPointerException");
        e.printStackTrace();
        log.error(ExceptionUtil.getMessage(e));
        return commonResp;
    }
}