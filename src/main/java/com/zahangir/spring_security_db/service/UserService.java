package com.zahangir.spring_security_db.service;

import com.zahangir.spring_security_db.model.User;

/**
 * Created by Zahangir Alam on 2018-07-27.
 */
public interface UserService {
    void addUser(User user);
    User getUserByEmail(String email);
}
