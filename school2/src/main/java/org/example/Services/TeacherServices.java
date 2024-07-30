package org.example.Services;

import org.example.Document.Student;
import org.example.Document.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherServices {
    List<Teacher> teachers= new ArrayList<>();


    public void create (String id , String name){
        teachers.add(new Teacher());
    }
    public Student update(int index , Student student){

        return student;
    }
    public List<Teacher> getstudent(int index){

        return teachers;
    }
    public Student retrive() {

        return (Student) teachers;
    }
    public void delete(int index){
        teachers.remove(index);
    }
}
