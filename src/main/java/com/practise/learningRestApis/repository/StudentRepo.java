package com.practise.learningRestApis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practise.learningRestApis.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity,Long> {

}