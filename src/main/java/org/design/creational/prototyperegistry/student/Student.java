package org.design.creational.prototyperegistry.student;

import org.design.creational.prototyperegistry.ObjectClonable;

public class Student  {

    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String studentId;

    public Student(String name, String address, String email, String phoneNumber, String studentId) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.studentId = studentId;
    }

    public Student(Student student) {
        this.name = student.name;
        this.address = student.address;
        this.email = student.email;
        this.phoneNumber = student.phoneNumber;
        this.studentId = student.studentId;
    }

   // @Override
    public Student clone() {
        return new Student(this);
    }
}
