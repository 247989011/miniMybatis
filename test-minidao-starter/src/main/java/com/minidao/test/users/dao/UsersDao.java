package com.minidao.test.users.dao;


import com.minidao.test.users.entity.Users;
import org.jeecgframework.minidao.annotation.Sql;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersDao {

    @Sql("select * from users")
    public List<Users> list();




}
