package com.company.commerce.repositories;

import com.company.commerce.auth.ERole;
import com.company.commerce.auth.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}