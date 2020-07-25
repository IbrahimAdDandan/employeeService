package com.dockerproject.employee.repository;

import com.dockerproject.employee.domain.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    public List<Employee> findByIsDeleted(boolean isDeleted);
}
