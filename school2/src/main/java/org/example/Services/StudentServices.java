package org.example.Services;

import org.example.Document.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentServices {
    List<Student> students= new ArrayList<>();


    public void create (String id , String name , String address , String phone, Date dob){
        students.add(new Student());
    }
    public Student update(int index ,Student student){

        return student;
    }
    public List<Student> getstudent(int index){

        return students;
    }
    public Student retrive(int index) {

        return (Student) students;
    }
    public void delete(int index){
        students.remove(index);
    }
}
