package com.study.servicehi.service;

import com.study.servicehi.dao.UserDao;
import com.study.servicehi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    @Autowired
    private UserDao userDao;

    public User saveUser(String username, String password){
        User user = new User(username, password);
        user.setPassword(encoder.encode(user.getPassword()));
        userDao.save(user);
        return user;
    }

}
