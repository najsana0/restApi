package com.studentCrud.repository;

import com.studentCrud.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {
    StudentEntity findByFname(String fname);
    StudentEntity findByLname(String lname);

}
