package com.edonoxako.schedule.backend.group;

import org.jboss.logging.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.acl.Group;
import java.util.Collection;
import java.util.List;

/**
 * Created by Евгений on 13.10.2015.
 */

@RestController
public class GroupRestController {

    @Autowired
    private GroupRepository groupRepository;

    @RequestMapping("/group/{groupId}")
    public StudentGroup findGroup(@PathVariable Long groupId) {
        return groupRepository.findOne(groupId);
    }

    @RequestMapping("/group")
    public Iterable<StudentGroup> findAllGroups() {
        return groupRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/group")
    public ResponseEntity<?> add(@RequestBody StudentGroup group) {
        groupRepository.save(group);
        return new ResponseEntity(HttpStatus.OK);
    }

}
