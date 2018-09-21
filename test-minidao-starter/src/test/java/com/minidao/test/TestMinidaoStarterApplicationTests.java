package com.minidao.test;

import com.minidao.test.users.dao.UsersDao;
import com.minidao.test.users.entity.Users;
import org.jeecgframework.minidao.aop.MiniDaoHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMinidaoStarterApplicationTests {

    @Autowired
    private UsersDao usersDao;


    @Test
    public void contextLoads() {
        List<Users> users = usersDao.list();
        if (users.isEmpty()) {
            System.out.println("空的");
        }else{
            System.out.println("启动完成:" + users.toString());
        }

    }

}
