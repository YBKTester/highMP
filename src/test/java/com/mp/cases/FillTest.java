package com.mp.cases;

import com.mp.dao.UserMapper;
import com.mp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.mp.common.UserCommon.WANG_TIAN_FENG;
import static com.mp.common.UserCommon.WANG_TIAN_FENG_ID;

/**
 * 测试自动填充
 *
 * @author yang bingkun
 * create on 2020/6/5
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FillTest {
    @Autowired
    private UserMapper userMapper;

    /**
     * 测试自动填充方法
     */
    @Test
    public void insertFill() {
        User user = new User();
        user.setName("周碧");
        user.setAge(18);
        user.setEmail("zby@baomidu.com");
        user.setManagerId(WANG_TIAN_FENG_ID);
        int rows = userMapper.insert(user);
        System.out.println("影响行数： " + rows);
    }

    /**
     * 测试自动填充方法
     */
    @Test
    public void updateFill() {
        User user = new User();
        user.setName(WANG_TIAN_FENG);
        user.setAge(18);
        user.setEmail("zby@baomidu.com");
        user.setId(WANG_TIAN_FENG_ID);
//        user.setUpdateTime(LocalDateTime.now());
        int rows = userMapper.updateById(user);
        System.out.println("影响行数： " + rows);
    }
}
