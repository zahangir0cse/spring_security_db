package com.zahangir.spring_security_db.service;

import com.zahangir.spring_security_db.model.Role;

/**
 * Created by Zahangir Alam on 2018-07-27.
 */
public interface RoleService {
    void addRole(Role role);
    Role getRoleByRole(String role);
}
