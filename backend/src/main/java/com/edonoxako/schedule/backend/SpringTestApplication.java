package com.edonoxako.schedule.backend;

import com.edonoxako.schedule.backend.group.GroupRepository;
import com.edonoxako.schedule.backend.group.StudentGroup;
import com.edonoxako.schedule.backend.lecturer.Lecturer;
import com.edonoxako.schedule.backend.lecturer.LecturerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringTestApplication {

    @Bean
    CommandLineRunner initGroups(GroupRepository groupRepository, LecturerRepository lecturerRepository) {
        return (args) -> {
            groupRepository.save(new StudentGroup("KИ11-11", "ИКИТ"));
            groupRepository.save(new StudentGroup("KИ11-12", "ИКИТ"));
            groupRepository.save(new StudentGroup("KИ11-13", "ИКИТ"));

            lecturerRepository.save(new Lecturer("Сергей", "Иванов", "Александрович"));
            lecturerRepository.save(new Lecturer("Иван", "Николаев", "Олегович"));
            lecturerRepository.save(new Lecturer("Константин", "Штуц", "Георгивевич"));
            lecturerRepository.save(new Lecturer("Леонид", "Иванов", "Тимофеевич"));
            lecturerRepository.save(new Lecturer("Адрей", "Андреев", "Андреевич"));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringTestApplication.class, args);
    }
}
