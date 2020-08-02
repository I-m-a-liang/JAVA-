package com.edu.holypearl.users.dao.user;

import com.edu.holypearl.users.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao
{
    public int create(User user);

    public User getUserById(@Param("id") Long id);
}
