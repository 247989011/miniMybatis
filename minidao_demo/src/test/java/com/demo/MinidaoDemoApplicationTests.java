package com.demo;

import com.demo.users.dao.UsersDao;
import com.demo.users.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MinidaoDemoApplicationTests {

    @Autowired(required = false)
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
