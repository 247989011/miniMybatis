package com.demo;

import org.jeecgframework.minidao.factory.MiniDaoBeanScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Configuration
public class Config {

    @Bean
    public MiniDaoBeanScannerConfigurer miniDaoHandler() {
        MiniDaoBeanScannerConfigurer miniDaoHandler = new MiniDaoBeanScannerConfigurer();
        miniDaoHandler.setAnnotation(Repository.class);//使用的注解,默认是Minidao,推荐 Repository
        miniDaoHandler.setBasePackage("com.jeecg.demo.dao,com.jeecg.demo,com.demo.users.dao");//dao地址,配置符合spring方式
        miniDaoHandler.setDbType("mysql");//数据库类型  mysql/postgresql/oracle/sqlserver
        miniDaoHandler.setShowSql(false);//输出sql
        miniDaoHandler.setFormatSql(false);//格式化sql
        miniDaoHandler.setKeyType("lower");//是使用什么字母做关键字Map的关键字 默认值origin 即和sql保持一致,lower小写(推荐),upper 大写
        return miniDaoHandler;
    }


}
