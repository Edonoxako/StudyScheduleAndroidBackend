package com.edonoxako.schedule.backend.lecturer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LecturerRepository  extends CrudRepository<Lecturer, Long> {
}
