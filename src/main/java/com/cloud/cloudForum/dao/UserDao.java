package com.cloud.cloudForum.dao;

import com.cloud.cloudForum.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao {

    /**
     * signup and add user to database
     * @param user
     * @return
     */
    int signUpUser(User user);

    /**
     * login
     * @param email
     * @param password
     * @return
     */
    User login(@Param("email") String email, @Param("password") String password);

    User findUserByEmail(@Param("email") String email);
}

