package com.demo.users.dao;


import com.demo.users.entity.Users;
import org.jeecgframework.minidao.annotation.Sql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersDao {

    @Sql("select * from users")
    public List<Users> list();




}
