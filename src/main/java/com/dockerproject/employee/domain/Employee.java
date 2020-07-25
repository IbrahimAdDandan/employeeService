package com.dockerproject.employee.domain;

import com.dockerproject.employee.sys.domain.BaseModel;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Employee extends BaseModel {

    @Column
    private String fName;

    @Column
    private String lName;

    @Column
    private long identityNo;

    @Column
    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Column
    private String photo;

    @OneToMany(mappedBy = "employee")
    List<Leavement> leavments;

    @OneToMany(mappedBy = "employee")
    List<Punishment> punishments;

    public Employee() {
    }

    public Employee(Long id, Date createdDate, boolean isDeleted) {
        super(id, createdDate, isDeleted);
    }

    public Employee(String fName, String lName, long identityNo, Date birthday, String photo, List<Leavement> leavments, List<Punishment> punishments) {
        this.fName = fName;
        this.lName = lName;
        this.identityNo = identityNo;
        this.birthday = birthday;
        this.photo = photo;
        this.leavments = leavments;
        this.punishments = punishments;
    }

    public Employee(Long id, Date createdDate, boolean isDeleted, String fName, String lName, long identityNo, Date birthday, String photo, List<Leavement> leavments, List<Punishment> punishments) {
        super(id, createdDate, isDeleted);
        this.fName = fName;
        this.lName = lName;
        this.identityNo = identityNo;
        this.birthday = birthday;
        this.photo = photo;
        this.leavments = leavments;
        this.punishments = punishments;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public long getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(long identityNo) {
        this.identityNo = identityNo;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<Leavement> getLeavments() {
        return leavments;
    }

    public void setLeavments(List<Leavement> leavments) {
        this.leavments = leavments;
    }

    public List<Punishment> getPunishments() {
        return punishments;
    }

    public void setPunishments(List<Punishment> punishments) {
        this.punishments = punishments;
    }
}
