package com.kingjames.web.ssm.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.alibaba.fastjson.JSON;
import com.kingjames.web.ssm.common.AjaxResult;
import com.kingjames.web.ssm.controller.CrudController;
import com.kingjames.web.ssm.po.User;
import static org.junit.Assert.*;

/**
 * @author 徐晓俊
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-mvc.xml",
    "classpath:context-config.xml" })

public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void selectUserById() {
        User user = userDao.selectUserById(1);
        System.out.println(JSON.toJSONString(user));
    }

    @Test
    public void deleteUserById() {
        boolean isDelete = userDao.deleteUser(7);
        System.out.println(isDelete);
    }

    @Test
    public void updateUser() {
        boolean isUpdate = userDao.updateUser(1, "yidong");
        System.out.println(isUpdate);
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setName("Demo");
        user.setAge(20);
        user.setCompany("company");
        user.setMobile("mobile");
        user.setProvince("Province");
        user.setCity("city");
        user.setDistrict("District");
        user.setZipCode("zipCode");

        boolean isAdd = userDao.addUser(user);
        System.out.println(isAdd);
    }
}
