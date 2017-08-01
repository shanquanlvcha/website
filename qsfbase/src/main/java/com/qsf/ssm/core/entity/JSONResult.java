package com.qsf.ssm.core.entity;


/**
 * JSONResult : Response JSONResult for RESTful,封装返回JSON格式的数�??
 *
 * @author StarZou
 * @since 2014�??5�??26�?? 上午10:51:46
 */

public class JSONResult<T> extends Result {

    private static final long serialVersionUID = 7880907731807860636L;

    /**
     * 数据
     */
    private T data;


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public JSONResult() {
        super();
    }

    /**
     * 自定义返回的结果
     *
     * @param data
     * @param message
     * @param success
     */
    public JSONResult(T data, String message, boolean success) {
        this.data = data;
        super.setMessage(message);
        super.setSuccess(success);
    }

    /**
     * 成功返回数据和消�??
     *
     * @param data
     * @param message
     */
    public JSONResult(T data, String message) {
        this.data = data;
        super.setMessage(message);
        super.setSuccess(true);
    }

    /**
     * 成功返回数据
     *
     * @param data
     */
    public JSONResult(T data) {
        this.data = data;
        super.setSuccess(true);
    }
}