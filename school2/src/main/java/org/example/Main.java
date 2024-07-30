package org.example;

import org.example.Document.Student;
import org.example.Document.Teacher;
import org.example.Services.StudentServices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static List<Student> students = new ArrayList<>();

    static List<Teacher> teachers = new ArrayList<>();

    public static void addstudent(Student student){
        students.add(student);
    }
    public static void removestudent(String id) {
        int index;
        for (index = 0; index < students.size(); index++) {
            Student st = students.get(index);
            String idd = st.getId();
            if (idd.equals(id)) {
                students.remove(index);
                break;
            }
        }
    }
    public static String getStudentName(String id){
        for (Student st : students){
            if (st.getId().equals(id))
                return st.getName();
        }
        throw new RuntimeException("Student not found");
    }
    public static void addteacher(Teacher teacher){
        teachers.add(teacher);
    }
    public static void removeteacher(String id){
        int index;
        for (index=0;index<teachers.size();index++){
            Teacher tch =teachers.get(index);
            String idd =tch.getId();
            if (idd.equals(id)){
                teachers.remove(index);
                break;
            }
        }
    }
    public static String getteacher(String id){
        for (Teacher tch : teachers){
            if (tch.getId().equals(id))
                return tch.getName();
        }
        throw new RuntimeException("Teacher Not Found");
    }
    public static void main(String[] args) {

//        st.printstudent();
//        st.printstudent("1");
//        st.printstudent(new Date(System.currentTimeMillis()));
        StudentServices st =new StudentServices();
        st.create("1","hfd","jdfhdihbd","05495858",new Date(System.currentTimeMillis()));
        System.out.println(st);
    }
}