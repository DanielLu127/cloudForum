package com.cloud.cloudForum.service;

import com.cloud.cloudForum.domain.User;

public interface UserService {
    int signup(User user);

    User login(String email, String password);

    User findUserByEmail(String email);

}
