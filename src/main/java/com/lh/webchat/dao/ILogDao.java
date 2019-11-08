package com.lh.webchat.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.lh.webchat.pojo.Log;

import java.util.List;

/**
 * @author :  LH
 * @date   :  2019-11-08
 */
@Service(value = "logDao")
public interface ILogDao {
    List<Log> selectAll(@Param("offset") int offset, @Param("limit") int limit);

    List<Log> selectLogByUserid(@Param("userid") String userid, @Param("offset") int offset, @Param("limit") int limit);

    Log selectCount();

    Log selectCountByUserid(@Param("userid") String userid);

    boolean insert(Log log);

    boolean delete(String id);

    boolean deleteThisUser(String userid);

    boolean deleteAll();
}
