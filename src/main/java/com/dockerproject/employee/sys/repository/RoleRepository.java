package com.dockerproject.employee.sys.repository;


import com.dockerproject.employee.sys.domain.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleRepository extends CrudRepository<Role, Long> {

    public Role findByRoleName(String name);
    public List<Role> findByIsDeleted(boolean isDeleted);
}
