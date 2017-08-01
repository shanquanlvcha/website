package com.qsf.ssm.core.feature.orm.dialect;

/**
 * MySQLæ•°æ®åº“æ–¹è¨?
 * 
 * @author StarZou
 * @since 2014å¹?5æœ?18æ—? ä¸‹åˆ1:32:52
 **/
public class MySql5Dialect extends Dialect {

    protected static final String SQL_END_DELIMITER = ";";

    @Override
    public String getLimitString(String sql, int offset, int limit) {
        return MySql5PageHepler.getLimitString(sql, offset, limit);
    }

    @Override
    public String getCountString(String sql) {
        return MySql5PageHepler.getCountString(sql);
    }
}
