package com.cloud.cloudForum.service.impl;

import com.cloud.cloudForum.dao.UserDao;
import com.cloud.cloudForum.domain.User;
import com.cloud.cloudForum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int signup(User user) {
        return userDao.signUpUser(user);
    }

    @Override
    public User login(String email, String password) {
        User user = userDao.login(email, password);
        return user;
    }

    @Override
    public User findUserByEmail(String email) {
        return userDao.findUserByEmail(email);
    }
}
