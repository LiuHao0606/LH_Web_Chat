package com.lh.webchat.utils;

import com.lh.webchat.pojo.Log;

/**
 * @author :  LH
 * @date   :  2019-11-08
 * TODO   :
 */
public class LogUtil {

    public Log setLog(String userid, String time, String type, String detail, String ip){
         Log log = new Log();
        log.setUserid(userid);
        log.setTime(time);
        log.setType(type);
        log.setDetail(detail);
        log.setId(ip);
        return log;
    }

}
