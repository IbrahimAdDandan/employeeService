package com.dockerproject.employee.sys.service;

import com.dockerproject.employee.sys.domain.Role;
import com.dockerproject.employee.sys.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService extends GenericService<Role> {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<Role> getAll() {
        return roleRepository.findByIsDeleted(false);
    }

    @Override
    public Role getOne(Long id) {
        return roleRepository.findById(id).get();
    }

    public Role save(Role role) {
        return roleRepository.save(role);
    }

    public void delete(Role role) {
        role.setDeleted(true);
        roleRepository.save(role);
    }

}
