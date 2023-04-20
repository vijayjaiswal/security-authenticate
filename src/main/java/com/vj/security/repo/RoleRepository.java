package com.vj.security.repo;

import java.util.Optional;

import com.vj.security.model.jwt.ERole;
import com.vj.security.model.jwt.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
