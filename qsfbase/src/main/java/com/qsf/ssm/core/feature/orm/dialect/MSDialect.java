package com.qsf.ssm.core.feature.orm.dialect;

/**
 * MSSQL æ•°æ®åº“æ–¹è¨?
 * 
 * @author StarZou
 * @since 2014å¹?5æœ?18æ—? ä¸‹åˆ1:32:33
 **/
public class MSDialect extends Dialect {

    protected static final String SQL_END_DELIMITER = ";";

    @Override
    public String getLimitString(String sql, int offset, int limit) {
        return MSPageHepler.getLimitString(sql, offset, limit);
    }

    @Override
    public String getCountString(String sql) {
        return MSPageHepler.getCountString(sql);
    }
}
