package com.qsf.ssm.core.feature.orm.dialect;

/**
 * 数据库方�?抽象�?
 * 
 * @author StarZou
 * @since 2014�?5�?18�? 下午1:32:03
 **/
public abstract class Dialect {

    /**
     * 得到分页sql
     * 
     * @param sql
     * @param offset
     * @param limit
     * @return
     */
    public abstract String getLimitString(String sql, int offset, int limit);

    /**
     * 得到总数�? sql
     * 
     * @param sql
     * @return
     */
    public abstract String getCountString(String sql);

}
