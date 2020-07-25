package com.dockerproject.employee.service;

import com.dockerproject.employee.domain.Employee;
import com.dockerproject.employee.repository.EmployeeRepository;
import com.dockerproject.employee.sys.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService extends GenericService<Employee> {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findByIsDeleted(false);
    }

    @Override
    public Employee getOne(Long id) {
        return employeeRepository.findById(id).get();
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void delete(Employee employee) {
        employee.setDeleted(true);
        employeeRepository.save(employee);
    }
}

