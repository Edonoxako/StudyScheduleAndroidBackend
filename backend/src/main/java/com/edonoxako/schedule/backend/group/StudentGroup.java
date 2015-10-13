package com.edonoxako.schedule.backend.group;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Евгений on 10.10.2015.
 */

@Entity
public class StudentGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String number;
    private String institute;

    public StudentGroup() {
    }

    public StudentGroup(String number, String institute) {
        this.number = number;
        this.institute = institute;
    }

    public long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }
}
