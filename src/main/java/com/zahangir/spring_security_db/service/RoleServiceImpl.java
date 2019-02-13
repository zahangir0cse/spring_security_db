package com.zahangir.spring_security_db.service;

import com.zahangir.spring_security_db.model.Role;
import com.zahangir.spring_security_db.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Zahangir Alam on 2018-07-27.
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;
    @Override
    public void addRole(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Role getRoleByRole(String role) {
        return roleRepository.findRoleByRole(role);
    }

}
