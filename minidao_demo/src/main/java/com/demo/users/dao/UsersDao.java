package com.demo.users.dao;


import com.demo.users.entity.Users;
import org.jeecgframework.minidao.annotation.IdAutoGenerator;
import org.jeecgframework.minidao.annotation.Param;
import org.jeecgframework.minidao.annotation.ResultType;
import org.jeecgframework.minidao.annotation.Sql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UsersDao {

    //=========================注解=======================
    @Sql("select count(*) from users ")
    public long count();

    @Sql("select * from users")
    public List<Users> list();

    @Sql("select * from users")
    public List<Map<String,Object>> listMap();

    @Sql("select * from users where id=:id")
    public Users get(@Param("id")int id);

    @Sql("select * from users where id=:id")
    public Map<String,Object> getMap(@Param("id")int id);

    @Sql("delete from users where id=:id")
    public int delete(@Param("id")int id);

    @Sql("update users set username=:username ,name=:name ,user_phone=:phone where id=:id")
    public int update(@Param("username") String username,@Param("name") String name,@Param("id") int id,@Param("phone")String phone);

    @IdAutoGenerator(generator="native")
    @Sql("insert into users(username,name,password ) value (:username,:name,:password)")
    public int insert( @Param("username") String username, @Param("name") String name, @Param("password") String password);

//=========================Sql文件===================
    //SQL文件目录规则，与minidao接口保持相同目录
    // （或者放在对应resource目录下）
    // SQL文件命名规则：{Dao接口名}_{方法名}.sql

    @ResultType(Users.class)
    public List<Users> listSQL(@Param("users")Users users,@Param("page")int page,@Param("rows")int rows);


}
