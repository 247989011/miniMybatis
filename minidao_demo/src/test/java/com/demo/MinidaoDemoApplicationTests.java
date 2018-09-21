package com.demo;

import com.demo.users.dao.UsersDao;
import com.demo.users.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MinidaoDemoApplicationTests {
    private Logger logger = LoggerFactory.getLogger(MinidaoDemoApplicationTests.class);

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

    @Test
    public void test() {
        long count = usersDao.count();
        List<Users> usersList = usersDao.list();
        List<Map<String, Object>> mapList = usersDao.listMap();
        Users users= usersDao.get(1);
        Map<String, Object> map = usersDao.getMap(1);
        int delete = usersDao.delete(3);
        int update = usersDao.update("这是username", "jim", 4, "13521241245");
        int insert = usersDao.insert( "admin", "rom", "123465");


        List<Users> usersBySql = usersDao.listSQL(users, 0, 2);


        logger.info("count :{}", count);
        logger.info("usersList :{}", usersList);
        logger.info("mapList :{}", mapList);
        logger.info("users :{}", users);
        logger.info("map :{}", map);
        logger.info("delete :{}", delete);
        logger.info("update :{}", update);
        logger.info("insert :{}", insert);
        logger.info("usersBySql :{}", usersBySql);

    }


}
