package com.edu.holypearl.users.service;

import com.edu.holypearl.users.domain.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface UserService {

    public int create(User user);

    public User getUserById(@Param("id") Long id);
}
