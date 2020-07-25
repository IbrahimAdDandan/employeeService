package com.dockerproject.employee.repository;

import com.dockerproject.employee.domain.Employee;
import com.dockerproject.employee.domain.Leavement;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LeaveRepository extends CrudRepository<Leavement, Long> {
    public List<Leavement> findByIsDeleted(boolean isDeleted);
}
