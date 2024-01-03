package com.PostgreSQLProject.repository;


import com.PostgreSQLProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
