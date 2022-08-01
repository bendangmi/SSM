package com.bdmcom.service.impl;

import com.bdmcom.dao.UserDao;
import com.bdmcom.domain.User;
import com.bdmcom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-19:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void save( User user){
        userDao.save(user);
    }


    public void delete(int id){
        userDao.delete(id);
    }


    public void update( User user){
        userDao.update(user);
    }


    public List<User> findAll(){
        return userDao.findAll();
    }

    public User findById( int id){
        return userDao.findById(id);
    }
}

