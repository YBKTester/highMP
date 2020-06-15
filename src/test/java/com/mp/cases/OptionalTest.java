package com.mp.cases;

import com.mp.dao.UserMapper;
import com.mp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.mp.common.UserCommon.WANG_TIAN_FENG_ID;

/**
 * 测试乐观锁
 *
 * @author yang bingkun
 * create on 2020/6/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OptionalTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void updateById() {
        int version = 1;
        User user = new User();
        user.setEmail("ybk@qq.com");
        user.setId(WANG_TIAN_FENG_ID);
        user.setVersion(version);
        int rows = userMapper.updateById(user);
        System.out.println(rows);
    }
}
