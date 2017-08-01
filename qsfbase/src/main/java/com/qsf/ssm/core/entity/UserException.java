package com.qsf.ssm.core.entity;

/**
 * UserException : 用户自定义异�??
 *
 * @author StarZou
 * @since 2014-09-27 18:12
 */
public class UserException extends RuntimeException {

    /**
     * 异常发生时间
     */
    private long date = System.currentTimeMillis();

    public long getDate() {
        return date;
    }
}
