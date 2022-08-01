package com.bdmcom.dao;

import com.bdmcom.domain.User;
import org.apache.ibatis.annotations.*;

import javax.annotation.PreDestroy;
import java.util.List;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-18:01
 */
public interface UserDao {

    @Insert("insert into tb_user (username, password) values (#{user.username}, #{user.password})")
    void save(@Param("user") User user);

    @Delete("delete from tb_user where id = #{id}")
    void delete(int id);

    @Update("update tb_user set username = #{user.username}, password = #{user.password} where id = #{user.id}")
    void update(@Param("user") User user);

    @Select("select * from tb_user")
    List<User> findAll();

    @Select("select * from tb_user where id = #{id}")
    User findById(@Param("id") int id);
}
