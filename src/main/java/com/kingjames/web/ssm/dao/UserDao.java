/**
 * @(#)UserDao.java, 2018/2/1.
 * <p/>
 * Copyright 2018 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.kingjames.web.ssm.dao;

import java.util.HashMap;
import java.util.Map;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.kingjames.web.ssm.po.User;

/**
 * @author 徐晓俊(xuxiaojun02 @ corp.netease.com)
 */
@Repository
public class UserDao {

    @Autowired
    protected SqlSessionTemplate sqlSessionTemplate;

    /**
     * 类名
     */
    private static final String CLASS_STR = UserDao.class.getName();

    public User selectUserById(int id){
        Map<String, Object> paramMap = new HashMap<String, Object>();

        paramMap.put("id", id);

        return sqlSessionTemplate.selectOne(CLASS_STR + ".selectUserById", paramMap);
    }

    public void addUser(User user){

    }

    public void deleteUser(User user){

    }

    public void updateUser(User user){

    }



}