package com.qsf.ssm.core.generic;

/**
 * �?有自定义枚举类型实现该接�?
 * 
 * @author StarZou
 * @since 2014�?5�?28�? 上午10:07:20
 **/
public interface GenericEnum {

    /**
     * value: 为保存在数据库中的�??
     */
    public String getValue();

    /**
     * text : 为前端显示�??
     */
    public String getText();

}
