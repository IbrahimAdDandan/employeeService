package com.dockerproject.employee.service;

import com.dockerproject.employee.domain.Employee;
import com.dockerproject.employee.domain.Leavement;
import com.dockerproject.employee.repository.EmployeeRepository;
import com.dockerproject.employee.repository.LeaveRepository;
import com.dockerproject.employee.sys.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveService extends GenericService<Leavement> {
    @Autowired
    LeaveRepository leaveRepository;

    @Override
    public List<Leavement> getAll() {
        return leaveRepository.findByIsDeleted(false);
    }

    @Override
    public Leavement getOne(Long id) {
        return leaveRepository.findById(id).get();
    }

    public Leavement save(Leavement leave) {
        return leaveRepository.save(leave);
    }

    public void delete(Leavement leave) {
        leave.setDeleted(true);
        leaveRepository.save(leave);
    }
}
