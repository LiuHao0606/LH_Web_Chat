package com.lh.webchat.dao;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.lh.webchat.pojo.User;

import java.util.List;

/**
 * @author :  LH
 * @date   :  2019-11-08
 * TODO   :
 */
@Service(value = "userDao")
public interface IUserDao {
    List<User> selectAll(@Param("offset") int offset, @Param("limit") int limit);

    User selectUserByUserid(String userid);

    User selectCount();

    boolean insert(User user);

    boolean update(User user);

    boolean delete(String userid);
}
