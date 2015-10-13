package com.edonoxako.schedule.backend.lecturer;

import com.edonoxako.schedule.backend.subject.Subject;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Евгений on 10.10.2015.
 */

@Entity
public class Lecturer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private String patronymic;

    public Lecturer() {
    }

    public Lecturer(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

}
