package com.dockerproject.employee.service;

import com.dockerproject.employee.domain.Leavement;
import com.dockerproject.employee.domain.Punishment;
import com.dockerproject.employee.repository.LeaveRepository;
import com.dockerproject.employee.repository.PunishmentRepository;
import com.dockerproject.employee.sys.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PunishmentService extends GenericService<Punishment> {

    @Autowired
    PunishmentRepository punishmentRepository;

    @Override
    public List<Punishment> getAll() {
        return punishmentRepository.findByIsDeleted(false);
    }

    @Override
    public Punishment getOne(Long id) {
        return punishmentRepository.findById(id).get();
    }

    public Punishment save(Punishment leave) {
        return punishmentRepository.save(leave);
    }

    public void delete(Punishment leave) {
        leave.setDeleted(true);
        punishmentRepository.save(leave);
    }
}
