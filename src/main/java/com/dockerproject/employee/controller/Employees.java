package com.dockerproject.employee.controller;

import com.dockerproject.employee.domain.Employee;
import com.dockerproject.employee.service.EmployeeService;
import com.dockerproject.employee.sys.controller.BaseController;
import com.dockerproject.employee.sys.service.PrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class Employees extends BaseController<Employee, EmployeeService> {

    @Autowired
    public Employees(PrivilegeService privilegeService, EmployeeService employeeService) {
        super(privilegeService, employeeService);
    }
}
