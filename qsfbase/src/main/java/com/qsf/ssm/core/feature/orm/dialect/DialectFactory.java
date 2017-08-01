package com.qsf.ssm.core.feature.orm.dialect;

import org.apache.ibatis.session.Configuration;

/**
 * 数据库方�?工厂,产生方言对象
 * 
 * @author StarZou
 * @since 2014�?5�?18�? 下午1:32:23
 **/
public class DialectFactory {

    public static String dialectClass = null;

    public static Dialect buildDialect(Configuration configuration) {
        if (dialectClass == null) {
            synchronized (DialectFactory.class) {
                if (dialectClass == null) {
                    dialectClass = configuration.getVariables().getProperty("dialectClass");
                }
            }
        }
        Dialect dialect = null;
        try {
            dialect = (Dialect) Class.forName(dialectClass).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("请检�? mybatis-config.xml �?  dialectClass 是否配置正确?");
        }
        return dialect;
    }
}
