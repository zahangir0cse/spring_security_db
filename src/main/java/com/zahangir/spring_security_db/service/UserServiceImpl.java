package com.zahangir.spring_security_db.service;

import com.zahangir.spring_security_db.model.User;
import com.zahangir.spring_security_db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Zahangir Alam on 2018-07-27.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

}
