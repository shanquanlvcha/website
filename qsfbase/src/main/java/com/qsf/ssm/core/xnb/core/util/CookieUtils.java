package com.qsf.ssm.core.xnb.core.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * CookieUtils : 针对Http Cookie的工具类
 *
 * @author StarZou
 * @since 2014-09-28 22:31
 */
public class CookieUtils {

    /**
     * 设置 Cookie, 过期时间�??30分钟
     *
     * @param name  名称
     * @param value �??
     */
    public static Cookie setCookie(HttpServletResponse response, String name, String value, String path) {
        return addCookie(response, name, value, path, 60 * 30);
    }

    /**
     * 设置 Cookie, 过期时间自定�??
     *
     * @param name   名称
     * @param value  �??
     * @param maxAge 过期时间, 单位�??
     */
    public static Cookie addCookie(HttpServletResponse response, String name, String value, String path, int maxAge) {
        Cookie cookie = null;
        try {
            cookie = new Cookie(name, URLEncoder.encode(value, "UTF-8"));
            cookie.setMaxAge(maxAge);
            if (null != path) {
                cookie.setPath(path);
            }
            response.addCookie(cookie);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return cookie;
    }


    /**
     * 设置 Cookies, 过期时间自定�??
     *
     * @param response 响应对象
     * @param values   �??
     * @param path     路径
     * @param maxAge   过期时间, 单位�??
     * @return Cookies
     */
    public static ArrayList<Cookie> addCookies(HttpServletResponse response, Map<String, String> values, String path, int maxAge) {
        Set<Map.Entry<String, String>> entries = values.entrySet();
        ArrayList<Cookie> cookies = new ArrayList<Cookie>();
        try {
            for (Map.Entry<String, String> entry : entries) {
                Cookie cookie = new Cookie(entry.getKey(), URLEncoder.encode(entry.getValue(), "UTF-8"));
                cookie.setMaxAge(maxAge);
                if (null != path) {
                    cookie.setPath(path);
                }
                response.addCookie(cookie);
                cookies.add(cookie);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return cookies;
    }


    /**
     * 获得指定Cookie的�??
     *
     * @param name 名称
     * @return �??
     */
    public static String getCookie(HttpServletRequest request, String name) {
        return getCookie(request, null, name, false);
    }

    /**
     * 获得指定Cookie的�?�，并删除�??
     *
     * @param name 名称
     * @return �??
     */
    public static String getCookie(HttpServletRequest request, HttpServletResponse response, String name) {
        return getCookie(request, response, name, true);
    }

    /**
     * 获得指定Cookie的�??
     *
     * @param request   请求对象
     * @param response  响应对象
     * @param name      名字
     * @param isRemoved 是否移除
     * @return �??
     */
    public static String getCookie(HttpServletRequest request, HttpServletResponse response, String name, boolean isRemoved) {
        String value = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(name)) {
                    try {
                        value = URLDecoder.decode(cookie.getValue(), "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    if (isRemoved) {
                        cookie.setMaxAge(0);
                        response.addCookie(cookie);
                    }
                    return value;
                }
            }
        }
        return value;
    }
}
