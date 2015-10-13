package com.edonoxako.schedule.backend.lecturer;

import com.edonoxako.schedule.backend.group.StudentGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Евгений on 13.10.2015.
 */

@RestController
public class LecturerController {

    @Autowired
    private LecturerRepository repository;

    @RequestMapping("/lecturer/{lecturerId}")
    Lecturer findLecturer(@PathVariable Long lecturerId) {
        return repository.findOne(lecturerId);
    }

    @RequestMapping("/lecturer")
    Iterable<Lecturer> findAllLecturers() {
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/lecturer")
    public ResponseEntity<?> add(@RequestBody Lecturer lecturer) {
        repository.save(lecturer);
        return new ResponseEntity(HttpStatus.OK);
    }

}
