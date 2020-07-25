package com.dockerproject.employee.domain;

import com.dockerproject.employee.sys.domain.BaseModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Leavement extends BaseModel {

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate = Calendar.getInstance().getTime();

    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Date endDate;

    private boolean isChecked = false;

    private boolean isApproved;

    @ManyToOne
    @JsonIgnore
    private Employee employee;

    public Leavement(Date startDate, Date endDate, boolean isChecked, boolean isApproved, Employee employee) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.isChecked = isChecked;
        this.isApproved = isApproved;
        this.employee = employee;
    }

    public Leavement(Long id, Date createdDate, boolean isDeleted, Date startDate, Date endDate, boolean isChecked, boolean isApproved, Employee employee) {
        super(id, createdDate, isDeleted);
        this.startDate = startDate;
        this.endDate = endDate;
        this.isChecked = isChecked;
        this.isApproved = isApproved;
        this.employee = employee;
    }

    public Leavement() {}

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
