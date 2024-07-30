package org.example.Document;

import java.util.Date;

public class User {
    User(String id , String name , String address , String phone, Date dob){
        this.id=id;
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.dob=dob;
    }


    private String id;
    private String name;
    private String address;
    private String phone;
    private Date dob;

    public User() {

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return getId()+"|"+getName()+"|"+getAddress()+"|"+getPhone()+"|"+getDob();
    }

}
