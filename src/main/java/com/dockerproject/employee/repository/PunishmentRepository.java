package com.dockerproject.employee.repository;

import com.dockerproject.employee.domain.Leavement;
import com.dockerproject.employee.domain.Punishment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PunishmentRepository extends CrudRepository<Punishment, Long> {
    public List<Punishment> findByIsDeleted(boolean isDeleted);
}
