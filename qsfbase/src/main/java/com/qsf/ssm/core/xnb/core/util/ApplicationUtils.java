package com.qsf.ssm.core.xnb.core.util;

import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * ApplicationUtils : 程序工具类，提供大量的便捷方�??
 *
 * @author StarZou
 * @since 2014-09-28 22:31
 */
public class ApplicationUtils {

    /**
     * 产生�??�??36个字符的UUID
     *
     * @return UUID
     */
    public static String randomUUID() {
        return UUID.randomUUID().toString();
    }

    /**
     * md5加密
     *
     * @param value 要加密的�??
     * @return md5加密后的�??
     */
    public static String md5Hex(String value) {
        return DigestUtils.md5Hex(value);
    }

    /**
     * sha1加密
     *
     * @param value 要加密的�??
     * @return sha1加密后的�??
     */
    public static String sha1Hex(String value) {
        return DigestUtils.sha1Hex(value);
    }

    /**
     * sha256加密
     *
     * @param value 要加密的�??
     * @return sha256加密后的�??
     */
    public static String sha256Hex(String value) {
        return DigestUtils.sha256Hex(value);
    }

}
