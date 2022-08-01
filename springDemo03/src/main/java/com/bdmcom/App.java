package com.bdmcom;

import com.bdmcom.dao.UserDao;
import com.bdmcom.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;


/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-18:22
 */
public class App {
    public static void main(String[] args) throws IOException, IOException {
        // 1. 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 2. 加载SqlMapConfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 3. 创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

        // 4. 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 5. 执行SqlSession对象执行查询，获取结果User
        UserDao userDao  = sqlSession.getMapper(UserDao.class);

        User ac = userDao.findById(2);
        System.out.println(ac);

        // 6. 释放资源
        sqlSession.close();
    }
}
