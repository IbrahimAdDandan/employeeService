package com.dockerproject.employee.controller;

import com.dockerproject.employee.domain.Leavement;
import com.dockerproject.employee.service.LeaveService;
import com.dockerproject.employee.sys.controller.BaseController;
import com.dockerproject.employee.sys.service.PrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leaves")
public class Leaves extends BaseController<Leavement, LeaveService> {
    @Autowired
    public Leaves(PrivilegeService privilegeService, LeaveService leaveService) {
        super(privilegeService, leaveService);
    }
}
