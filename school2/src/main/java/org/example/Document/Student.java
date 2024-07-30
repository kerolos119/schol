package org.example.Document;

import java.util.Date;

public class Student extends User {


    public Student(String id, String name, String address, String phone, Date dob, String clss) {
        super(id, name, address, phone, dob);
        this.clss=clss;
    }
    private String clss;

    public Student() {
        super();
    }

    public String getClss() {
        return clss;
    }

    public void setClss(String clss) {
        this.clss = clss;
    }

    @Override
    public String toString() {
        return super.toString()+"|"+getClss();
    }
}
