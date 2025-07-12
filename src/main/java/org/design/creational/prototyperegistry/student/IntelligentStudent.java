package org.design.creational.prototyperegistry.student;

import org.design.creational.prototyperegistry.ObjectClonable;

public class IntelligentStudent extends  Student  {

    private int iqLevel;
    public IntelligentStudent(String name, String address, String email, String phoneNumber, String studentId,int iqLevel) {
        super(name, address, email, phoneNumber, studentId);
        this.iqLevel=iqLevel;
    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iqLevel = intelligentStudent.iqLevel;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

}
