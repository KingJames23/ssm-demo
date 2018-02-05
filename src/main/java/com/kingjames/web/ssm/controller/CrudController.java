package com.kingjames.web.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.kingjames.web.ssm.common.AjaxResult;
import com.kingjames.web.ssm.dao.UserDao;
import com.kingjames.web.ssm.po.User;

/**
 * @author 徐晓俊
 */

@Controller
@RequestMapping("/crud")
public class CrudController extends BaseAjaxController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/get")
    public AjaxResult selectUserById(@RequestParam int id) {
        try {
            User user = userDao.selectUserById(id);

            if (user == null) {
                return initFailureResult("User of the id is null!");
            }

            return initSuccessResult(user);
        } catch (Exception e) {
            return initFailureResult("Exception");
        }

    }

    @RequestMapping(value = "/delete")
    public AjaxResult deleteUserById(@RequestParam int id) {
        try {
            boolean isSuccess = userDao.deleteUser(id);
            if (isSuccess) {
                return initSuccessResult("Delete success!");
            } else {
                return initFailureResult("Delete fail!");
            }
        } catch (Exception e) {
            return initFailureResult("Exception");
        }
    }

    @RequestMapping(value = "/update")
    public AjaxResult updateUser(@RequestParam int id,
        @RequestParam String company) {
        try {
            boolean isSuccess = userDao.updateUser(id, company);

            if (isSuccess) {
                return initSuccessResult("Update success!");
            } else {
                return initFailureResult("Update fail!");
            }
        } catch (Exception e) {
            return initFailureResult("Exception");
        }
    }

    /**
     * todo
     * 
     * @param user
     * @return
     */
    @RequestMapping(value = "/add")
    public AjaxResult addUser(@RequestBody User user) {
        try {
            boolean isSuccess = userDao.addUser(user);

            if (isSuccess) {
                return initSuccessResult("Insert success!");
            } else {
                return initFailureResult("Insert fail!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return initFailureResult("Exception");
        }
    }

}
