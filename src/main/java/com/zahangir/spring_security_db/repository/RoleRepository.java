package com.zahangir.spring_security_db.repository;


import com.zahangir.spring_security_db.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Zahangir Alam on 2018-07-27.
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findRoleByRole(String role);
}
