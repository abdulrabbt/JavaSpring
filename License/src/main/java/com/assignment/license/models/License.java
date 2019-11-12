package com.assignment.license.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Future;
import java.util.Date;

@Entity
@Table(name="licenses")
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    @Future
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date expiration_date;

    private String state;

    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="person_id")
    private Person person;

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }

    public License() {
    }

    public License(Long id, String number, Date expiration_date, String state, Person person) {
        this.id = id;
        this.number = number;
        this.expiration_date = expiration_date;
        this.state = state;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public Date getExpiration_date() {
        return expiration_date;
    }

    public String getState() {
        return state;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Person getPerson() {
        return person;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
