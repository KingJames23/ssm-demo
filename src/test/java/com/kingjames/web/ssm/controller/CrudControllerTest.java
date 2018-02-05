package com.kingjames.web.ssm.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.alibaba.fastjson.JSON;
import com.kingjames.web.ssm.common.AjaxResult;
import com.kingjames.web.ssm.po.User;

/**
 * @author 徐晓俊
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context-config.xml",
    "classpath:spring-mvc.xml" })
public class CrudControllerTest {
    @Autowired
    private CrudController crudController;

    @Test
    public void selectUserById() {
        AjaxResult result = crudController.selectUserById(1);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void deleteUserById() {
        AjaxResult result = crudController.deleteUserById(7);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void updateUser() {
        AjaxResult result = crudController.updateUser(1, "yidong");
        System.out.println(JSON.toJSONString(result));
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
        AjaxResult result = crudController.addUser(user);
        System.out.println(JSON.toJSONString(result));
    }
}
