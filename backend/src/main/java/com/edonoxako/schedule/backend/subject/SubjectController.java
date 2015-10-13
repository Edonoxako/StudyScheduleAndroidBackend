package com.edonoxako.schedule.backend.subject;

import com.edonoxako.schedule.backend.lecturer.Lecturer;
import com.edonoxako.schedule.backend.lecturer.LecturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Евгений on 13.10.2015.
 */
public class SubjectController {

    @Autowired
    private SubjectRepository repository;

    @RequestMapping("/subject/{subjectId}")
    Subject findSubject(@PathVariable Long subjectId) {
        return repository.findOne(subjectId);
    }

    @RequestMapping("/subject")
    Iterable<Subject> findAllSubjects() {
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/subject")
    public ResponseEntity<?> add(@RequestBody Subject subject) {
        repository.save(subject);
        return new ResponseEntity(HttpStatus.OK);
    }

}
