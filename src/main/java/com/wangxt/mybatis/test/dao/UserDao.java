package com.wangxt.mybatis.test.dao;

import com.wangxt.mybatis.test.pojo.UserDo;

import java.util.List;

public interface UserDao {

    /**
     * @author wangxt
     * @description 查询所有用户
     * @date 2022/2/8 9:57
     **/
    List<UserDo> queryList();

    /**
     * @author wangxt
     * @description 查询单个用户
     * @date 2022/2/8 9:58
     **/
    UserDo queryUser(UserDo user);
}
