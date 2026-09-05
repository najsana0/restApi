package com.studentCrud.service;

import com.studentCrud.entity.StudentEntity;
import com.studentCrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public StudentEntity saveStudent(StudentEntity studentEntity){
        return studentRepository.save(studentEntity);

    }
    public List<StudentEntity> getAllStudent(){
        return (List<StudentEntity>) studentRepository.findAll();
    }
    public StudentEntity getById(Integer id){
        return studentRepository.findById(id).get();

    }
    public String deleteById(Integer id){
        studentRepository.deleteById(id);
        return "Data Deleted";

    }
    public StudentEntity updateById(Integer id, StudentEntity studentEntity){
        studentEntity.setId(id);
        return studentRepository.save(studentEntity);

    }
    public StudentEntity getByFname(String fname){
        return studentRepository.findByFname(fname);
    }
    public StudentEntity getByLname(String lname){

        return studentRepository.findByLname(lname);
    }

    public List<StudentEntity> addMultipulStudent(List<StudentEntity> studentList) {
        return (List<StudentEntity>) studentRepository.saveAll(studentList);
    }


}
