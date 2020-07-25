package com.dockerproject.employee.controller;

import com.dockerproject.employee.domain.Punishment;
import com.dockerproject.employee.service.PunishmentService;
import com.dockerproject.employee.sys.controller.BaseController;
import com.dockerproject.employee.sys.service.PrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/punish")
public class Punishments extends BaseController<Punishment, PunishmentService> {
    @Autowired
    public Punishments(PrivilegeService privilegeService, PunishmentService punishmentService) {
        super(privilegeService, punishmentService);
    }
}
