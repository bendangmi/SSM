package com.bdmcom.service;

import com.bdmcom.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-18:55
 */
@Service
public interface UserService {

    public void save( User user);


    public void delete(int id);


    public void update( User user);


    public List<User> findAll();

    public User findById( int id);
}
