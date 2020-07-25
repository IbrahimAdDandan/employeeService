package com.dockerproject.employee.sys.service;


import com.dockerproject.employee.sys.domain.Privilege;
import com.dockerproject.employee.sys.repository.PrivilegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrivilegeService extends GenericService<Privilege>{

    @Autowired
    PrivilegeRepository privilegeRepository;

    public Privilege getBYName(String name) {
        return this.privilegeRepository.findByName(name);
    }

}