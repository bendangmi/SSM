package com.bdm.exception;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/8/1-12:25
 */
public class SystemException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public SystemException(Integer code, String message ) {
        super(message);
        this.code = code;
    }

    public SystemException( Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }


}
