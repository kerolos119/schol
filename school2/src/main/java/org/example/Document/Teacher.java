package org.example.Document;

import java.util.Date;
import java.util.List;

public class Teacher  extends User{

    public Teacher(String id, String name, String address, String phone, Date dob, List<String> classes, String subject){
        super(id,name,address,phone,dob);
        this.classes=classes;
        this.subject=subject;
    }
    private List<String>classes;
    private String subject;

    public Teacher() {
        super();
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    @Override
    public void setDob(Date dob) {
        super.setDob(dob);
    }



}
