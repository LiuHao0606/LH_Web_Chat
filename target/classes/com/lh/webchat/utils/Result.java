package com.lh.webchat.utils;

import java.util.HashMap;

/**
 * 公共返回类
 * @author :  LH
 * @date   :  2019-11-08
 */
public class Result extends HashMap {
    public static final int SUCCESS = 0;
    public static final int ERROR = -1;

    public Result(int _result, String _msg){
        this.put("result", _result);
        this.put("msg", _msg);
    }

    public static Result success(String _msg){
        return new Result(SUCCESS, _msg);
    }

    public static Result error(String _msg){
        return new Result(ERROR, _msg);
    }
}
