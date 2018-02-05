
package com.kingjames.web.ssm.dao;

import java.util.HashMap;
import java.util.Map;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.kingjames.web.ssm.po.User;

/**
 * @author 徐晓俊
 */
@Repository
public class UserDao {

    @Autowired
    protected SqlSessionTemplate sqlSessionTemplate;

    /**
     * 类名
     */
    private static final String CLASS_STR = UserDao.class.getName();

    public User selectUserById(int id) {
        Map<String, Object> paramMap = new HashMap<String, Object>();

        paramMap.put("id", id);

        return sqlSessionTemplate.selectOne(CLASS_STR + ".selectUserById",
            paramMap);
    }

    public boolean addUser(User user) {
        Map<String, Object> paramMap = new HashMap<String, Object>();

        paramMap.put("name", user.getName());
        paramMap.put("age", user.getAge());
        paramMap.put("company", user.getCompany());
        paramMap.put("mobile", user.getMobile());
        paramMap.put("province", user.getProvince());
        paramMap.put("city", user.getCity());
        paramMap.put("district", user.getDistrict());
        paramMap.put("zipCode", user.getZipCode());

        return sqlSessionTemplate.insert(CLASS_STR + ".addUser", paramMap) > 0;
    }

    public boolean deleteUser(int id) {
        Map<String, Object> paramMap = new HashMap<String, Object>();

        paramMap.put("id", id);

        return sqlSessionTemplate.delete(CLASS_STR + ".deleteUser",
            paramMap) > 0;

    }

    public boolean updateUser(int id, String company) {
        Map<String, Object> paramMap = new HashMap<String, Object>();

        paramMap.put("id", id);
        paramMap.put("company", company);

        return sqlSessionTemplate.update(CLASS_STR + ".updateUser",
            paramMap) > 0;
    }

}
