package com.study.authserver.dao;

import com.study.authserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(Object name);
}
