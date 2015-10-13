package com.edonoxako.schedule.backend.subject;

import com.edonoxako.schedule.backend.group.StudentGroup;
import com.edonoxako.schedule.backend.lecturer.Lecturer;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Евгений on 10.10.2015.
 */

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
