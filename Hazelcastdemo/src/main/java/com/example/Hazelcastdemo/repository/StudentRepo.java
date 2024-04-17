package com.example.Hazelcastdemo.repository;

import com.example.Hazelcastdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer>{
}
