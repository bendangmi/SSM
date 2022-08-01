package com.bdm.controller;

import com.bdm.exception.BusinessException;
import com.bdm.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/8/1-12:12
 */

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员
        System.out.println("系统异常");
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        System.out.println("业务异常");
        return new Result(ex.getCode(), null, ex.getMessage());
    }


    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){

        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员
        System.out.println("其他异常");
        return new Result(Code.SYSTEM_UNKNOWN_ERR, null, "系统繁忙，请稍后再试！");
    }
}
