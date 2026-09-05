package com.studentCrud.controller;

import com.studentCrud.entity.StudentEntity;
import com.studentCrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/name")
    public String getName(){
        return "sana ";
    }

    @PostMapping("/SaveStudent")
    public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity){
        return studentService.saveStudent(studentEntity);

    }
    @GetMapping("/getAllStudentData")
    public List<StudentEntity> getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("/getByStudentId/{id}")
    public StudentEntity getById(@PathVariable Integer id){
        return studentService.getById(id);

    }
    @DeleteMapping("/deleteByStudentId/{id}")
    public String deleteById(@PathVariable Integer id){

        return studentService.deleteById(id);
    }

    @PutMapping("/updateByStudentId/{id}")
    public StudentEntity updateById(@PathVariable Integer id,@RequestBody StudentEntity studentEntity ){
        return studentService.updateById(id,studentEntity);
    }

    @GetMapping("/getByStudentFname/{fname}")
    public StudentEntity getByFname(@PathVariable String fname){
        return studentService.getByFname(fname);

    }
    @GetMapping("/getByStudentLname/{lname}")
    public StudentEntity getByLname(@PathVariable String lname){
        return studentService.getByLname(lname);

    }
    @PostMapping("/addMultipulStudentData")
    public List<StudentEntity> addMultipulStudent(@RequestBody List<StudentEntity> studentList) {

        return studentService.addMultipulStudent(studentList);
    }

}
