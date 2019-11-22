package com.example.esoftwarica.Model;

import java.util.ArrayList;
import java.util.List;

public class Students  {
    private String fullname, address, gender, age;
    private int img;
    private static List<Students> studentsList = new ArrayList<> ();

    public Students(String fullname, String address, String gender, String age, int img) {
        this.fullname = fullname;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.img = img;
    }

    public String getFullname() {
        return fullname;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public int getImg() {
        return img;
    }

    public static List<Students> getStudentsList() {
        return studentsList;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public static void setStudentsList(List<Students> studentsList) {
        Students.studentsList = studentsList;
    }
}
