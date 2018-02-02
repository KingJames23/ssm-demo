/**
 * @(#)CrudController.java, 2018/2/1.
 * <p/>
 * Copyright 2018 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.kingjames.web.ssm.controller;

import sun.nio.cs.US_ASCII;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.kingjames.web.ssm.common.AjaxResult;
import com.kingjames.web.ssm.dao.UserDao;
import com.kingjames.web.ssm.po.User;

/**
 * @author 徐晓俊(xuxiaojun02 @ corp.netease.com)
 */

@Controller
@RequestMapping("/crud")
public class CrudController extends BaseAjaxController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/get")
    public User selectUserById(@RequestParam int id) {
        User user = userDao.selectUserById(id);
        System.out.println("id = " + user.getId() + "\nname = " + user.getName()
                + "\nage = " + user.getAge() + "\ncompany = " + user.getCompany());
        return user;
    }
    /*public AjaxResult selectUserById(@RequestParam int id) {
        System.out.println("id = " + id + "\n");
        //UserDao userDao = new UserDao();
        User user = userDao.selectUserById(id);
        System.out.println("id = " + user.getId() + "\nname = " + user.getName()
            + "\nage = " + user.getAge() + "\ncompany = " + user.getCompany());
        //return initSuccessResult(user);
        return initSuccessResult(user);
    }*/


}
