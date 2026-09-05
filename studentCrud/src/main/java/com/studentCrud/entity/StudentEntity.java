package com.studentCrud.entity;

import jakarta.persistence.*;
import tools.jackson.databind.ser.jdk.JDKKeySerializers;

@Entity
@Table(name = "studentCrud")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String fname;
    private String lname;
    private String age;
    private String address;
    private String phone_no;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
}
