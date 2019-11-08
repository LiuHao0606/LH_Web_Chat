package com.lh.webchat.utils;

import java.util.UUID;

/**
 * @author :  LH
 * @date   :  2019-11-08
 */
public class StringUtil {

    public static String getGuid(){
        return UUID.randomUUID().toString().trim().replaceAll("-", "").toLowerCase();
    }

}
