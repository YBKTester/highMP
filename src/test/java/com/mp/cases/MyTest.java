package com.mp.cases;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mp.dao.UserMapper;
import com.mp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static com.mp.common.UserCommon.LIU_HONG_YU_ID;
import static com.mp.common.UserCommon.WANG_TIAN_FENG_ID;

/**
 * 测试类
 *
 * @author yang bingkun
 * create on 2020/6/5
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void deleteById() {
        int rows = userMapper.deleteById(LIU_HONG_YU_ID);
        System.out.println("影响行数： " + rows);
    }

    @Test
    public void select() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    public void updateById() {
        User user = new User();
        user.setAge(26);
        user.setId(WANG_TIAN_FENG_ID);
        int rows = userMapper.updateById(user);
        System.out.println("影响行数： " + rows);
    }

    @Test
    public void mySelect() {
        LambdaQueryWrapper<User> lambdaQuery = Wrappers.lambdaQuery();
        lambdaQuery.gt(User::getAge, 25).eq(User::getDeleted, 0);
        List<User> userList = userMapper.mySelectList(lambdaQuery);
        userList.forEach(System.out::println);
    }
}
