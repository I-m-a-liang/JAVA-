package com.edu.holypearl.users.service.impl;

import com.edu.holypearl.users.dao.user.UserDao;
import com.edu.holypearl.users.domain.entity.User;
import com.edu.holypearl.users.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;


    @Override
    public int create(User user) {
        return userDao.create(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }
}
