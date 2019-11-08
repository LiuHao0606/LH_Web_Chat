package com.lh.webchat.service;

import java.util.List;

import com.lh.webchat.pojo.User;

/**
 * @author :  LH
 * @date   :  2019-11-08
 * TODO   :
 */
public interface IUserService {
    List<User> selectAll(int page, int pageSize);
    User selectUserByUserid(String userid);
    int selectCount(int pageSize);
    boolean insert(User user);
    boolean update(User user);
    boolean delete(String userid);
}
