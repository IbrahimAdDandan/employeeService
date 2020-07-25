package com.dockerproject.employee.domain;

import com.dockerproject.employee.sys.domain.BaseModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Punishment extends BaseModel {

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate = Calendar.getInstance().getTime();

    @ManyToOne
    @JsonIgnore
    private Employee employee;

    public Punishment(Date startDate, Employee employee) {
        this.startDate = startDate;
        this.employee = employee;
    }

    public Punishment(Long id, Date createdDate, boolean isDeleted, Date startDate, Employee employee) {
        super(id, createdDate, isDeleted);
        this.startDate = startDate;
        this.employee = employee;
    }

    public Punishment(){}

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
