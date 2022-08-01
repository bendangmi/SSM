package com.bdm.factory;

import com.bdm.dao.UserDao;
import com.bdm.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-9:06
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    // 代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    // true代表单例，false代表非单例
    @Override
    public boolean isSingleton() {
        return true;
    }

}
